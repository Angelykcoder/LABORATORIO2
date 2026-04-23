package pruebanocturna;

import java.io.Serializable;

public class Usuario implements Serializable {
    public String user;
    public String password;
    public String nombre;
    public String estado; 
    String nombreCompleto;

    // --- ESTO ES LO QUE TE FALTA: Constructor vacío ---
    public Usuario() {
    }

    // Constructor con datos (el que ya tenías)
    public Usuario(String user, String password, String nombre, String estado) {
        this.user = user;
        this.password = password;
        this.nombre = nombre;
        this.estado = estado;
    }
}