package com.quantum.asd.persitencia.crud;

import com.quantum.asd.persitencia.entidad.Activo;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ActivoCRUD extends JpaRepository<Activo,Integer> {

    Optional<List<Activo>> findByFechaCompra(Date fechaCompra);

    Optional<List<Activo>> findByTipo(Integer tipo);

    Optional<Activo> findBySerial(Integer serial);

}
