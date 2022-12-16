package com.proyecto.cita.persistence.crud;

import com.proyecto.cita.persistence.entity.Usuario;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AuthCrudRepository extends CrudRepository<Usuario, Integer> {

    @Query("select * from data_dream.usuario where usuario.user_name = :userName")
    Usuario getUserByUserName(@Param("userName") String userName);
}
