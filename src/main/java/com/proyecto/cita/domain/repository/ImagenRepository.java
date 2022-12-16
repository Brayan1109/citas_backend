package com.proyecto.cita.domain.repository;

import com.proyecto.cita.persistence.entity.Imagen;

import java.util.List;

public interface ImagenRepository {

    List<Imagen> getImagenByAnuncio(Integer idAnuncio);

    Imagen saveImagen(Imagen imagen);


}
