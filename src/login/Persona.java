package login;

import java.util.Date;

public class Persona {

    /*
      aquí implementamos los atributos para la clase persona que seria los
      siguiente nombre, documento, nombre de usuario, y la contraseña
     */

    private String nombreUser;
    private String contrasena;
    private int juegos;
    String[] fechas;
    
    public Persona(String nombreUser, String contrasena) {
      this.nombreUser = nombreUser;
        this.contrasena = contrasena;
        this.juegos=0;
        this.fechas = new String[0];
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
    public Date getFecha(){
        Date fecha = new Date();
        return fecha;
    }
    
    public void agregarFecha(String fecha,String p1,String p2,String estado) {
        String[] nuevoArreglo = new String[fechas.length + 1];
        System.arraycopy(fechas, 0, nuevoArreglo, 0, fechas.length);
        nuevoArreglo[fechas.length] = p1+" vs "+p2+"-- "+estado+"--"+fecha;
        fechas = nuevoArreglo;
    }
}

