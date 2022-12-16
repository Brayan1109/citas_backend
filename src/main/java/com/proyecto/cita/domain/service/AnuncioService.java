package com.proyecto.cita.domain.service;


import com.proyecto.cita.domain.repository.AnuncioRepository;
import com.proyecto.cita.domain.repository.ImagenRepository;
import com.proyecto.cita.domain.response.AnuncioImagenResponse;
import com.proyecto.cita.persistence.entity.Anuncio;
import com.proyecto.cita.persistence.entity.Imagen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnuncioService {

    @Autowired
    AnuncioRepository anuncioRepository;

    @Autowired
    private ImagenRepository imagenRepository;

    public List<Anuncio> getListAnuncio(Integer idUser){
        List<Anuncio> anuncioList = anuncioRepository.getAnuncioById(idUser);
        if(anuncioList.isEmpty()){
            return null;
        }

        return anuncioList;
    }

    public List<AnuncioImagenResponse> getListAnuncioImagen(Integer idUser) {
        List<Anuncio> anuncioList = anuncioRepository.getAnuncioById(idUser);
        List<AnuncioImagenResponse> anuncioImagenResponses = new ArrayList<>();

        for (Anuncio anuncio : anuncioList) {
            Integer idAnuncio = anuncio.getIdAnuncio();
            List<Imagen> imagenList = imagenRepository.getImagenByAnuncio(idAnuncio);
            AnuncioImagenResponse anuncioImagenResponse = new AnuncioImagenResponse();
            anuncioImagenResponse.setIdAnuncio(anuncio.getIdAnuncio());
            anuncioImagenResponse.setTitulo(anuncio.getTitulo());
            anuncioImagenResponse.setValorServicio(anuncio.getValorServicio());
            anuncioImagenResponse.setImagenList(imagenList);
            anuncioImagenResponses.add(anuncioImagenResponse);
        }
        return anuncioImagenResponses;

    }

}
