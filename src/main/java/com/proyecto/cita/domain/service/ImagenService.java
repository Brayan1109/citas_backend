package com.proyecto.cita.domain.service;

import com.proyecto.cita.domain.repository.ImagenRepository;
import com.proyecto.cita.persistence.entity.Imagen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Service
public class ImagenService {

    private String path = "C:/Users/User/Desktop/Proyectos/proyecto citas/cita_backend/file/";

    @Autowired
    ImagenRepository imagenRepository;

    public Imagen uploadImage(MultipartFile file, Integer idAnuncio) throws IOException {

        String filePath = path + file.getOriginalFilename();

        Imagen imagen = new Imagen();
        imagen.setNameImagen(file.getOriginalFilename());
        imagen.setPathImage(filePath);
        imagen.setIdAnuncio(idAnuncio);
        imagen.setTypeFile(file.getContentType());
        file.transferTo(new File(filePath));
        Imagen imagenRes = imagenRepository.saveImagen(imagen);

        return imagenRes;
    }

    public byte[] downloadImageFromFileSystem(String fileName) throws IOException {
        byte[] image = Files.readAllBytes(new File("C:/Users/User/Desktop/Proyectos/proyecto citas/cita_backend/file/" + fileName).toPath());
        return image;
    }

}
