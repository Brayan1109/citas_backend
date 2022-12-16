package com.proyecto.cita.web.controller;

import com.proyecto.cita.domain.service.ImagenService;
import com.proyecto.cita.persistence.entity.Imagen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/imagen")
public class ImagenController {

    @Autowired
    ImagenService imagenService;

    @PostMapping(value = "/save-image/{idAnuncio}")
    ResponseEntity<Object> saveImage(@RequestBody MultipartFile image,
                                     @PathVariable("idAnuncio")Integer idAnuncio){
        try{
            Imagen res = imagenService.uploadImage(image, idAnuncio);
            return ResponseEntity.ok()
                    .body(res);
        }catch (IOException Ioe){
            return ResponseEntity.ok()
                    .body("Error al guardar imagen");
        }
    }

    @GetMapping(value = "/download/{fileName}")
    ResponseEntity<Object> downloadImage(@PathVariable("fileName") String fileName){
        try{
            byte[] res = imagenService.downloadImageFromFileSystem(fileName);
            return ResponseEntity.ok()
                    .contentType(MediaType.valueOf("image/png"))
                    .body(res);
        }catch (IOException Ioe){
            return ResponseEntity.ok()
                    .body("Error al cargar imagen");
        }
    }
}
