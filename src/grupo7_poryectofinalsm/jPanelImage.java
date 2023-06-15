package grupo7_poryectofinalsm;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class jPanelImage extends JPanel{

    private BufferedImage image;

    public jPanelImage() {
       try {                
          image = ImageIO.read(this.getClass().getResource("/imagenes_rebeca/tablero_fin.png"));
       } catch (IOException ex) {
            // handle exception...
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
    }

}