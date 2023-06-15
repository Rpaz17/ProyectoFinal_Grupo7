
package login;

public class Persona {

    /*
      aquí implementamos los atributos para la clase persona que seria los
      siguiente nombre, documento, nombre de usuario, y la contraseña
     */

    private String nombreUser;
    private String contrasena;

    public Persona(String nombreUser, String contrasena) {
      this.nombreUser = nombreUser;
        this.contrasena = contrasena;
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

}
