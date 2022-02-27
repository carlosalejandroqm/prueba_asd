package com.quantum.asd.dominio.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AreaDTO {
    private Integer id;
    private String nombre;
    private CiudadDTO ciudad;
}
