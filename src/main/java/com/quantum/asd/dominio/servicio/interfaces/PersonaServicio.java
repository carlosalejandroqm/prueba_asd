package com.quantum.asd.dominio.servicio.interfaces;

import com.quantum.asd.dominio.modelo.PersonaDTO;

public interface PersonaServicio {
    public abstract PersonaDTO obtenerPersonaPorId(Integer id);

}
