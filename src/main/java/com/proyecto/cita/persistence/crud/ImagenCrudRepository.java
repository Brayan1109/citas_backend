package com.proyecto.cita.persistence.crud;

import com.proyecto.cita.persistence.entity.Imagen;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ImagenCrudRepository extends CrudRepository<Imagen, Integer> {

    @Query("select * from imagen where id_anuncio = :idAnuncio")
    List<Imagen> getImagenByAnuncio(@Param("idAnuncio") Integer idAnuncio);

    @Modifying
    @Query("insert into imagen(name_imagen, id_anuncio, path_image, type_file) " +
            "values(:nameImagen, :idAnuncio, :pathImagen, :typeFile)")
    void saveImagen(@Param("nameImagen") String nameImagen, @Param("idAnuncio") Integer idAnuncio,
                      @Param("pathImagen") String pathImagen, @Param("typeFile") String typeFile);

}
