package com.quantum.asd.dominio.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.Date;

@Data
@AllArgsConstructor
public class ActivoDTO {
    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer tipo ;
    private Integer serial;
    private Integer nroInventario;
    private Integer peso;
    private Integer largo;
    private Integer ancho;
    private Integer alto;
    private Integer valorCompra;
    private Date fechaCompra;
    private PersonaDTO persona;
    private AreaDTO area;


}
