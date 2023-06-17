/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import login.*;
import grupo7_poryectofinalsm.*;
public class settings {
   /*
    si click btn_tutorial, contador es 1 
    si click_clasico contador es 0
    vuelve al menu
    al click en btn_stratego llamara esta clase para obtener si es 1 muetrsa tutorial.frame si 0 muestra partida_nueva.frame
    SOLO CAMBIA MANUALMENTE COMO UN CICLO
    */
    private int cuenta_configuracion=3;
     private VentaLogin ventana;
     private settings configuracion;
    private Persona persona;

    public void setTutorial() {
        cuenta_configuracion = 1;
    }

    public void setClasico() {
        cuenta_configuracion = 0;
    }

    public int getCuentaConfiguracion() {
        return cuenta_configuracion;
    }
    public void setVentaLogin(VentaLogin ventana) {
        this.ventana = ventana;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public void click() {
        if (cuenta_configuracion == 1) {
            //tutorial menu = new tutorial(ventana, persona,configuracion);
           // menu.setVisible(true);
        } else if (cuenta_configuracion == 0) {
           // partida_nueva juego = new partida_nueva(ventana, persona,configuracion);
            //juego.setVisible(true);
        } else if (cuenta_configuracion == 1) {
            //partida_nueva juego = new partida_nueva(ventana, persona,configuracion);
            //juego.setVisible(true);
        }
}


}