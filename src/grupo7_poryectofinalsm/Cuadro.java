package grupo7_poryectofinalsm;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Cuadro extends javax.swing.JButton{
    Personaje character;
    boolean disponible=true;
    boolean habilitado=true;
    int numero=0;
    int fila=0;
    int columna=0;
    
    public Cuadro(int f, int c, int num){
        super();
        fila=f;
        columna=c; 
        numero = num;
        character=null;
    }
    
    public void SetCharacter(Personaje person) {
        character = new Personaje(person.Tipo, person.Nivel, person.Nombre, person.ImagePath);
    }
    
    public void setImage() {
        if(this.character != null) {
            int bWidth =this.getWidth();
            int bHeight = this.getHeight();
            int offset = this.getInsets().left;

            ImageIcon icon = new ImageIcon(getClass().getResource(character.ImagePath));            
            Icon iconr = resizeIcon(icon , bWidth - offset , bHeight - offset);
            this.setIcon(iconr);
        } else
            this.setIcon(null);
    } 
    
     private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
        return new ImageIcon(resizedImage);
    }
}
