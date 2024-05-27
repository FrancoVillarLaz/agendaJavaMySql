package org.agenda.modelo;

import java.util.List;

public class Contactos {
   private int id;
   private String DNI;
   private String nombre;
   private String apellido;
   private String correo;
   private String direccion;
   private String localidad;
   private List<Usuarios> usuario;
   
public Contactos() {
}

public Contactos(String dNI, String nombre, String apellido, String correo, String direccion, String localidad) {
    this.DNI = dNI;
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo;
    this.direccion = direccion;
    this.localidad = localidad;
}

public Contactos(int id,String DNI, String nombre, String apellido, String correo, String direccion, String localidad) {
    this.id = id;
    this.DNI = DNI;
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo;
    this.direccion = direccion;
    this.localidad = localidad;
}

public Contactos(int id,String DNI, String nombre, String apellido, String correo, String direccion, String localidad,
        List<Usuarios> usuario) {
    this.id = id;
    this.DNI = DNI;
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo;
    this.direccion = direccion;
    this.localidad = localidad;
    this.usuario = usuario;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
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
public String getLocalidad() {
    return localidad;
}
public void setLocalidad(String localidad) {
    this.localidad = localidad;
}
public List<Usuarios> getUsuario() {
    return usuario;
}
public void setUsuario(List<Usuarios> usuario) {
    this.usuario = usuario;
}

public String getDNI() {
    return DNI;
}

public void setDNI(String dNI) {
    DNI = dNI;
}

   
}
