package org.agenda.modelo;

public class UsuarioContacto {
    private String DNIusuario;
    private String idContacto;
    
    public UsuarioContacto(String dNIusuario, String idContacto) {
        DNIusuario = dNIusuario;
        this.idContacto = idContacto;
    }

    
    public String getDNIusuario() {
        return DNIusuario;
    }
    public void setDNIusuario(String dNIusuario) {
        DNIusuario = dNIusuario;
    }
    public String getIdContacto() {
        return idContacto;
    }
    public void setIdContacto(String idContacto) {
        this.idContacto = idContacto;
    }

    
}
