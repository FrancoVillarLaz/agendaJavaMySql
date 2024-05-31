package org.agenda.modelo;

import java.util.List;

public class Usuarios {
    private String nombre;
    private String contraseña;
    private String correo; 
    private List<Contactos> contactos;

    
    public Usuarios() {
    }
    public Usuarios(String nombre, String contraseña, String correo) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correo = correo;
    }
    public Usuarios(String nombre, String contraseña, String correo, List<Contactos> contactos) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correo = correo;
        this.contactos = contactos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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

    
}