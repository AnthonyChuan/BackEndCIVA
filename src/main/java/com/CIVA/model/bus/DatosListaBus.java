package com.CIVA.model.bus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public record DatosListaBus(Long id,
                            int numeroBus,
                            String placa,
                            LocalDateTime fechaCreacion,
                            String caracteristicas,
                            String marca,
                            Boolean activo
){
    public DatosListaBus(Bus bus){
        this(   bus.getId(),
                bus.getNumeroBus(),
                bus.getPlaca(),
                bus.getFechaCreacion(),
                bus.getCaracteristicas(),
                bus.getMarca().getNombreMarca(),
                bus.getActivo());
    }
}
