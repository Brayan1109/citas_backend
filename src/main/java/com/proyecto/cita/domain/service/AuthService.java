package com.proyecto.cita.domain.service;

import com.proyecto.cita.domain.form.AutenticationRequest;
import com.proyecto.cita.domain.form.UserDetails;
import com.proyecto.cita.domain.repository.AuthRepository;
import com.proyecto.cita.domain.response.AutenticationResponse;
import com.proyecto.cita.exception.BadParameterException;
import com.proyecto.cita.jwt.JwtUtil;
import com.proyecto.cita.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    AuthRepository authRepository;

    @Autowired
    JwtUtil jwtUtil;

    public String validateCredencial(AutenticationRequest autenticationRequest){

        Usuario usuario = validateUserIdDataBase(autenticationRequest.getUserName());
        validateUserPassword(autenticationRequest.getPassword(), usuario.getPassword());

        return jwtUtil.generateToken(new UserDetails(autenticationRequest.getUserName()));
    }

    private Usuario validateUserIdDataBase(String userName){
        Usuario usuario = authRepository.getUserByUserName(userName);
        if(usuario == null){
            throw new BadParameterException("El usuario ingresado no existe");
        }
        return usuario;
    }

    private void validateUserPassword(String passwordRequest, String passwordDb){
        if(!passwordDb.equals(passwordRequest)){
            throw new BadParameterException("Contraseña invalida");
        }
    }


}
