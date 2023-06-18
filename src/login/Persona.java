package login;

public class Persona {

    /*
      aquí implementamos los atributos para la clase persona que seria los
      siguiente nombre, documento, nombre de usuario, y la contraseña
     */

    private String nombreUser;
    private String contrasena;
    private int juegos;

    public Persona(String nombreUser, String contrasena) {
      this.nombreUser = nombreUser;
        this.contrasena = contrasena;
        this.juegos=0;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public void setjuego(int veces) {
       juegos = veces;
    }
    public int getjuego(){
        return juegos;
    }
}

