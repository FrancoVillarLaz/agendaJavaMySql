package org.agenda.controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mindrot.jbcrypt.BCrypt;

public class Validador {

    public boolean contraseñaValidacion(String password) {
        String regex = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean correoValidacion(String correo) {
        String regex = "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
    public String passwordHash(String password) {return BCrypt.hashpw(password, BCrypt.gensalt());}
}