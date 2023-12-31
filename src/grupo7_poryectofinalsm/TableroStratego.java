package grupo7_poryectofinalsm;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import login.*;
import proyecto.*;
import java.util.Date;
import proyecto.info_termina_partida;
import proyecto.menu_principal;
import java.net.URL;
        
public class TableroStratego extends JFrame {
    private Cuadro[][] botones = new Cuadro[10][10];
    Persona persona;
    VentaLogin ventana;
    bando jugador;
    settings configuracion;
    oponente oponente;
     private BufferedImage image;
     private Personaje[] heroes = new Personaje[33];
     private Personaje[] villanos = new Personaje[33];
     private Personaje bombaH;
     private Personaje bombaV;
     private Personaje tierraH;
     private Personaje tierraV;
     private String turnoPara="Heroe";
     boolean ganadorHeroe=true;
     boolean ganadorVillano=false;
     private Cuadro botonInicio;
     private Cuadro botonFinal;
     
    public TableroStratego(VentaLogin ventana, Persona persona,settings configuracion) {
        initComponents();
        initBotones();
        this.setExtendedState(6);
        this.persona=persona;
        this.ventana=ventana;
        this.configuracion=configuracion;
        initPersonajes();
        setPersonajes();
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_menu = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setText("*");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_menu.setText("RENDIRSE");
        btn_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_menuMouseClicked(evt);
            }
        });
        jPanel5.add(btn_menu);

        jPanel6.setBackground(new java.awt.Color(17, 0, 17));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(47, 0, 63));
        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 760, 770));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseClicked
       
        int confirmacion=JOptionPane.showConfirmDialog(rootPane, "Estas seguro que deseas rendirte? Perderas tus puntos en la partida!", "RENDIRSE", JOptionPane.YES_NO_OPTION);
        if(confirmacion == JOptionPane.YES_OPTION){
             if (turnoPara.equals("Heroe") && confirmacion==JOptionPane.YES_OPTION){
            int respuesta = JOptionPane.showConfirmDialog(this, "EL HEROE SE HA RENDIDO", "SALIR", JOptionPane.YES_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                menu_principal menu=new menu_principal(ventana,persona,configuracion);
                menu.setVisible(true);
                this.setVisible(false);
            }
            }else{
             if (turnoPara.equals("Villanos") && confirmacion==JOptionPane.YES_OPTION){
            int respuesta = JOptionPane.showConfirmDialog(this, "EL VILLANOS SE HA RENDIDO", "SALIR", JOptionPane.YES_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                menu_principal menu=new menu_principal(ventana,persona,configuracion);
                menu.setVisible(true);
                this.setVisible(false);
            
        }
        }else if ( confirmacion == JOptionPane.NO_OPTION){
            this.setVisible(true);
        }        
    }//GEN-LAST:event_btn_menuMouseClicked
        }
    }
    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        if(turnoPara.equals("Heroe")){
            jLabel1.setText("Es el turno de los HEROES!");
        }else{
              jLabel1.setText("Es el turno de los VILLANOS!");
        }
    }//GEN-LAST:event_jLabel1AncestorAdded

     private void initBotones(){
       GridLayout botonesLayout = new GridLayout(10,10);
       jPanel1.setLayout(botonesLayout);
       int botonContador=0;
       for(int f=0; f<10;f++) {
            for(int c=0;c<10;c++){
                botones[f][c] = new Cuadro(f,c,botonContador);
                botones[f][c].setName("boton_"+String.valueOf(botonContador));
                botones[f][c].setBorder(javax.swing.BorderFactory.createEtchedBorder());
                botonContador++;
                botones[f][c].setBackground(null);
                botones[f][c].setForeground(Color.WHITE);
//                botones[f][c].setOpaque(false);
//                botones[f][c].setContentAreaFilled(false);
                botones[f][c].addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent evt) {
                                botonesMouseClicked(evt);
                        }
                });
