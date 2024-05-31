package org.agenda.controlador;

import org.mindrot.jbcrypt.BCrypt;

public class LoginController {
    private String correo;
    private String contraseña;

    public LoginController() {}

    public LoginController(String correo, char[] contraseña) {
        this.correo = correo;
        this.contraseña = new String(contraseña);
    }

    public LoginController(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public boolean logear() {
        Validador login = new Validador();
        String contraseñaRecuperada = login.verificarLogin(this);
        if (contraseñaRecuperada != null && BCrypt.checkpw(this.contraseña, contraseñaRecuperada)) {
            System.out.println("Se inició sesión correctamente.");
            return true;
        } else {
            System.out.println("Correo o contraseña incorrectos.");
            return false;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
