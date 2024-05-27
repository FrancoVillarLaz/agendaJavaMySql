package org.agenda.modelo;

public class mensajesRelacion {
    private int idMensaje;
    private int idEmisor;
    private int idReceptor;

    
    public mensajesRelacion(int idMensaje, int idEmisor, int idReceptor) {
        this.idMensaje = idMensaje;
        this.idEmisor = idEmisor;
        this.idReceptor = idReceptor;
    }
    public int getIdMensaje() {
        return idMensaje;
    }
    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }
    public int getIdEmisor() {
        return idEmisor;
    }
    public void setIdEmisor(int idEmisor) {
        this.idEmisor = idEmisor;
    }
    public int getIdReceptor() {
        return idReceptor;
    }
    public void setIdReceptor(int idReceptor) {
        this.idReceptor = idReceptor;
    }

    
}
