package com.proyecto.cita.jwt;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtValidator {

    @Value("{jwt.secretKey}")
    private String key;
    private static final String PREFIX = "Bearer ";

    public boolean validateJwtToken(String token) {
        try {
            if (token != null) {
                token = token.replace(PREFIX, "");
            }
            Jwts.parser().setSigningKey(key.getBytes()).parseClaimsJwt(token).getBody();
            return true;
        } catch (Exception e) {
            //TODO: SE DEBE RETORNAR UNA EXCEPCIÓN PERSONALIZADA
            return false;
        }
    }

    public String getSubject(String token){
        String validToken = token.replace(PREFIX, "");
        Claims claims =Jwts.parser().setSigningKey(key.getBytes()).parseClaimsJws(validToken).getBody();
        return claims.getSubject();
    }

}
