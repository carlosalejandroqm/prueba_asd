package com.quantum.asd.persitencia.crud;

import com.quantum.asd.persitencia.entidad.Area;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaCRUD extends JpaRepository<Area, Integer> {
}
