package com.quantum.asd.dominio.repositorio;

import com.quantum.asd.dominio.modelo.ActivoDTO;
import com.quantum.asd.persitencia.crud.ActivoCRUD;
import com.quantum.asd.persitencia.entidad.Activo;
import com.quantum.asd.persitencia.mapeador.ActivoMapeador;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ActivoRepositorio {

    @Autowired
    private ActivoCRUD activoCRUD;

    @Autowired
    private ActivoMapeador activoMapeador;

    public Optional<ActivoDTO> obtenerPorId(Integer id){
        Optional<Activo> activo = activoCRUD.findById(id);
        return Optional.ofNullable(activoMapeador.convertirDTO(activo.get()));
    }



    public Optional<ActivoDTO> guardar(ActivoDTO activoDTO){
        Activo activo = activoMapeador.convertirEntidad(activoDTO);
        return Optional.of(activoMapeador.convertirDTO(activoCRUD.save(activo)));
    }

    public void eliminar(Integer id){
        activoCRUD.deleteById(id);
    }


    public List<ActivoDTO> buscarActivoPorTipo(Integer tipo){
        List<Activo> listaActivo = activoCRUD.findByTipo(tipo).get();
        List<ActivoDTO> listaActivoRetorno = new ArrayList<>();
        listaActivo.forEach(activo -> {
            ActivoDTO activoDTO = activoMapeador.convertirDTO(activo);
            listaActivoRetorno.add(activoDTO);
        });
        return listaActivoRetorno;
    }

    public List<ActivoDTO> buscarActivoPorFechaCompra(Date fechaCompra){
        List<Activo> listaActivo = activoCRUD.findByFechaCompra(fechaCompra).get();
        List<ActivoDTO> listaActivoRetorno = new ArrayList<>();
        listaActivo.forEach(activo -> {
            ActivoDTO activoDTO = activoMapeador.convertirDTO(activo);
            listaActivoRetorno.add(activoDTO);
        });
        return listaActivoRetorno;
    }

        public Optional<ActivoDTO> buscarActivoPorSerial(Integer serial){
        Optional<Activo> activo = activoCRUD.findBySerial(serial);
        if(!activo.isEmpty()){
            return Optional.ofNullable(activoMapeador.convertirDTO(activo.get()));
        }
        return null;
    }


}
