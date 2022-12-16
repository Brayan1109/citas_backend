package com.proyecto.cita.domain.repository;

import com.proyecto.cita.persistence.entity.Anuncio;
import com.proyecto.cita.persistence.entity.Usuario;

public interface UsuarioRepository {
    Usuario getUserById(Integer id);

}
