package com.proyecto.cita.persistence.entity;

import java.io.Serializable;

public class Imagen implements Serializable {
    private Integer idImagen;
    private String nameImagen;

    private String typeFile;

    private String pathImage;

    public String getTypeFile() {
        return typeFile;
    }

    public void setTypeFile(String typeFile) {
        this.typeFile = typeFile;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    private Integer idAnuncio;

    public Integer getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public String getNameImagen() {
        return nameImagen;
    }

    public void setNameImagen(String nameImagen) {
        this.nameImagen = nameImagen;
    }

    public Integer getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(Integer idAnuncio) {
        this.idAnuncio = idAnuncio;
    }
}
