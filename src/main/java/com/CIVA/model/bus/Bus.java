package com.CIVA.model.bus;

import com.CIVA.model.marcaBus.MarcaBus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="bus")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private int numeroBus;
    @Column(nullable = false,unique = true)
    private String placa;
    @Column(updatable = false)
    private LocalDateTime fechaCreacion;
    @Column
    private String caracteristicas;
    @ManyToOne
    @JoinColumn(name = "marca_Bus_id", nullable = false)
    private MarcaBus marca;
    @Column
    private Boolean activo;

    public Bus( int numeroBus, String placa, String caracteristicas, MarcaBus marca) {

        this.numeroBus = numeroBus;
        this.placa = placa;
        this.caracteristicas = caracteristicas;
        this.fechaCreacion = LocalDateTime.now();
        this.activo = true;
        this.marca = marca;
    }
}
