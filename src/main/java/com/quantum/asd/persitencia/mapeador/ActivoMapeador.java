package com.quantum.asd.persitencia.mapeador;

import com.quantum.asd.dominio.modelo.ActivoDTO;
import com.quantum.asd.dominio.modelo.AreaDTO;
import com.quantum.asd.dominio.modelo.PersonaDTO;
import com.quantum.asd.persitencia.entidad.Activo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class ActivoMapeador implements Mapeador<Activo, ActivoDTO> {

    @Autowired
    private PersonaMapeador personaMapeador ;
    @Autowired
    private AreaMapeador areaMapeador ;

    @Override
    public Activo convertirEntidad(ActivoDTO dto) {
        return new Activo(

            dto.getId(),
            dto.getNombre(),
            dto.getDescripcion(),
            dto.getTipo() ,
            dto.getSerial(),
            dto.getNroInventario(),
            dto.getPeso(),
            dto.getLargo(),
            dto.getAncho(),
            dto.getAlto(),
            dto.getValorCompra(),
            dto.getFechaCompra(),
            personaMapeador.convertirEntidad(dto.getPersona()),
            areaMapeador.convertirEntidad(dto.getArea())
        );
    }

    @Override
    public ActivoDTO convertirDTO(Activo entidad) {
        return new ActivoDTO(
                entidad.getId(),
                entidad.getNombre(),
                entidad.getDescripcion(),
                entidad.getTipo() ,
                entidad.getSerial(),
                entidad.getNroInventario(),
                entidad.getPeso(),
                entidad.getLargo(),
                entidad.getAncho(),
                entidad.getAlto(),
                entidad.getValorCompra(),
                entidad.getFechaCompra(),
                personaMapeador.convertirDTO(entidad.getPersona()),
                areaMapeador.convertirDTO(entidad.getArea())
        );
    }
}
