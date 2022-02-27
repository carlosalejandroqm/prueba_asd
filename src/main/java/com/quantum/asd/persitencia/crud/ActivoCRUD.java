package com.quantum.asd.persitencia.crud;

import com.quantum.asd.persitencia.entidad.Activo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivoCRUD extends JpaRepository<Activo,Integer> {
}
