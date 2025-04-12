package com.CIVA.model.marcaBus;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "marca_bus")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MarcaBus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreMarca;


    public MarcaBus(MarcaBus marca) {
        this.nombreMarca=marca.nombreMarca;
    }
}
