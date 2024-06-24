package org.agenda.modelo;
public class UsuarioContacto {
    private int idUsuario;
    private int idContacto;

    public UsuarioContacto(int idUsuario, int idContacto) {
        this.idUsuario = idUsuario;
        this.idContacto = idContacto;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdContacto() {
        return idContacto;
    }
}