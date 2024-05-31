package org.agenda.controlador;

import java.util.List;

import org.agenda.modelo.Contactos;

public class UserSession {
    private static UserSession instance;
    private String correo;
    private List<Contactos> contactos;

    private UserSession() {
    }

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Contactos> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contactos> contactos) {
        this.contactos = contactos;
    }

    public void logout() {
        correo = null;
        contactos = null;
        instance = null;
    }
}