//                botones[f][c].addActionListener(new ActionListener() {
//                    public void actionPerformed(ActionEvent evt) {
//                        botonesActionPerformed(evt);
//                    }
//                });
//                botones[f][c].addPropertyChangeListener(new java.beans.PropertyChangeListener() {
//                    public void propertyChange(java.beans.PropertyChangeEvent evt) {
//                        botonesPropertyChange(evt);
//                    }
//                });
                jPanel1.add(botones[f][c]);
            }
        }
       botones[4][6].setText("");
       botones[4][6].setBackground(Color.YELLOW);
       botones[4][6].disponible=false;
       botones[5][6].setText("");
       botones[5][6].setBackground(Color.YELLOW);
       botones[5][6].disponible=false;
       botones[4][7].setText("");
       botones[4][7].setBackground(Color.YELLOW);
       botones[4][7].disponible=false;
       botones[5][7].setText("");
       botones[5][7].setBackground(Color.YELLOW);
       botones[5][7].disponible=false;
       
       botones[4][2].setText("");
       botones[4][2].setBackground(Color.MAGENTA);
       botones[4][2].disponible=false;
       botones[5][2].setText("");
       botones[5][2].setBackground(Color.MAGENTA);
       botones[5][2].disponible=false;
       botones[4][3].setText("");
       botones[4][3].setBackground(Color.MAGENTA);
       botones[4][3].disponible=false;
       botones[5][3].setText("");
       botones[5][3].setBackground(Color.MAGENTA);
       botones[5][3].disponible=false;
    }
     
    private void botonesMouseClicked(MouseEvent evt) {
        menu_principal regresar=new menu_principal(ventana,persona,configuracion);
         Object source = evt.getSource();
        Cuadro botonPresionado = ((Cuadro) source);
        int f=botonPresionado.fila;
        int c=botonPresionado.columna;
        boolean mover=false;
        String text = botonPresionado.getText();
        botonPresionado.setBorderPainted(true);
        
        if(botonPresionado.disponible){
                if(botonInicio == null) {
                    if(botonPresionado.character != null && botonPresionado.habilitado) {
                        if (!botonPresionado.character.Tipo.equals("Tierra") && !botonPresionado.character.Tipo.equals("Bomba")){
                            botonPresionado.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
                            botonInicio = botonPresionado;
                            botonInicio.setText(text);
                        }
                    } 
                } else { 
                    if (botonInicio.numero==botonPresionado.numero) {
                        botonInicio.setBorder(BorderFactory.createEmptyBorder());
                        botonPresionado.setBorder(BorderFactory.createEmptyBorder());
                        botonInicio = null;
                    } else {
                        if (botonInicio.fila==botonPresionado.fila){
                            if(botonInicio.character.Nivel==2){
                                int valorinicial, valorfinal;
                                mover=true;
                                if(botonInicio.columna<botonPresionado.columna) {
                                    valorinicial=botonInicio.columna;
                                    valorfinal=botonPresionado.columna;
                                } else {
                                    valorinicial=botonPresionado.columna;
                                    valorfinal=botonInicio.columna;
                                }
                                for(int col=valorinicial+1; col<valorfinal;col++) {
                                    if(botones[botonInicio.fila][col].character !=null) {
                                        mover=false;
                                        break;
                                    }
                                }
                            } else{
                                  if((botonInicio.columna>0 && botonPresionado.columna==botonInicio.columna-1) || (botonInicio.columna<9 && botonPresionado.columna==botonInicio.columna+1)){
                                            mover=true;
                                   }
                            }
                        } else if(botonInicio.columna==botonPresionado.columna){
                            if(botonInicio.character.Nivel==2){
                                int valorinicial, valorfinal;
                                mover=true;
                                if(botonInicio.fila<botonPresionado.fila) {
                                    valorinicial=botonInicio.fila;
                                    valorfinal=botonPresionado.fila;
                                } else {
                                    valorinicial=botonPresionado.fila;
                                    valorfinal=botonInicio.fila;
                                }
                                for(int fil=valorinicial+1; fil<valorfinal;fil++) {
                                    if(botones[fil][botonInicio.columna].character !=null) {
                                        mover=false;
                                        break;
                                    }
                                }
                            } else{
                                if((botonInicio.fila>0 && botonPresionado.fila==botonInicio.fila-1) || (botonInicio.fila<9 && botonPresionado.fila==botonInicio.fila+1)){
                                      mover=true;       
                                }
                            }
                         }// cierre if verificacion de misma fila y misma columna
                         ImageIcon desconocido = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/d0016110e6a873f41cc9b232ddf9fdb2bccd5c7a/src/Imagenes_rebeca/desconocido.png");
                        if(botonPresionado.character==null && mover) { //EN CASO DE QUE LA SEGUNDA CASILLA SEA NULA
                            botonInicio.setBorder(BorderFactory.createEmptyBorder());
                            botonPresionado.SetCharacter( botonInicio.character);// el boton presionado toma la informacion del personaje del primero boton seleccionado
                            botonPresionado.setText(botonInicio.getText());// el boton presionado toma la informacion del primer boton seleccionado
                             botonPresionado.setIcon(botonInicio.getSelectedIcon());
                            botonInicio.setText("");// el texto del primero boton queda en blanco
                            botonInicio.character=null;// la informacion del persoanje de este boton qeuda en nulo
                            botonInicio.setIcon(null);
                            botonInicio=null;
                            cambioTurno();
    //                    botonInicio.setImage();
    //                    botonFinal.setImage();
                       } else if(botonInicio.character.Tipo.equals(botonPresionado.character.Tipo)) { // EN CASO DE QUE SEAN DEL MISMO BANDO
                            botonInicio.setBorder(BorderFactory.createEmptyBorder());// el primero boton se deselecciona
                            botonPresionado.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));// se le pone el borde al boton para que se sepa que es lo que se esta seleccionando, el segundo boton se selecciona
                            botonInicio = botonPresionado; 
                            botonInicio.setText(text);
                        } else if (botonPresionado.character !=null && mover 
                                        && !(botonPresionado.character.Nombre.equals("Pumpkin Bomb") && botonInicio.character.Tipo.equals("Villano"))
                                        && !(botonPresionado.character.Nombre.equals("Nova Blast") && botonInicio.character.Tipo.equals("Heroe"))){ // EN CASO DE QUE HAYA UN PERSONAJE DEL OTRO BANDO 
                            botonInicio.setBorder(BorderFactory.createEmptyBorder());// se deseleccion el primer boton
                            if ((botonInicio.character.Nivel==10 && botonPresionado.character.Nivel==1)){ // a continuacion se chequean las excepciones dadas en el formato
                                 JOptionPane.showMessageDialog(null, botonPresionado.character.Nombre+" con Rango "+botonPresionado.character.Nivel+" venció una "+botonInicio.character.Nombre+" con Rango "+botonInicio.character.Nivel+" !");
                                botonInicio.character=null;
                                botonInicio.setText(" "); // texto se vuelve nulo al igual que info
                                botonInicio.setIcon(null);
                            } else if((botonInicio.character.Nivel==1 && botonPresionado.character.Nivel==10)){
                                  JOptionPane.showMessageDialog(null, botonInicio.character.Nombre+" con Rango "+botonInicio.character.Nivel+" venció una "+botonPresionado.character.Nombre+" con Rango "+botonPresionado.character.Nivel+" !");
                                botonPresionado.character=botonInicio.character;
                                botonPresionado.setText(botonInicio.getText());
                                botonPresionado.setIcon(botonInicio.getSelectedIcon());
                                botonInicio.character=null;
                                botonInicio.setText("");
                                botonInicio.setIcon(null);
                            }else if((botonInicio.character.Nivel==3 && botonPresionado.character.Nivel==11)){ // las cartas nivel 11 son las bombas
                                JOptionPane.showMessageDialog(null, botonInicio.character.Nombre+" con Rango "+botonInicio.character.Nivel+" venció una "+botonPresionado.character.Nombre+"!");
                                botonPresionado.character= botonInicio.character;
                                botonPresionado.setText(botonInicio.getText());
                                botonPresionado.setIcon(botonInicio.getSelectedIcon());
                                botonInicio.character=null;
                                botonInicio.setText("");
                                botonInicio.setIcon(null);
                            } else if ((botonPresionado.character.Nombre.equals("Tierra Villanos"))){  // cuando la tierra es salvada
                                int fin = JOptionPane.showConfirmDialog(null, "FELICIDADES HEROES SALVARON LA TIERRA Y DERROTARON A LOS VILLANOS!", "FIN DE LA PARTIDA",JOptionPane.OK_OPTION);
                               
                                if(fin==JOptionPane.OK_OPTION){
                                botonPresionado.character=botonInicio.character;
                                botonPresionado.setIcon(botonInicio.getSelectedIcon());
                                botonInicio.character=null;
                                botonInicio.setText(""); // la info queda nula
                                botonInicio.setIcon(null);
                                regresar.setVisible(true); // regresa al menu principal
                                this.setVisible(false);
                               }
                            }else if( (botonPresionado.character.Nombre.equals("Tierra Heroes"))){ // cuando la tierra es capturada
                                 int fin = JOptionPane.showConfirmDialog(null, "FELICIDADES VILLANOS CAPTURARON LA TIERRA Y DERROTARON A LOS HEROES!", "FIN DE LA PARTIDA",JOptionPane.OK_OPTION);
                                String nosee=String.valueOf(persona.getFecha());
                                 if(fin==JOptionPane.OK_OPTION){
                                botonPresionado.character=botonInicio.character;
                                botonPresionado.setIcon(botonInicio.getSelectedIcon());
                                botonInicio.character=null;
                                botonInicio.setText("");
                                regresar.setVisible(true); // regresa al menu principal
                                this.setVisible(false);
                               }
                            }else { // PARA TODOS LOS MOVIMIENTOS DEL TABLERO EN CASO DE QUE HAYA UN PERSONAJE EN EL SEGUNDO BOTON SELECCIONADO
                                if(botonInicio.character.Nivel>botonPresionado.character.Nivel){
                                    JOptionPane.showMessageDialog(null, botonInicio.character.Nombre+" de Rango "+botonInicio.character.Nivel+" VS "+botonPresionado.character.Nombre+" de Rango "+botonPresionado.character.Nivel+"\n\n"+botonPresionado.character.Nombre+" fue derrotado por "+botonInicio.character.Nombre);
                                    botonPresionado.character=botonInicio.character; // La info del boton se mueve hacia la casilla del contrario
                                    botonPresionado.setIcon(botonInicio.getIcon());
                                    botonPresionado.setIcon(null);
                                    botonPresionado.character=null;
                                    botonPresionado.setText("");
                                    //Falta mover la pieza que se elimino al panel de a lado y llevar contador
                                    // Fa;ta descubrir pieza ganadora
                                } else if(botonInicio.character.Nivel<botonPresionado.character.Nivel){
                                   JOptionPane.showMessageDialog(null, botonInicio.character.Nombre+" de Rango "+botonInicio.character.Nivel+" VS "+botonPresionado.character.Nombre+" de Rango "+botonPresionado.character.Nivel+"\n\n"+botonInicio.character.Nombre+" fue derrotado por "+botonPresionado.character.Nombre);
                                   botonInicio.setText(" ");
                                  botonInicio.character=null;
                                  botonInicio.setIcon(null);
                                }else if (botonInicio.character.Nivel==botonPresionado.character.Nivel){
                                    JOptionPane.showMessageDialog(null, botonInicio.character.Nombre+" de Rango "+botonInicio.character.Nivel+" VS "+botonPresionado.character.Nombre+" de Rango "+botonPresionado.character.Nivel+"\n "+"\nAmbos personajes fueron eliminados.");
                                      botonPresionado.character=null;
                                      botonPresionado.setText("");
                                      botonPresionado.setIcon(null);
                                      botonInicio.setIcon(null);
                                      botonInicio.character=null;
                                      botonInicio.setText(" ");
                                }//comprobar los niveles y eliminar fichas
                            }
                            botonInicio=null;   
                            cambioTurno();
                        }    
                    }
                }// cierre if si boton inicio es distinto a null    
        }// cierre if si boton esta disponible
    }

    private void botonesPropertyChange(java.beans.PropertyChangeEvent evt) {
// TODO add your handling code here:
    }
    
    private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
        return new ImageIcon(resizedImage);
    }
    
    private void initPersonajes() { // INICIALIZAR PERSONAJES
        heroes[0] = new Personaje("Heroe", 10, "Mr Fantastic", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/10.mr_fantastic.png");
        heroes[1] = new Personaje("Heroe", 9, "Captain America", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/9.cap_america.png");
        heroes[2] = new Personaje("Heroe", 8, "Professor X", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/8.professor_x.png");
        heroes[3] = new Personaje("Heroe", 8, "Nick Fury", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/8.nick_fury.png");
        heroes[4] = new Personaje("Heroe", 7, "Spider Man", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/7.spiderman.png");
        heroes[5] = new Personaje("Heroe", 7 ,"Wolverine", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/7.wolverine.png");
        heroes[6] = new Personaje("Heroe", 7, "Namor", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/7.namor.png");
        heroes[7] = new Personaje("Heroe", 6, "Daredevil", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/6.daredevil.png");
        heroes[8] = new Personaje("Heroe", 6, "Silver Surfer", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/6.silver_surfer.png");
        heroes[9] = new Personaje("Heroe", 6, "Hulk", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/6.hulk.png");
        heroes[10] = new Personaje("Heroe", 6, "Iron Man", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/6.ironman.png");
        heroes[11] = new Personaje("Heroe", 5, "Thor", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/5.thor.png");
        heroes[12] = new Personaje("Heroe", 5, "Human Torch", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/5.human_torch.png");
        heroes[13] = new Personaje("Heroe", 5, "Ciclope", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/5.ciclope.png");
        heroes[14] = new Personaje("Heroe",5, "Invisible Woman", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/5.invisible_woman.png");
        heroes[15] = new Personaje("Heroe", 4, "Ghost Rider", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/4.ghost_rider.png");
        heroes[16] = new Personaje("Heroe", 4, "Punisher", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/4.punisher.png");
        heroes[17] = new Personaje("Heroe", 4, "Blade", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/4.blade.png");
        heroes[18] = new Personaje("Heroe", 4, "Thing", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/4.thing.png");
        heroes[19] = new Personaje("Heroe", 3, "Emma Frost", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.emma_frost.png");
        heroes[20] = new Personaje("Heroe", 3, "She Hulk", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.she-hulk.png");
        heroes[21] = new Personaje("Heroe", 3, "Giant Man", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.giant_man.png");
        heroes[22] = new Personaje("Heroe", 3, "Beast", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.beast.png");
        heroes[23] = new Personaje("Heroe", 3, "Colossus", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.colossus.png");
        heroes[24] = new Personaje("Heroe", 1, "Black Widow", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/1.black_widow.png");
        heroes[25] = new Personaje("Heroe", 2, "Phoenix", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.phoenix.png");
        heroes[26] = new Personaje("Heroe", 2, "Elektra", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.elektra.png");
        heroes[27] = new Personaje("Heroe", 2, "Dr Strange", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.dr_strange.png");
        heroes[28] = new Personaje("Heroe", 2, "Nightcrawler", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.nightcrawler.png");
        heroes[29] = new Personaje("Heroe", 2, "Gambit", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.gambit.png");
        heroes[30] = new Personaje("Heroe", 2, "Spider Girl", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.spidergirl.png");
        heroes[31] = new Personaje("Heroe", 2, "Ice Man", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.ice_man.png");
        heroes[32] = new Personaje("Heroe", 2, "Storm", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.storm.png");

        
        villanos[0] = new Personaje("Villano", 10, "Dr Doom", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/10.dr_doom.png");
        villanos[1] = new Personaje("Villano", 9, "Galactus", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/9.galactus.png");
        villanos[2] = new Personaje("Villano", 8, "Kingpin", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/8.kingpin.png");
        villanos[3] = new Personaje("Villano", 8, "Magneto", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/8.magneto.png");
        villanos[4] = new Personaje("Villano", 7, "Apocalypse", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/7.apocalypse.png");
        villanos[5] = new Personaje("Villano", 7 ,"GreenGoblin", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/7.green_goblin.png");
        villanos[6] = new Personaje("Villano", 7, "Venom", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/7.venom.png");
        villanos[7] = new Personaje("Villano", 6, "Bullseye", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/6.bullseye.png");
        villanos[8] = new Personaje("Villano", 6, "Omega Red", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/6.omega_red.png");
        villanos[9] = new Personaje("Villano", 6, "Onslaught", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/6.onslaught.png");
        villanos[10] = new Personaje("Villano", 6, "Red Skull", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/6.red_skull.png");
        villanos[11] = new Personaje("Villano", 5, "Mystique", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/5.mystique.png");
        villanos[12] = new Personaje("Villano", 5, "Mysterio", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/5.mysterio.png");
        villanos[13] = new Personaje("Villano", 5, "Dr Octopus", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/5.dr_octopus.png");
        villanos[14] = new Personaje("Villano",5, "Deadpool", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/5.deadpool.png");
        villanos[15] = new Personaje("Villano", 4, "Abomination", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/4.abomination.png");
        villanos[16] = new Personaje("Villano", 4, "Thanos", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/4.thanos.png");
        villanos[17] = new Personaje("Villano", 4, "Black Cat", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/4.black_cat.png");
        villanos[18] = new Personaje("Villano", 4, "Sabretooth", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/4.sabretooth.png");
        villanos[19] = new Personaje("Villano", 3, "Juggernaut", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.juggernaut.png");
        villanos[20] = new Personaje("Villano", 3, "Rhino", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.rhino.png");
        villanos[21] = new Personaje("Villano", 3, "Carnage", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.carnage.png");
        villanos[22] = new Personaje("Villano", 3, "Mole Man", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.mole_man.png");
        villanos[23] = new Personaje("Villano", 3, "Lizard", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.lizard.png");
        villanos[24] = new Personaje("Villano", 1, "Black Widow", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/1.black_widow.png");
        villanos[25] = new Personaje("Villano", 2, "Mr Sinister", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.Mr_sinister.png");
        villanos[26] = new Personaje("Villano", 2, "Sentinel 1", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.sentinel_1.png");
        villanos[27] = new Personaje("Villano", 2, "Ultron", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.ultron.png");
        villanos[28] = new Personaje("Villano", 2, "Sand Man", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.sandman.png");
        villanos[29] = new Personaje("Villano", 2, "Leader", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.leader.png");
        villanos[30] = new Personaje("Villano", 2, "Viper", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.viper.png");
        villanos[31] = new Personaje("Villano", 2, "Sentinel 2", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.sentinel_2.png");
        villanos[32] = new Personaje("Villano", 2, "Elektro", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.electro.png");
        
        tierraH = new Personaje("Tierra", 0, "Tierra Heroes", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/bombaH/heroes_planet_earth.png");
        tierraV = new Personaje("Tierra", 0, "Tierra Villanos", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/bombaV/planet_earth_villano.png");
        bombaH = new Personaje("Bomba", 11, "Nova Blast", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/bombaH/nova_blast.png");
        bombaV = new Personaje("Bomba", 11, "Pumpkin Bomb", "https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/bombaV/pumpkin_bomb.png");
    }
    
    private void setPersonajes(){
        ImageIcon desconocido = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/d0016110e6a873f41cc9b232ddf9fdb2bccd5c7a/src/Imagenes_rebeca/desconocido.png");
        ImageIcon novablast = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/bombaH/nova_blast.png");
          ImageIcon tierrah = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/bombaH/heroes_planet_earth.png");
        //ubicando tierra y bombas de heroes
        int colTH = getRandom(1,8);
        botones[9][colTH].setIcon(tierrah);
        botones[9][colTH].SetCharacter(tierraH);
        botones[9][colTH-1].setIcon(novablast);
        botones[9][colTH-1].SetCharacter(bombaH);
        botones[9][colTH+1].setIcon(novablast);
        botones[9][colTH+1].SetCharacter(bombaH);
        botones[8][colTH].setIcon(novablast);
        botones[8][colTH].SetCharacter(bombaH);
//        botones[8][colTH].setImage();
        int nb=1; //Nueva Bomba
        while(nb<=3){
            int f=getRandom(8,9);
            int c=getRandom(0,9);
            if(botones[f][c].character==null){
                if (turnoPara=="Heroe"){
                 botones[f][c].setIcon(novablast);
                botones[f][c].SetCharacter(bombaH);
                nb++;
                }else if (turnoPara=="Villano"){
                botones[f][c].setIcon(desconocido);
                botones[f][c].SetCharacter(bombaH);
                nb++;
                }
                
            }
        }
        // ubicando heroes
        for(int posicion_heroe=32;posicion_heroe>=0;posicion_heroe--) {
            int heroe_actual = posicion_heroe;
            while(posicion_heroe==heroe_actual) {
                int f,c;
                if(heroes[posicion_heroe].Nivel==2)
                    f = getRandom(6,7);
                else
                    f = getRandom(6,9);
                c =getRandom(0,9);
                if(botones[f][c].character == null) {
                    botones[f][c].setText(heroes[posicion_heroe].Nombre+"("+String.valueOf(heroes[posicion_heroe].Nivel)+" )");
                    botones[f][c].SetCharacter(heroes[posicion_heroe]);
                    heroe_actual--;
                } // POSICION DE IMAGENES EN BOTON
            if (botones[f][c].character.Nombre.equals("Mr Fantastic") && turnoPara.equals("Heroe")){
                            ImageIcon fantastic = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/10.mr_fantastic.png");
                            botones[f][c].setIcon(fantastic);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Captain America")&& turnoPara.equals("Heroe")){
                            ImageIcon america = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/9.cap_america.png");
                            botones[f][c].setIcon(america);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Professor X")&& turnoPara.equals("Heroe")){
                            ImageIcon professor = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/8.professor_x.png");
                            botones[f][c].setIcon(professor);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Nick Fury")&& turnoPara.equals("Heroe")){
                            ImageIcon nick = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/8.nick_fury.png");
                            botones[f][c].setIcon(nick);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Spider Man")&& turnoPara.equals("Heroe")){
                            ImageIcon spider = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/7.spiderman.png");
                            botones[f][c].setIcon(spider);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Wolverine")&& turnoPara.equals("Heroe")){
                            ImageIcon wolve = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/7.wolverine.png");
                            botones[f][c].setIcon(wolve);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Namor")&& turnoPara.equals("Heroe")){
                            ImageIcon namor = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/7.namor.png");
                            botones[f][c].setIcon(namor);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Daredevil")&& turnoPara.equals("Heroe")){
                            ImageIcon daredevil = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/6.daredevil.png");
                            botones[f][c].setIcon(daredevil);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Silver Surfer")&& turnoPara.equals("Heroe")){
                            ImageIcon silver = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/6.silver_surfer.png");
                            botones[f][c].setIcon(silver);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Hulk")&& turnoPara.equals("Heroe")){
                            ImageIcon hulk = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/6.hulk.png");
                            botones[f][c].setIcon(hulk);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Iron Man")&& turnoPara.equals("Heroe")){
                            ImageIcon iron = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/6.ironman.png");
                            botones[f][c].setIcon(iron);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Thor")&& turnoPara.equals("Heroe")){
                            ImageIcon thor = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/5.thor.png");
                            botones[f][c].setIcon(thor);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Human Torch")&& turnoPara.equals("Heroe")){
                            ImageIcon torch = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/5.human_torch.png");
                            botones[f][c].setIcon(torch);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Ciclope")&& turnoPara.equals("Heroe")){
                            ImageIcon ciclope = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/5.ciclope.png");
                            botones[f][c].setIcon(ciclope);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Invisible Woman")&& turnoPara.equals("Heroe")){
                            ImageIcon invisible = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/5.invisible_woman.png");
                            botones[f][c].setIcon(invisible);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Ghost Rider")&& turnoPara.equals("Heroe")){
                            ImageIcon ghost = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/4.ghost_rider.png");
                            botones[f][c].setIcon(ghost);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Punisher")&& turnoPara.equals("Heroe")){
                            ImageIcon punisher = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/4.punisher.png");
                            botones[f][c].setIcon(punisher);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Blade")&& turnoPara.equals("Heroe")){
                            ImageIcon blade = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/4.blade.png");
                            botones[f][c].setIcon(blade);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Thing")&& turnoPara.equals("Heroe")){
                            ImageIcon thing = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/4.thing.png");
                            botones[f][c].setIcon(thing);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Emma Frost")&& turnoPara.equals("Heroe")){
                            ImageIcon emma = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.emma_frost.png");
                            botones[f][c].setIcon(emma);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("She Hulk")&& turnoPara.equals("Heroe")){
                            ImageIcon shehulk = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.she-hulk.png");
                            botones[f][c].setIcon(shehulk);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Giant Man")&& turnoPara.equals("Heroe")){
                            ImageIcon giant = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.giant_man.png");
                            botones[f][c].setIcon(giant);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Beast")&& turnoPara.equals("Heroe")){
                            ImageIcon beast = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.beast.png");
                            botones[f][c].setIcon(beast);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Colossus")&& turnoPara.equals("Heroe")){
                            ImageIcon colossus = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.colossus.png");
                            botones[f][c].setIcon(colossus);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Black Widow")&& turnoPara.equals("Heroe")){
                            ImageIcon widow = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/1.black_widow.png");
                            botones[f][c].setIcon(widow);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Phoenix")&& turnoPara.equals("Heroe")){
                            ImageIcon phoenix = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.phoenix.png");
                            botones[f][c].setIcon(phoenix);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Elektra")&& turnoPara.equals("Heroe")){
                            ImageIcon elektra = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.elektra.png");
                            botones[f][c].setIcon(elektra);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Dr Strange")&& turnoPara.equals("Heroe")){
                            ImageIcon strange = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.dr_strange.png");
                            botones[f][c].setIcon(strange);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Nightcrawler")&& turnoPara.equals("Heroe")){
                            ImageIcon night = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.nightcrawler.png");
                            botones[f][c].setIcon(night);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Gambit")&& turnoPara.equals("Heroe")){
                            ImageIcon gambit = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.gambit.png");
                            botones[f][c].setIcon(gambit);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Spider Girl")&& turnoPara.equals("Heroe")){
                            ImageIcon spidey = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.spidergirl.png");
                            botones[f][c].setIcon(spidey);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Ice Man")&& turnoPara.equals("Heroe")){
                            ImageIcon ice = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.ice_man.png");
                            botones[f][c].setIcon(ice);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Storm") && turnoPara.equals("Heroe")){
                            ImageIcon storm = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.storm.png");
                            botones[f][c].setIcon(storm);
                            botones[f][c].habilitado=true;
                    }
                }
            }
        // ubicando bombas y tierra villanos
        int colTV = getRandom(1,8);
        ImageIcon tierrav = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/bombaV/planet_earth_villano.png");
        ImageIcon pumpkin = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/bombaV/pumpkin_bomb.png");
               if (turnoPara=="Heroe"){
                botones[0][colTV].setIcon(desconocido);
                botones[0][colTV].SetCharacter(tierraV);
                botones[0][colTV].habilitado=false;
                botones[0][colTV-1].setIcon(desconocido);
                botones[0][colTV-1].SetCharacter(bombaV);
                botones[0][colTV-1].habilitado=false;
                botones[0][colTV+1].setIcon(desconocido);
                botones[0][colTV+1].SetCharacter(bombaV);
                botones[0][colTV+1].habilitado=false;
                botones[1][colTV].setIcon(desconocido);
                botones[1][colTV].SetCharacter(bombaV);
                botones[1][colTV].habilitado=false;
               }else if (turnoPara=="Villano"){
                   botones[0][colTV].setIcon(tierrav);
                botones[0][colTV].SetCharacter(tierraV);
                botones[0][colTV].habilitado=false;
                botones[0][colTV-1].setIcon(pumpkin);
                botones[0][colTV-1].SetCharacter(bombaV);
                botones[0][colTV-1].habilitado=false;
                botones[0][colTV+1].setIcon(pumpkin);
                botones[0][colTV+1].SetCharacter(bombaV);
                botones[0][colTV+1].habilitado=false;
                botones[1][colTV].setIcon(pumpkin);
                botones[1][colTV].SetCharacter(bombaV);
                botones[1][colTV].habilitado=false;
               }

        int pb=1;
        while(pb<=3){
            int f=getRandom(0,1);
            int c=getRandom(0,9);
            if(botones[f][c].character == null) {
//                botones[f][c].setIcon(desconocido);
//                botones[f][c].SetCharacter(bombaV);
//                botones[f][c].habilitado=false;
                botones[f][c].setIcon(pumpkin);
                botones[f][c].SetCharacter(bombaV);
                botones[f][c].habilitado=true;
                pb++;
            }
        }
        
        // ubicando villanos
        for(int posicion_villano=32;posicion_villano>=0;posicion_villano--) {
            int villano_actual = posicion_villano;
            while(posicion_villano==villano_actual) {
                int f,c;
                if(villanos[posicion_villano].Nivel==2)
                    f = getRandom(2,3);
                else
                    f = getRandom(0,3);
                c =getRandom(0,9);
                if(botones[f][c].character == null) {
                    botones[f][c].habilitado=false;
//                  botones[f][c].setText(villanos[posicion_villano].Nombre+"("+String.valueOf(villanos[posicion_villano].Nivel)+" )");
                    botones[f][c].setIcon(desconocido);
                    botones[f][c].SetCharacter(villanos[posicion_villano]);
                    botones[f][c].habilitado=true;
                    villano_actual--;
                }
                   if (botones[f][c].character.Nombre.equals("Dr Doom") && turnoPara.equals("Villano")){
                               ImageIcon doom = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/10.dr_doom.png");
                               botones[f][c].setIcon(doom);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Black Widow") && turnoPara.equals("Villano")){
                               ImageIcon black = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/1.black_widow.png");
                               botones[f][c].setIcon(black);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Galactus")&& turnoPara.equals("Villano")){
                               ImageIcon galactus = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/9.galactus.png");
                               botones[f][c].setIcon(galactus);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Kingpin")&& turnoPara.equals("Villano")){
                               ImageIcon nick = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/8.kingpin.png");
                               botones[f][c].setIcon(nick);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Magneto")&& turnoPara.equals("Villano")){
                               ImageIcon spider = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/8.magneto.png");
                               botones[f][c].setIcon(spider);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Apocalypse")&& turnoPara.equals("Villano")){
                               ImageIcon apocalypse = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/7.apocalypse.png");
                               botones[f][c].setIcon(apocalypse);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("GreenGoblin")&& turnoPara.equals("Villano")){
                               ImageIcon goblin = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/7.green_goblin.png");
                               botones[f][c].setIcon(goblin);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Venom")&& turnoPara.equals("Villano")){
                               ImageIcon venom = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/7.venom.png");
                               botones[f][c].setIcon(venom);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Bullseye")&& turnoPara.equals("Villano")){
                               ImageIcon bullseye = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/6.bullseye.png");
                               botones[f][c].setIcon(bullseye);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Omega Red")&& turnoPara.equals("Villano")){
                               ImageIcon red = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/6.omega_red.png");
                               botones[f][c].setIcon(red);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Onslaught")&& turnoPara.equals("Villano")){
                               ImageIcon ons = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/6.onslaught.png");
                               botones[f][c].setIcon(ons);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Red Skull")&& turnoPara.equals("Villano")){
                               ImageIcon skull = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/6.red_skull.png");
                               botones[f][c].setIcon(skull);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Mystique")&& turnoPara.equals("Villano")){
                               ImageIcon mystique = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/5.mystique.png");
                               botones[f][c].setIcon(mystique);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Mysterio")&& turnoPara.equals("Villano")){
                               ImageIcon misterio = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/5.mysterio.png");
                               botones[f][c].setIcon(misterio);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Dr Octopus")&& turnoPara.equals("Villano")){
                               ImageIcon dr = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/5.dr_octopus.png");
                               botones[f][c].setIcon(dr);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Deadpool")&& turnoPara.equals("Villano")){
                               ImageIcon deadopol = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/5.deadpool.png");
                               botones[f][c].setIcon(deadopol);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Abomination")&& turnoPara.equals("Villano")){
                               ImageIcon abomination = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/4.abomination.png");
                               botones[f][c].setIcon(abomination);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Thanos")&& turnoPara.equals("Villano")){
                               ImageIcon thanos = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/4.thanos.png");
                               botones[f][c].setIcon(thanos);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Black Cat")&& turnoPara.equals("Villano")){
                               ImageIcon cat = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/4.black_cat.png");
                               botones[f][c].setIcon(cat);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Sabretooth")&& turnoPara.equals("Villano")){
                               ImageIcon sabre = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/4.sabretooth.png");
                               botones[f][c].setIcon(sabre);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Juggernaut")&& turnoPara.equals("Villano")){
                               ImageIcon jugger = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.juggernaut.png");
                               botones[f][c].setIcon(jugger);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Rhino")&& turnoPara.equals("Villano")){
                               ImageIcon rhino = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.rhino.png");
                               botones[f][c].setIcon(rhino);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Carnage")&& turnoPara.equals("Villano")){
                               ImageIcon carnage = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.carnage.png");
                               botones[f][c].setIcon(carnage);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Mole Man")&& turnoPara.equals("Villano")){
                               ImageIcon mole = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.mole_man.png");
                               botones[f][c].setIcon(mole);
                           }else if (botones[f][c].character.Nombre.equals("Lizard")&& turnoPara.equals("Villano")){
                               ImageIcon lizard = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.lizard.png");
                               botones[f][c].setIcon(lizard);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Mr Sinister")&& turnoPara.equals("Villano")){
                               ImageIcon sinister = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.Mr_sinister.png");
                               botones[f][c].setIcon(sinister);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Sentinel 1")&& turnoPara.equals("Villano")){
                               ImageIcon sentinel1 = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.sentinel_1.png");
                               botones[f][c].setIcon(sentinel1);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Ultron")&& turnoPara.equals("Villano")){
                               ImageIcon ultron = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.ultron.png");
                               botones[f][c].setIcon(ultron);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Sand Man")&& turnoPara.equals("Villano")){
                               ImageIcon sand = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.sandman.png");
                               botones[f][c].setIcon(sand);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Leader")&& turnoPara.equals("Villano")){
                               ImageIcon leader = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.leader.png");
                               botones[f][c].setIcon(leader);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Viper")&& turnoPara.equals("Villano")){
                               ImageIcon viper = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.viper.png");
                               botones[f][c].setIcon(viper);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Sentinel 2")&& turnoPara.equals("Villano")){
                               ImageIcon sentinel2 = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.sentinel_2.png");
                               botones[f][c].setIcon(sentinel2);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Elektro")&& turnoPara.equals("Villano")){
                               ImageIcon elektro = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.electro.png");
                               botones[f][c].setIcon(elektro);
                               botones[f][c].habilitado=true;
                }
            }
        }
        
    }
    
    private void cambioTurno(){
        ImageIcon desconocido = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/d0016110e6a873f41cc9b232ddf9fdb2bccd5c7a/src/Imagenes_rebeca/desconocido.png");
        if (turnoPara=="Heroe"){
            turnoPara="Villano";
        }else{
            turnoPara="Heroe";
        }
        for(int f=0; f<10;f++) {
            for(int c=0;c<10;c++){
                if(botones[f][c].character!=null){
                    if((turnoPara.equals("Villano"))){
                                         if (botones[f][c].character.Nombre.equals("Dr Doom") && turnoPara.equals("Villano")){
                               ImageIcon doom = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/10.dr_doom.png");
                               botones[f][c].setIcon(doom);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Black Widow") && turnoPara.equals("Villano")){
                               ImageIcon black = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/1.black_widow.png");
                               botones[f][c].setIcon(black);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Galactus")&& turnoPara.equals("Villano")){
                               ImageIcon galactus = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/9.galactus.png");
                               botones[f][c].setIcon(galactus);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Kingpin")&& turnoPara.equals("Villano")){
                               ImageIcon nick = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/8.kingpin.png");
                               botones[f][c].setIcon(nick);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Magneto")&& turnoPara.equals("Villano")){
                               ImageIcon spider = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/8.magneto.png");
                               botones[f][c].setIcon(spider);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Apocalypse")&& turnoPara.equals("Villano")){
                               ImageIcon apocalypse = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/7.apocalypse.png");
                               botones[f][c].setIcon(apocalypse);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("GreenGoblin")&& turnoPara.equals("Villano")){
                               ImageIcon goblin = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/7.green_goblin.png");
                               botones[f][c].setIcon(goblin);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Venom")&& turnoPara.equals("Villano")){
                               ImageIcon venom = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/7.venom.png");
                               botones[f][c].setIcon(venom);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Bullseye")&& turnoPara.equals("Villano")){
                               ImageIcon bullseye = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/6.bullseye.png");
                               botones[f][c].setIcon(bullseye);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Omega Red")&& turnoPara.equals("Villano")){
                               ImageIcon red = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/6.omega_red.png");
                               botones[f][c].setIcon(red);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Onslaught")&& turnoPara.equals("Villano")){
                               ImageIcon ons = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/6.onslaught.png");
                               botones[f][c].setIcon(ons);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Red Skull")&& turnoPara.equals("Villano")){
                               ImageIcon skull = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/6.red_skull.png");
                               botones[f][c].setIcon(skull);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Mystique")&& turnoPara.equals("Villano")){
                               ImageIcon mystique = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/5.mystique.png");
                               botones[f][c].setIcon(mystique);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Mysterio")&& turnoPara.equals("Villano")){
                               ImageIcon misterio = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/5.mysterio.png");
                               botones[f][c].setIcon(misterio);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Dr Octopus")&& turnoPara.equals("Villano")){
                               ImageIcon dr = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/5.dr_octopus.png");
                               botones[f][c].setIcon(dr);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Deadpool")&& turnoPara.equals("Villano")){
                               ImageIcon deadopol = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/5.deadpool.png");
                               botones[f][c].setIcon(deadopol);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Abomination")&& turnoPara.equals("Villano")){
                               ImageIcon abomination = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/4.abomination.png");
                               botones[f][c].setIcon(abomination);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Thanos")&& turnoPara.equals("Villano")){
                               ImageIcon thanos = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/4.thanos.png");
                               botones[f][c].setIcon(thanos);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Black Cat")&& turnoPara.equals("Villano")){
                               ImageIcon cat = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/4.black_cat.png");
                               botones[f][c].setIcon(cat);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Sabretooth")&& turnoPara.equals("Villano")){
                               ImageIcon sabre = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/4.sabretooth.png");
                               botones[f][c].setIcon(sabre);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Juggernaut")&& turnoPara.equals("Villano")){
                               ImageIcon jugger = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.juggernaut.png");
                               botones[f][c].setIcon(jugger);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Rhino")&& turnoPara.equals("Villano")){
                               ImageIcon rhino = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.rhino.png");
                               botones[f][c].setIcon(rhino);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Carnage")&& turnoPara.equals("Villano")){
                               ImageIcon carnage = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.carnage.png");
                               botones[f][c].setIcon(carnage);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Mole Man")&& turnoPara.equals("Villano")){
                               ImageIcon mole = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.mole_man.png");
                               botones[f][c].setIcon(mole);
                           }else if (botones[f][c].character.Nombre.equals("Lizard")&& turnoPara.equals("Villano")){
                               ImageIcon lizard = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/3.lizard.png");
                               botones[f][c].setIcon(lizard);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Mr Sinister")&& turnoPara.equals("Villano")){
                               ImageIcon sinister = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.Mr_sinister.png");
                               botones[f][c].setIcon(sinister);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Sentinel 1")&& turnoPara.equals("Villano")){
                               ImageIcon sentinel1 = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.sentinel_1.png");
                               botones[f][c].setIcon(sentinel1);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Ultron")&& turnoPara.equals("Villano")){
                               ImageIcon ultron = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.ultron.png");
                               botones[f][c].setIcon(ultron);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Sand Man")&& turnoPara.equals("Villano")){
                               ImageIcon sand = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.sandman.png");
                               botones[f][c].setIcon(sand);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Leader")&& turnoPara.equals("Villano")){
                               ImageIcon leader = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.leader.png");
                               botones[f][c].setIcon(leader);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Viper")&& turnoPara.equals("Villano")){
                               ImageIcon viper = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.viper.png");
                               botones[f][c].setIcon(viper);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Sentinel 2")&& turnoPara.equals("Villano")){
                               ImageIcon sentinel2 = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.sentinel_2.png");
                               botones[f][c].setIcon(sentinel2);
                               botones[f][c].habilitado=true;
                           }else if (botones[f][c].character.Nombre.equals("Elektro")&& turnoPara.equals("Villano")){
                               ImageIcon elektro = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/villanos/2.electro.png");
                               botones[f][c].setIcon(elektro);
                               botones[f][c].habilitado=true;
                }
                    }else
                        if (turnoPara.equals("Heroe")){
                           if (botones[f][c].character.Nombre.equals("Mr Fantastic") && turnoPara.equals("Heroe")){
                            ImageIcon fantastic = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/10.mr_fantastic.png");
                            botones[f][c].setIcon(fantastic);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Captain America")&& turnoPara.equals("Heroe")){
                            ImageIcon america = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/9.cap_america.png");
                            botones[f][c].setIcon(america);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Professor X")&& turnoPara.equals("Heroe")){
                            ImageIcon professor = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/8.professor_x.png");
                            botones[f][c].setIcon(professor);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Nick Fury")&& turnoPara.equals("Heroe")){
                            ImageIcon nick = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/8.nick_fury.png");
                            botones[f][c].setIcon(nick);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Spider Man")&& turnoPara.equals("Heroe")){
                            ImageIcon spider = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/7.spiderman.png");
                            botones[f][c].setIcon(spider);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Wolverine")&& turnoPara.equals("Heroe")){
                            ImageIcon wolve = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/7.wolverine.png");
                            botones[f][c].setIcon(wolve);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Namor")&& turnoPara.equals("Heroe")){
                            ImageIcon namor = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/7.namor.png");
                            botones[f][c].setIcon(namor);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Daredevil")&& turnoPara.equals("Heroe")){
                            ImageIcon daredevil = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/6.daredevil.png");
                            botones[f][c].setIcon(daredevil);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Silver Surfer")&& turnoPara.equals("Heroe")){
                            ImageIcon silver = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/6.silver_surfer.png");
                            botones[f][c].setIcon(silver);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Hulk")&& turnoPara.equals("Heroe")){
                            ImageIcon hulk = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/6.hulk.png");
                            botones[f][c].setIcon(hulk);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Iron Man")&& turnoPara.equals("Heroe")){
                            ImageIcon iron = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/6.ironman.png");
                            botones[f][c].setIcon(iron);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Thor")&& turnoPara.equals("Heroe")){
                            ImageIcon thor = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/5.thor.png");
                            botones[f][c].setIcon(thor);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Human Torch")&& turnoPara.equals("Heroe")){
                            ImageIcon torch = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/5.human_torch.png");
                            botones[f][c].setIcon(torch);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Ciclope")&& turnoPara.equals("Heroe")){
                            ImageIcon ciclope = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/5.ciclope.png");
                            botones[f][c].setIcon(ciclope);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Invisible Woman")&& turnoPara.equals("Heroe")){
                            ImageIcon invisible = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/5.invisible_woman.png");
                            botones[f][c].setIcon(invisible);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Ghost Rider")&& turnoPara.equals("Heroe")){
                            ImageIcon ghost = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/4.ghost_rider.png");
                            botones[f][c].setIcon(ghost);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Punisher")&& turnoPara.equals("Heroe")){
                            ImageIcon punisher = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/4.punisher.png");
                            botones[f][c].setIcon(punisher);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Blade")&& turnoPara.equals("Heroe")){
                            ImageIcon blade = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/4.blade.png");
                            botones[f][c].setIcon(blade);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Thing")&& turnoPara.equals("Heroe")){
                            ImageIcon thing = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/4.thing.png");
                            botones[f][c].setIcon(thing);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Emma Frost")&& turnoPara.equals("Heroe")){
                            ImageIcon emma = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.emma_frost.png");
                            botones[f][c].setIcon(emma);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("She Hulk")&& turnoPara.equals("Heroe")){
                            ImageIcon shehulk = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.she-hulk.png");
                            botones[f][c].setIcon(shehulk);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Giant Man")&& turnoPara.equals("Heroe")){
                            ImageIcon giant = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.giant_man.png");
                            botones[f][c].setIcon(giant);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Beast")&& turnoPara.equals("Heroe")){
                            ImageIcon beast = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.beast.png");
                            botones[f][c].setIcon(beast);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Colossus")&& turnoPara.equals("Heroe")){
                            ImageIcon colossus = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/3.colossus.png");
                            botones[f][c].setIcon(colossus);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Black Widow")&& turnoPara.equals("Heroe")){
                            ImageIcon widow = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/1.black_widow.png");
                            botones[f][c].setIcon(widow);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Phoenix")&& turnoPara.equals("Heroe")){
                            ImageIcon phoenix = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.phoenix.png");
                            botones[f][c].setIcon(phoenix);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Elektra")&& turnoPara.equals("Heroe")){
                            ImageIcon elektra = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.elektra.png");
                            botones[f][c].setIcon(elektra);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Dr Strange")&& turnoPara.equals("Heroe")){
                            ImageIcon strange = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.dr_strange.png");
                            botones[f][c].setIcon(strange);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Nightcrawler")&& turnoPara.equals("Heroe")){
                            ImageIcon night = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.nightcrawler.png");
                            botones[f][c].setIcon(night);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Gambit")&& turnoPara.equals("Heroe")){
                            ImageIcon gambit = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.gambit.png");
                            botones[f][c].setIcon(gambit);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Spider Girl")&& turnoPara.equals("Heroe")){
                            ImageIcon spidey = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.spidergirl.png");
                            botones[f][c].setIcon(spidey);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Ice Man")&& turnoPara.equals("Heroe")){
                            ImageIcon ice = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.ice_man.png");
                            botones[f][c].setIcon(ice);
                            botones[f][c].habilitado=true;
                        }else if (botones[f][c].character.Nombre.equals("Storm") && turnoPara.equals("Heroe")){
                            ImageIcon storm = createImageIconFromURL("https://raw.githubusercontent.com/Rpaz17/ProyectoFinal_Grupo7/c71ad81f0a4f14e6331dc634354cc3cf5c57016e/src/Imagenes_rebeca/heroes_tablero/2.storm.png");
                            botones[f][c].setIcon(storm);
                            botones[f][c].habilitado=true;
                    }
                           botones[f][c].habilitado=false;
                    }else {
                        botones[f][c].habilitado=false;
                        if (botones[f][c].habilitado==false){
                        botones[f][c].setIcon(desconocido);
                        }
                    }
                }
            }
        }
    }
    
    public boolean Ganador(){
          String nosee=String.valueOf(persona.getFecha());
            persona.agregarFecha(nosee, persona.getNombreUser(), oponente.getOponente(), turnoPara);
//        String jugador1 = persona.getNombreUser(); //nombre del jugador
//        String personajesUsados1=jugador.getJugador2(); // heroes o villanos
//       String personajesUsados2= jugador.getJugador1();
        if ( ganadorHeroe==true && ganadorVillano==false){
            JOptionPane.showMessageDialog(null,"FElLICIDADES HEROES LE HAN GANADO A LOS VILLANOS SALVANDO LA TIERRA", "FIN DE LA PARTIDA", HEIGHT);

            this.setVisible(false);
        }else if(ganadorHeroe==true && villanos.length==0){
            JOptionPane.showMessageDialog(null,"FElLICIDADES HEROES LE HAN GANADO A LOS VILLANOS YA QUE LOS VILLANOS SE HAN QUEDADO SIN MOVIMIENTOS", "FIN DE LA PARTIDA", HEIGHT);

            this.setVisible(false);
        } else if (ganadorVillano==true && ganadorHeroe==false){
            JOptionPane.showMessageDialog(null, "FELICIDADES VILLANOS LE HAN GANADO A LOS HEROES CAPTURANDO LA TIERRA!", "FIN DE LA PARTIDA", HEIGHT);

            this.setVisible(false);
        }else if(ganadorVillano==true && heroes.length==0){
             JOptionPane.showMessageDialog(null,"FElLICIDADES VILLANOS LE HAN GANADO A LOS HEROES YA QUE LOS HEROES SE HAN QUEDADO SIN MOVIMIENTOS", "FIN DE LA PARTIDA", HEIGHT);

            this.setVisible(false);
        }else if( ganadorVillano==false && ganadorHeroe==false && villanos.length==0 && heroes.length==0){
            JOptionPane.showMessageDialog(null, "QUEDARON EN EMPATE!", "FIN DE LA PARTIDA", HEIGHT);

            this.setVisible(false);
        }
         this.setVisible(false);
        return false;
    }
    
    private int getRandom(int min, int max) {
        return (int)Math.floor(Math.random() * (max - min + 1) + min);
    }
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
