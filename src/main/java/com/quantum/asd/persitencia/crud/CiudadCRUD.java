package com.quantum.asd.persitencia.crud;

import com.quantum.asd.persitencia.entidad.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadCRUD extends JpaRepository<Ciudad,Integer> {

}
