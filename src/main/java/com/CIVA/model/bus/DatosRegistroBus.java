package com.CIVA.model.bus;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroBus(
        @Min(1)
        int numeroBus,
        @NotBlank
        String placa,
        @NotBlank
        String caracteristicas,
        @Valid
        Long marcaId,
        Boolean activo
) {
}
