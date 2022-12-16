package com.proyecto.cita.web.controller;

import com.proyecto.cita.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value="/user/{idUser}")
    public ResponseEntity<Object> getUserById(final @PathVariable("idUser") Integer idUser){
        return ResponseEntity.ok()
                .body(usuarioService.getUserById(idUser));
    }

}
