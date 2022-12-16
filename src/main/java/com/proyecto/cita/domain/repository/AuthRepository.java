package com.proyecto.cita.domain.repository;

import com.proyecto.cita.persistence.entity.Usuario;

public interface AuthRepository {

    Usuario getUserByUserName(String UserName);
}
