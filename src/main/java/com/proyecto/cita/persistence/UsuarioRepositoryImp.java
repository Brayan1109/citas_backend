package com.proyecto.cita.persistence;

import com.proyecto.cita.domain.repository.UsuarioRepository;
import com.proyecto.cita.persistence.crud.UsuarioCrudRepository;
import com.proyecto.cita.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepositoryImp implements UsuarioRepository {

    @Autowired
    UsuarioCrudRepository usuarioCrudRepository;

    @Override
    public Usuario getUserById(Integer id) {
        return usuarioCrudRepository.findById(id).get();
    }

}
