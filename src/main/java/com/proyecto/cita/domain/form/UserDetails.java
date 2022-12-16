package com.proyecto.cita.domain.form;


public class UserDetails {
    private String userName;

    public UserDetails(String userName){
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
