package proyecto;
import grupo7_poryectofinalsm.*;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;
import login.*;
import login.Persona;

public class bando extends javax.swing.JFrame {
    TableroStratego tablero;
    VentaLogin ventana;
    settings configuracion;
    Persona persona;
    String jugador1;
    String jugador2;
    
    public bando(VentaLogin ventana, Persona persona,settings configuracion) {
        initComponents();
        this.setExtendedState(6);
        this.persona=persona;
        this.ventana=ventana;
        this.configuracion=configuracion;
        ImageIcon icono = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/be3579cdee7b09c0e5df99420f331bcb1d0dc1cc/src/Imagenes_rebeca/TodosLosFondos/fondo_bando.png");
        fondo_bando.setIcon(icono);
        ImageIcon heroes= createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/be3579cdee7b09c0e5df99420f331bcb1d0dc1cc/src/proyecto/imagen_STRATEGO/btn_heroes.png");
        btn_heroes.setIcon(heroes);
        ImageIcon villanos= createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/be3579cdee7b09c0e5df99420f331bcb1d0dc1cc/src/proyecto/imagen_STRATEGO/btn_villanos.png");
        btn_villanos.setIcon(villanos);
        ImageIcon regreso= createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/be3579cdee7b09c0e5df99420f331bcb1d0dc1cc/src/proyecto/btn_regreso/btn_regreso.png");
        btn_regresar.setIcon(regreso);

    }

    private ImageIcon createImageIconFromURL(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            Image image = javax.imageio.ImageIO.read(url);
            return new ImageIcon(image);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_regresar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_heroes = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_villanos = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        fondo_bando = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setOpaque(false);

        jPanel3.setOpaque(false);

        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresarMouseClicked(evt);
            }
        });
        jPanel3.add(btn_regresar);

        jPanel4.setOpaque(false);

        jPanel2.setOpaque(false);

        btn_heroes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_heroesMouseClicked(evt);
            }
        });
        jPanel2.add(btn_heroes);

        jPanel4.add(jPanel2);

        jPanel1.setOpaque(false);

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);

        btn_villanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_villanosMouseClicked(evt);
            }
        });
        jPanel1.add(btn_villanos);

        jPanel4.add(jPanel1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1420, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.add(fondo_bando);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseClicked
       oponente ventana1=new oponente(ventana,persona,configuracion);
        ventana1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regresarMouseClicked

    private void btn_heroesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_heroesMouseClicked
       
        TableroStratego tablero=new TableroStratego(ventana,persona,configuracion);
        jugador1="Heroes";
        jugador2="Villanos";
        tablero.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_heroesMouseClicked

    private void btn_villanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_villanosMouseClicked
        
        TableroStratego tablero=new TableroStratego(ventana,persona,configuracion);
        jugador1="Villanos";
        jugador2="Heroes";
        tablero.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_villanosMouseClicked

    public String getJugador1(){
        return jugador1;
    }
    public String getJugador2(){
        return jugador2;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_heroes;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_villanos;
    private javax.swing.JLabel fondo_bando;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
