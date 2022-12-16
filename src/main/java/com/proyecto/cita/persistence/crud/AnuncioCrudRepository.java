package com.proyecto.cita.persistence.crud;

import com.proyecto.cita.persistence.entity.Anuncio;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnuncioCrudRepository extends CrudRepository<Anuncio, Integer> {

    @Query("SELECT * FROM anuncio WHERE id_usuario = :idUser")
    List<Anuncio> getAnuncioByUser(@Param("idUser") Integer idUser);
}
