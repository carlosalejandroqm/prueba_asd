package com.quantum.asd.persitencia.entidad;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "activo")
public class Activo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private Integer tipo ;

    @Column(unique = true)
    private Integer serial;

    @Column
    private Integer nroInventario;

    @Column
    private Integer peso;


    @Column
    private Integer largo;

    @Column
    private Integer ancho;

    @Column
    private Integer alto;

    @Column
    private Integer valorCompra;

    @Column
    private Date fechaCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona", nullable = false)
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "area", nullable = false)
    private Area area;





}
