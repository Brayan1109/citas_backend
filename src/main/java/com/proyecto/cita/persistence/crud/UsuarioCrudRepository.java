package com.proyecto.cita.persistence.crud;

import com.proyecto.cita.persistence.entity.Anuncio;
import com.proyecto.cita.persistence.entity.Usuario;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {

    @Query("SELECT * from usuario where id_usuario = :idUser")
    Usuario getUserById(@Param("idUser") Integer idUser);



}
