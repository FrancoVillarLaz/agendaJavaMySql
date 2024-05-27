package org.agenda.modelo;

import java.util.List;

public class Usuarios {
    private String dni;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String correo;
    private String direccion;
    private String codigoPostal;
    private List<Contactos> contactos;

    

    
    public Usuarios(String dni, String nombre, String apellido, String contraseña, String correo, String direccion,
            String codigoPostal, List<Contactos> contactos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.correo = correo;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.contactos = contactos;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public List<Contactos> getContactos() {
        return contactos;
    }
    public void setContactos(List<Contactos> contactos) {
        this.contactos = contactos;
    }
    
}