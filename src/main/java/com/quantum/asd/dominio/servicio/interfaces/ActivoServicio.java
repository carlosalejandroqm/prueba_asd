package com.quantum.asd.dominio.servicio.interfaces;

import com.quantum.asd.dominio.modelo.ActivoDTO;

import java.util.Date;
import java.util.List;

public interface ActivoServicio {
    public abstract ActivoDTO obtenerActivoPorId(Integer id);

    public abstract  ActivoDTO  guardar( ActivoDTO activoDTO );

    public abstract  void eliminar( Integer  id);

    public abstract List<ActivoDTO>  buscarActivoPorTipo(Integer tipo);

    public abstract   List<ActivoDTO>  buscarActivoPorFechaCompra(Date fechaDeCompra);

    public abstract ActivoDTO buscarActivoPorSerial( Integer serial);

}
