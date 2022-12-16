package com.proyecto.cita.domain.response;

import com.proyecto.cita.persistence.entity.Anuncio;

import java.io.Serializable;
import java.util.List;

public class UsuarioAnuncioResponse implements Serializable {

    private Integer idUser;
    private String userName;
    private String telefono;

    public UsuarioAnuncioResponse(Integer idUser, String userName, String telefono, List<Anuncio> anuncioList){
        this.idUser = idUser;
        this.userName = userName;
        this.telefono = telefono;
        this.anuncioList = anuncioList;
    }

    public UsuarioAnuncioResponse(){}

    private List<Anuncio> anuncioList;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Anuncio> getAnuncioList() {
        return anuncioList;
    }

    public void setAnuncioList(List<Anuncio> anuncioList) {
        this.anuncioList = anuncioList;
    }
}
