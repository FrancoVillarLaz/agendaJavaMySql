package org.agenda.controlador;

import org.agenda.a.LoginModel;
import org.mindrot.jbcrypt.BCrypt;

public class LoginController {
    private String correo;
    private String contraseña;


    // Constructor para traer la contraseña de forma segura
    public LoginController() {

    }

    public LoginController(String correo, char[] contraseña) {
        this.correo = correo;
        this.contraseña = new String(contraseña);
    }

    public LoginController(String user, String pass) {
        this.correo = user;
        this.contraseña = pass;
    }

    public boolean logear() {
        LoginModel login = new LoginModel();
        Boolean logeado = null;
        String contraseñaRecuperada=login.verificarLogin(this);
        if (BCrypt.checkpw(this.getContraseña(), contraseñaRecuperada)) {
            System.out.println("Se inició sesión correctamente.");
            logeado=true;
        } else if(contraseñaRecuperada==null){
            logeado=false;

        } else if(contraseñaRecuperada=="error"){
            logeado=false;
        }
        else {
            System.out.println("Contraseña incorrecta.");
            logeado=false;
        }
        return logeado;
    }

    // Getters y Setters

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
