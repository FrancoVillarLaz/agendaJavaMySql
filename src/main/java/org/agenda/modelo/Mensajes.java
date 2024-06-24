package org.agenda.modelo;

import java.util.Date;

public class Mensajes {
    private int id;
    private String asunto;
    private String mensaje;
    private Date fechaHora;
    private String emisorNombre;
    private int receptor;
    
    public Mensajes(String asunto, String mensaje) {
        this.asunto = asunto;
        this.mensaje = mensaje;
    }
    public Mensajes(int id, String asunto, String mensaje, Date fechaHora, String emisorNombre) {
        this.id =id;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
        this.emisorNombre = emisorNombre;
    }
    public Mensajes(String asunto, String mensaje, Date fechaHora, String emisorNombre, int receptor) {
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
        this.emisorNombre = emisorNombre;
        this.receptor = receptor;
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
    public int getReceptor() {
        return receptor;
    }
    public void setReceptor(int receptor) {
        this.receptor = receptor;
    }
    
    public String getEmisorNombre() {
        return emisorNombre;
    }
    public void setEmisorNombre(int emisor) {
        this.emisorNombre = emisorNombre;
    }
}
