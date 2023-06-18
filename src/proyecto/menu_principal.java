
package proyecto;
import login.*;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;

public class menu_principal extends javax.swing.JFrame {

    Persona persona;
    VentaLogin ventana;
    settings configuracion;
    public menu_principal(VentaLogin ventana, Persona persona,settings configuracion) {
        initComponents();
       this.setExtendedState(6);

       // setLocationRelativeTo(this);
        this.persona = persona;
        this.ventana=ventana;
        this.configuracion=configuracion;
        ImageIcon icono = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/be3579cdee7b09c0e5df99420f331bcb1d0dc1cc/src/Imagenes_rebeca/TodosLosFondos/fondo_Menu.png");
        fondoMenu.setIcon(icono);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_stratego = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btn_universo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        CerrarSesion = new javax.swing.JButton();
        MiPerfil = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btn_configuracion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        fondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel5.setOpaque(false);

        btn_stratego.setFont(new java.awt.Font("Game Of Squids", 0, 18)); // NOI18N
        btn_stratego.setText("STRATEGO MARVEL HEROES");
        btn_stratego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_strategoMouseClicked(evt);
            }
        });
        jPanel5.add(btn_stratego);

        jPanel10.setOpaque(false);

        btn_universo.setFont(new java.awt.Font("Game Of Squids", 0, 18)); // NOI18N
        btn_universo.setText("UNIVERSO MARVEL");
        btn_universo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_universoMouseClicked(evt);
            }
        });
        jPanel10.add(btn_universo);

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1391, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 947, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel4);

        jPanel1.setOpaque(false);

        CerrarSesion.setFont(new java.awt.Font("Game Of Squids", 0, 18)); // NOI18N
        CerrarSesion.setText("CERRAR SESION");
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
        });
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        MiPerfil.setFont(new java.awt.Font("Game Of Squids", 0, 18)); // NOI18N
        MiPerfil.setText("MI PERFIL");
        MiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(CerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MiPerfil)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MiPerfil)
                    .addComponent(CerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel8.setOpaque(false);

        btn_configuracion.setFont(new java.awt.Font("Game Of Squids", 0, 18)); // NOI18N
        btn_configuracion.setText("CONFIGURACION");
        btn_configuracion.setOpaque(true);
        btn_configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_configuracionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btn_configuracion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btn_configuracion))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(fondoMenu);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1420, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 45, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_strategoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_strategoMouseClicked
    if (configuracion != null) {
        configuracion.setVentaLogin(ventana);
        configuracion.setPersona(persona);
        configuracion.click();

        if (configuracion.getContador() == 1) {
            if (configuracion.getCuentaConfiguracion() == 1) {
                tutorial menu = new tutorial(ventana, persona, configuracion);
                menu.setVisible(true);
            } else if (configuracion.getCuentaConfiguracion() == 0) {
                partida_nueva juego = new partida_nueva(ventana, persona, configuracion);
                juego.setVisible(true);
            }
        } else {
            configuracion instanciaConfiguracion = new configuracion(ventana, persona, configuracion);
            instanciaConfiguracion.setVisible(true);
        }
    } else {
        partida_nueva juego = new partida_nueva(ventana, persona, configuracion);
        juego.setVisible(true);
    }
    this.setVisible(false);       
    }//GEN-LAST:event_btn_strategoMouseClicked

    private void btn_configuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configuracionMouseClicked
        configuracion set=  new configuracion(ventana,persona,configuracion);
        set.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_configuracionMouseClicked

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
    //daba error por este llamado repetido en el mouseClicked      
    //VentaLogin window = new VentaLogin(ventana,persona);
    // window.setVisible(true);
    // this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void MiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiPerfilActionPerformed
        MiPerfil nose=new MiPerfil(ventana,persona,configuracion);
        nose.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MiPerfilActionPerformed

    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        ventana.setVisible(true); // Vuelve a hacer visible la ventana de inicio de sesión
        this.setVisible(false);
    }//GEN-LAST:event_CerrarSesionMouseClicked

    private void btn_universoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_universoMouseClicked
        universo mostrar =new universo(ventana,persona,configuracion);
        mostrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_universoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton MiPerfil;
    private javax.swing.JButton btn_configuracion;
    private javax.swing.JButton btn_stratego;
    private javax.swing.JButton btn_universo;
    private javax.swing.JLabel fondoMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables

}
