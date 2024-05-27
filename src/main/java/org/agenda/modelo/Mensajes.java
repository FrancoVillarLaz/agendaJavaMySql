package org.agenda.modelo;

import java.util.Date;

public class Mensajes {
    private int id;
    private String asunto;
    private String mensaje;
    private Date fechaHora;


    
    public Mensajes(int id, String asunto, String mensaje, Date fechaHora) {
        this.id = id;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAsunto() {
        return asunto;
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public Date getFechaHora() {
        return fechaHora;
    }
    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    
}
