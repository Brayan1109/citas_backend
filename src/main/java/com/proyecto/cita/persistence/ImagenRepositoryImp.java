package com.proyecto.cita.persistence;

import com.proyecto.cita.domain.repository.ImagenRepository;
import com.proyecto.cita.persistence.crud.ImagenCrudRepository;
import com.proyecto.cita.persistence.entity.Imagen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImagenRepositoryImp implements ImagenRepository {

    @Autowired
    ImagenCrudRepository imagenCrudRepository;

    public List<Imagen> getImagenByAnuncio(Integer idAnuncio){
        return imagenCrudRepository.getImagenByAnuncio(idAnuncio);
    }

    @Override
    public Imagen saveImagen(Imagen imagen) {
        imagenCrudRepository.saveImagen(imagen.getNameImagen(),
                imagen.getIdAnuncio(), imagen.getPathImage(), imagen.getTypeFile());

        return  imagen;
    }
}
