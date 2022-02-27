package com.quantum.asd.dominio.servicio.interfaces;

import com.quantum.asd.dominio.modelo.CiudadDTO;

public interface CiudadServicio {
    public abstract CiudadDTO obtenerCiudadPorId(Integer id);
}
