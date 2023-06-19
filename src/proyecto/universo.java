/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;
import grupo7_poryectofinalsm.*;
import login.*;
import login.Persona;
import java.util.Arrays;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class universo extends javax.swing.JFrame {
    Persona persona;
    VentaLogin ventana;
    settings configuracion;
    ControladorLogin controladorLogin;
    
    
    public universo(VentaLogin ventana, Persona persona,settings configuracion) {
        initComponents();
        this.setExtendedState(6);
        this.persona=persona;
        this.ventana=ventana;
        this.configuracion=configuracion;
        this.controladorLogin = ventana.getControlador();
        actualizarHistorico();
        actualizarActivos();
        //ImageIcon icono = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/be3579cdee7b09c0e5df99420f331bcb1d0dc1cc/src/Imagenes_rebeca/TodosLosFondos/fondo_Universo.png");
       // fondo_universo.setIcon(icono);
       // ImageIcon menu= createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/be3579cdee7b09c0e5df99420f331bcb1d0dc1cc/src/proyecto/btn_regreso/btn_menuPrincipal.png");
       // btn_menu.setIcon(menu);
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
    }    private int obtenerNumeroUsuariosRegistrados() {//para el historico, tipo combobox
        Persona[] arregloPersonas = controladorLogin.getArregloPersonas();
        String usuario = persona.getNombreUser();

        long numeroPersonas = Arrays.stream(arregloPersonas)
                                .filter(p -> p != null && !p.getNombreUser().equals(usuario))
                                .count();
        return (int) numeroPersonas + 1; 
    }
    private void actualizarHistorico() {
        int numeroUsuariosRegistrados = obtenerNumeroUsuariosRegistrados();
        historico.setText(""+numeroUsuariosRegistrados);
    }      
    private int obtenerNumeroUsuariosActivos() {
        Persona[] arregloPersonas = controladorLogin.getArregloPersonas();
        String usuario = persona.getNombreUser();

        long numeroPersonas = Arrays.stream(arregloPersonas)
                            .filter(p -> p != null && !p.getNombreUser().trim().isEmpty() && !p.getNombreUser().equals("..........."))
                            .count();

        return (int) numeroPersonas ;
    }
    private void actualizarActivos() {
        int numeroUsuariosActivos = obtenerNumeroUsuariosActivos();
        activos.setText(String.valueOf(""+numeroUsuariosActivos));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_menu = new javax.swing.JButton();
        historico = new javax.swing.JLabel();
        activos = new javax.swing.JLabel();
        ganados_heroes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        fondo_universo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        btn_menu.setOpaque(true);
        btn_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_menuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(btn_menu)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_menu)
                .addGap(14, 14, 14))
        );

        historico.setBackground(new java.awt.Color(0, 0, 0));
        historico.setFont(new java.awt.Font("Game Of Squids", 0, 48)); // NOI18N
        historico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historico.setText("0");
        historico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        historico.setOpaque(true);

        activos.setBackground(new java.awt.Color(0, 0, 0));
        activos.setFont(new java.awt.Font("Game Of Squids", 0, 48)); // NOI18N
        activos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activos.setText("0");
        activos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        activos.setOpaque(true);

        ganados_heroes.setBackground(new java.awt.Color(0, 0, 0));
        ganados_heroes.setFont(new java.awt.Font("Game Of Squids", 0, 48)); // NOI18N
        ganados_heroes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ganados_heroes.setText("0");
        ganados_heroes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ganados_heroes.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Game Of Squids", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1231, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(817, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ganados_heroes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activos, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addGap(151, 151, 151)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(historico, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(185, 185, 185))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(historico, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(activos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(195, 195, 195)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ganados_heroes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.add(fondo_universo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseClicked
        menu_principal menu = new menu_principal(ventana,persona,configuracion);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_menuMouseClicked
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activos;
    private javax.swing.JButton btn_menu;
    private javax.swing.JLabel fondo_universo;
    private javax.swing.JLabel ganados_heroes;
    private javax.swing.JLabel historico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}
