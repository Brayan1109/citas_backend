package com.proyecto.cita.domain.repository;

import com.proyecto.cita.persistence.entity.Anuncio;

import java.util.List;

public interface AnuncioRepository {

    List<Anuncio> getAnuncioById(Integer idUser);
}
