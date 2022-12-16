package com.proyecto.cita.persistence;

import com.proyecto.cita.domain.repository.AnuncioRepository;
import com.proyecto.cita.persistence.crud.AnuncioCrudRepository;
import com.proyecto.cita.persistence.entity.Anuncio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnuncioRepositoryImp implements AnuncioRepository {

    @Autowired
    AnuncioCrudRepository anuncioCrudRepository;

    @Override
    public List<Anuncio> getAnuncioById(Integer idUser) {
        return anuncioCrudRepository.getAnuncioByUser(idUser);
    }
}
