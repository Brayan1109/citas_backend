package com.proyecto.cita.domain.service;

import com.proyecto.cita.domain.repository.ImagenRepository;
import com.proyecto.cita.domain.repository.UsuarioRepository;
import com.proyecto.cita.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario getUserById(Integer idUser){
        return usuarioRepository.getUserById(idUser);
    }


}
