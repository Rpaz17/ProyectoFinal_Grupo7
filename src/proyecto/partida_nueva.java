package proyecto;
import grupo7_poryectofinalsm.*;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;
import login.*;
import login.Persona;


public class partida_nueva extends javax.swing.JFrame {
    VentaLogin ventana;
    Persona persona;
    settings configuracion;

    public partida_nueva(VentaLogin ventana, Persona persona,settings configuracion) {
        initComponents();
        this.setExtendedState(6);
        this.persona=persona;
        this.ventana=ventana;
        this.configuracion=configuracion;
        ImageIcon icono = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/be3579cdee7b09c0e5df99420f331bcb1d0dc1cc/src/Imagenes_rebeca/TodosLosFondos/fondo_vacio.png");
        fondoPartida.setIcon(icono);
        ImageIcon menu= createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/be3579cdee7b09c0e5df99420f331bcb1d0dc1cc/src/proyecto/btn_regreso/btn_menuPrincipal.png");
        btn_menu.setIcon(menu);
        ImageIcon nueva= createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/be3579cdee7b09c0e5df99420f331bcb1d0dc1cc/src/proyecto/imagen_STRATEGO/btn_partidaNueva.png");
        btn_partida.setIcon(nueva);
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

        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_partida = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_menu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        fondoPartida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));
        jPanel8.setOpaque(false);

        jPanel1.setOpaque(false);

        btn_partida.setBackground(new java.awt.Color(204, 204, 204));
        btn_partida.setFont(new java.awt.Font("Game Of Squids", 0, 48)); // NOI18N
        btn_partida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_partidaMouseClicked(evt);
            }
        });
        jPanel1.add(btn_partida);

        jPanel2.setOpaque(false);

        btn_menu.setFont(new java.awt.Font("Game Of Squids", 0, 14)); // NOI18N
        btn_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_menuMouseClicked(evt);
            }
        });
        jPanel2.add(btn_menu);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1175, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 508, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.add(fondoPartida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseClicked
        menu_principal menu = new menu_principal(ventana,persona,configuracion);
        menu.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_btn_menuMouseClicked

    private void btn_partidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_partidaMouseClicked
        oponente ventana2 = new oponente(ventana,persona,configuracion);
        ventana2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_partidaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_partida;
    private javax.swing.JLabel fondoPartida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
