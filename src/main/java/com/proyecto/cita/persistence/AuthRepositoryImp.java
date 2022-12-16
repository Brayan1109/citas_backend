package com.proyecto.cita.persistence;

import com.proyecto.cita.domain.repository.AuthRepository;
import com.proyecto.cita.persistence.crud.AuthCrudRepository;
import com.proyecto.cita.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AuthRepositoryImp implements AuthRepository {

    @Autowired
    AuthCrudRepository authCrudRepository;

    @Override
    public Usuario getUserByUserName(String userName) {
        return authCrudRepository.getUserByUserName(userName);
    }
}
