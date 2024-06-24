package org.agenda.modelo;

public class Contactos {
    private int id;
    private String DNI;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private String localidad;

    // Constructor para crear un nuevo contacto
    public Contactos(String DNI, String nombre, String apellido, String correo, String direccion, String localidad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.localidad = localidad;
    }

    // Constructor para leer desde la base de datos
    public Contactos(int id, String DNI, String nombre, String apellido, String correo, String direccion, String localidad) {
        this.id = id;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.localidad = localidad;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }
}