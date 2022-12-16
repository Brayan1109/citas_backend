package com.proyecto.cita.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.proyecto.cita.domain.response.UsuarioAnuncioResponse;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.util.List;


@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @Column("id_usuario")
    private Integer idUsuario;
    @Column("user_name")
    private String userName;
    private String correo;
    private String password;
    private String telefono;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public UsuarioAnuncioResponse toDomain(List<Anuncio> anuncioList){
        return new UsuarioAnuncioResponse(this.idUsuario, this.userName, this.telefono, anuncioList);
    }
}
