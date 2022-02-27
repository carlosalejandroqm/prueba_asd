package com.quantum.asd.dominio.servicio.implementacion;

import com.quantum.asd.dominio.modelo.ActivoDTO;
import com.quantum.asd.dominio.repositorio.ActivoRepositorio;
import com.quantum.asd.dominio.servicio.interfaces.ActivoServicio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class ActivoServicioImpl implements ActivoServicio {

    @Autowired
    ActivoRepositorio activoRepositorio;

    @Override
    public ActivoDTO obtenerActivoPorId(Integer id) {
        return null;
    }

    @Override
    public ActivoDTO guardar(ActivoDTO activoDTO) {
        ActivoDTO  newActivo  = activoRepositorio.guardar(activoDTO).get();
        return newActivo;
    }

    @Override
    public void eliminar(Integer id) {
        activoRepositorio.eliminar(id);
    }

    @Override
    public List<ActivoDTO> buscarActivoPorTipo(Integer tipo) {
        return null;
    }

    @Override
    public List<ActivoDTO> buscarActivoPorFechaCompra(Date fechaDeCompra) {
        return null;
    }

    @Override
    public ActivoDTO buscarActivoPorSerial(Integer serial) {
        return null;
    }
}
