package com.quantum.asd.persitencia.mapeador;

public interface Mapeador<E,D> {
    E convertirEntidad(D dto);
    D convertirDTO( E entidad);
}
