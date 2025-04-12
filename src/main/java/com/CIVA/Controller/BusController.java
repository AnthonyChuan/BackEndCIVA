package com.CIVA.Controller;

import com.CIVA.Service.BusService;
import com.CIVA.model.bus.Bus;
import com.CIVA.model.bus.DatosListaBus;
import com.CIVA.model.bus.DatosRegistroBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping
    public ResponseEntity<List<DatosListaBus>> getBuses(@PageableDefault (size = 3)Pageable paginacion){
        Page<DatosListaBus> page = busService.getBuses(paginacion);
        return ResponseEntity.ok(page.getContent());
    }

    @GetMapping(path = "/{id}")
    public List<DatosListaBus> getBusById(@PathVariable("id") Long id){
        return busService.getBusId(id);
    }

    @PostMapping
    public ResponseEntity<DatosListaBus> registrarBus(@RequestBody DatosRegistroBus bus){
        return busService.registrarBus(bus);
    }


}
