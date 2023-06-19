/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;
import grupo7_poryectofinalsm.*;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import login.*;
import login.Persona;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
//tiene que funcionar
public class oponente extends javax.swing.JFrame {
    VentaLogin ventana;
    Persona persona;
    ControladorLogin controladorLogin;
    settings configuracion;
    String oponente;
    public oponente(VentaLogin ventana, Persona persona,settings configuracion) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.ventana = ventana;
        this.persona = persona;
        this.configuracion=configuracion;
        this.controladorLogin = ventana.getControlador();
        this.oponente=oponente;
        inicializarComboBox();
        ImageIcon icono = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/be3579cdee7b09c0e5df99420f331bcb1d0dc1cc/src/Imagenes_rebeca/TodosLosFondos/fondo_Oponente.png");
        fondoOponente.setIcon(icono);
        ImageIcon partida = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/be3579cdee7b09c0e5df99420f331bcb1d0dc1cc/src/proyecto/btn_regreso/btn_regreso.png");
        btn_regresar.setIcon(partida);
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

    private void inicializarComboBox() {
        Persona[] arregloPersonas = controladorLogin.getArregloPersonas();
        String usuario = persona.getNombreUser();

        String[] colador = Arrays.stream(arregloPersonas)
                                 .filter(p -> p != null && !p.getNombreUser().equals(usuario) && p.getNombreUser() != null && !p.getNombreUser().trim().isEmpty() && !p.getNombreUser().equals("..........."))
                                 .map(Persona::getNombreUser)
                                 .toArray(String[]::new);

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(colador);
        comboBox_oponente.setModel(comboBoxModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_regresar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_continuar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        comboBox_oponente = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        fondoOponente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setOpaque(false);

        jPanel2.setOpaque(false);

        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresarMouseClicked(evt);
            }
        });
        jPanel2.add(btn_regresar);

        jPanel4.setOpaque(false);

        btn_continuar.setBackground(new java.awt.Color(51, 51, 51));
        btn_continuar.setFont(new java.awt.Font("Game Of Squids", 0, 18)); // NOI18N
        btn_continuar.setForeground(new java.awt.Color(255, 255, 255));
        btn_continuar.setText("CONTINUAR");
        btn_continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_continuarMouseClicked(evt);
            }
        });
        jPanel4.add(btn_continuar);

        jPanel5.setOpaque(false);

        comboBox_oponente.setBackground(new java.awt.Color(163, 138, 138));
        comboBox_oponente.setFont(new java.awt.Font("Game Of Squids", 0, 36)); // NOI18N
        comboBox_oponente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBox_oponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_oponenteActionPerformed(evt);
            }
        });
        jPanel5.add(comboBox_oponente);

        jPanel6.setOpaque(false);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.add(jLabel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1408, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.add(fondoOponente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_continuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_continuarMouseClicked
        String texto = jLabel2.getText();
        oponente=texto;
        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un oponente");
        } else {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de continuar?", "Oponente "+texto, JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                bando ventana1 = new bando(ventana,persona,configuracion,this);
                ventana1.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_continuarMouseClicked
public String getOponente(){
    return oponente;
}
    private void btn_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseClicked
        partida_nueva menu = new partida_nueva(ventana,persona,configuracion);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regresarMouseClicked

    private void comboBox_oponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_oponenteActionPerformed
        String label=""; 
        label=label+comboBox_oponente.getSelectedItem().toString();
        jLabel2.setText(label);
    }//GEN-LAST:event_comboBox_oponenteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_continuar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<String> comboBox_oponente;
    private javax.swing.JLabel fondoOponente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
