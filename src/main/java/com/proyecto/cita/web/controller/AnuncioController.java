package com.proyecto.cita.web.controller;

import com.proyecto.cita.domain.service.AnuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anuncio")
public class AnuncioController {

    @Autowired
    AnuncioService anuncioService;

    @GetMapping(value = "/{idUser}")
    public ResponseEntity<Object> getListAnuncioByUser(final @PathVariable("idUser") Integer idUser){
        return  ResponseEntity.ok()
                .body(anuncioService.getListAnuncio(idUser));
    }

    @GetMapping(value = "/list/{idUser}")
    public ResponseEntity<Object> getListAnuncioImageByUser(final @PathVariable("idUser") Integer idUser){
        return  ResponseEntity.ok()
                .body(anuncioService.getListAnuncioImagen(idUser));
    }

}
