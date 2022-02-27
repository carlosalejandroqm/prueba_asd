package com.quantum.asd.dominio.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class PersonaDTO {
    private Integer id;
    private String documento;
    private String nombre;
}
