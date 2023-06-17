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
    private int cuenta_configuracion;
    private VentaLogin ventana;
    private settings configuracion;
    private Persona persona;
    private int contador = 0;//las veces que se ha dado click a configuracion
    private int vecesStratego;

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
    public void click() {//si es null se mostrara partida nueva SINO significa que se ha dado click y procede con getCuentaConfi...
        contador++;
    }
    public int getContador() {
        return contador;
    }
    public int clickStratego() {
        return vecesStratego;
    }
    
    /*
    contador para si es primera vez que da click en btn_stratego sale tutorial, al dar click en salir de tutorial vyelve al menu
    y si le da click a btn_jugar ahora sale la partida. este codigo sera valido si es la primera vez que hace log in asi que ocupo un contador
    de log in, que si es la primera vez que ingresa el numero es 0 y se hara lo anterior, si no es la primera vez el numero sera 1 se aplicara esta
    logica al clicn en btn_jugar    
    */

}