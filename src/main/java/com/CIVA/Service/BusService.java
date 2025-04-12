package com.CIVA.Service;

import com.CIVA.model.bus.Bus;
import com.CIVA.Repositories.BusRepository;
import com.CIVA.model.bus.DatosListaBus;
import com.CIVA.model.bus.DatosRegistroBus;
import com.CIVA.model.marcaBus.MarcaBus;
import com.CIVA.Repositories.MarcaBusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BusService {

    @Autowired
    private final BusRepository busRepository;
    private final MarcaBusRepository marcaBusRepository;

    public ResponseEntity<DatosListaBus> registrarBus(DatosRegistroBus datos){
        MarcaBus marca= marcaBusRepository.findById(datos.marcaId())
                .orElseThrow(()->new RuntimeException("Marca no encontrada"));
        Bus bus =new Bus(
                datos.numeroBus(),
                datos.placa(),
                datos.caracteristicas(),
                marca
        );
        Bus busguardado=busRepository.save(bus);
        return ResponseEntity.ok(new DatosListaBus(busguardado));
    }

    public Page<DatosListaBus> getBuses(Pageable paginacion){
        return busRepository.findAll(paginacion).map(DatosListaBus::new);
    }

    public List<DatosListaBus> getBusId(Long id){
        return busRepository.findById(id).stream().map(DatosListaBus::new).toList();
    }
}
