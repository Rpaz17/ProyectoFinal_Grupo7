package grupo7_poryectofinalsm;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import login.*;
import proyecto.*;
import java.util.Date;
        
public class TableroStratego extends JFrame {
    private Cuadro[][] botones = new Cuadro[10][10];
    Persona persona;
    VentaLogin ventana;
    bando jugador;
    settings configuracion;
     private BufferedImage image;
     private Personaje[] heroes = new Personaje[33];
     private Personaje[] villanos = new Personaje[33];
     private Personaje bombaH;
     private Personaje bombaV;
     private Personaje tierraH;
     private Personaje tierraV;
     private String turnoPara="Heroe";
     
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_menu = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_menu.setText("RENDIRSE");
        btn_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_menuMouseClicked(evt);
            }
        });
        jPanel5.add(btn_menu);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
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

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, -2, 760, 770));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        int confirmacion=JOptionPane.showConfirmDialog(rootPane, "Estas seguro que deseas rendirte? Perderas tus puntos en la partida!", "", JOptionPane.YES_NO_OPTION);
        if(confirmacion == JOptionPane.YES_OPTION){
            menu_principal menu = new menu_principal(ventana,persona,configuracion);
            menu.setVisible(true);
            this.setVisible(false);
        }else if ( confirmacion == JOptionPane.NO_OPTION){
            this.setVisible(true);
        }        
    }//GEN-LAST:event_btn_menuMouseClicked

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
                        if(botonPresionado.character==null && mover) {
                            botonInicio.setBorder(BorderFactory.createEmptyBorder());
                            botonPresionado.SetCharacter( botonInicio.character);
                            botonPresionado.setText(botonInicio.getText());
                            botonInicio.setText("");
                            botonInicio.character=null;
                            botonInicio=null;
                            cambioTurno();
    //                    botonInicio.setImage();
    //                    botonFinal.setImage();
                       } else if(botonInicio.character.Tipo.equals(botonPresionado.character.Tipo)) { 
                            botonInicio.setBorder(BorderFactory.createEmptyBorder());
                            botonPresionado.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
                            botonInicio = botonPresionado;
                            botonInicio.setText(text);
                        } else if (botonPresionado.character !=null && mover 
                                        && !(botonPresionado.character.Nombre.equals("Pumpkin Bomb") && botonInicio.character.Tipo.equals("Villano"))
                                        && !(botonPresionado.character.Nombre.equals("Nova Blast") && botonInicio.character.Tipo.equals("Heroe"))){ 
                            botonInicio.setBorder(BorderFactory.createEmptyBorder());
                            if ((botonInicio.character.Nivel==10 && botonPresionado.character.Nivel==1)){
                                botonInicio.character=null;
                                botonInicio.setText(" ");
                            } else if((botonInicio.character.Nivel==1 && botonPresionado.character.Nivel==10)){
                                botonPresionado.character=null;
                                botonPresionado.setText(" ");
                            }else if((botonInicio.character.Nivel==3 && botonPresionado.character.Nivel==11)){
                                botonPresionado.character=null;
                                botonPresionado.setText(" ");
                            }else if((botonInicio.character.Nivel==11 && botonPresionado.character.Nivel==3)){
                                 botonInicio.character=null;
                                 botonInicio.setText(" ");
                            } else if ((botonInicio.character.Tipo.equals("Heroe") && botonPresionado.character.Tipo.equals("tierraV")) 
                                    && (botonInicio.character.Nivel>botonPresionado.character.Nivel)){
                                botonPresionado.character=botonInicio.character;
                                botonInicio.character=null;
                                botonInicio.setText("");
                                Ganador();
                                
                            }else {
                                if(botonInicio.character.Nivel>botonPresionado.character.Nivel){
                                    botonPresionado.character=null;
                                    botonPresionado.setText(" ");
                                    //Falta mover la pieza que se elimino al panel de a lado y llevar contador
                                    // Fa;ta descubrir pieza ganadora
                                } else if(botonInicio.character.Nivel<botonPresionado.character.Nivel){
                                  botonInicio.setText(" ");
                                  botonInicio.character=null;
                                }else if (botonInicio.character.Nivel==botonPresionado.character.Nivel){
                                      botonPresionado.character=null;
                                      botonPresionado.setText(" ");
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
//    private void botonesActionPerformed(java.awt.event.ActionEvent evt) {
//        Object source = evt.getSource();
//        String Name = ((JButton) source).getName();
//        int bWidth =((JButton) source).getWidth();
//        int bHeight = ((JButton) source).getHeight();
//        int offset = ((JButton) source).getInsets().left;
//        if(Name.equals("0")) {
//            ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes_rebeca/10.mr_fantastic.png"));            
//            Icon iconr = resizeIcon(icon , bWidth - offset , bHeight - offset);
//            botones[0][0].setIcon(iconr); 
//        }
//    }
    private void botonesPropertyChange(java.beans.PropertyChangeEvent evt) {
// TODO add your handling code here:
    }
    
    private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
        return new ImageIcon(resizedImage);
    }
    
    private void initPersonajes() {
        heroes[0] = new Personaje("Heroe", 10, "Mr Fantastic", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[1] = new Personaje("Heroe", 9, "Captain America", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[2] = new Personaje("Heroe", 8, "Professor X", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[3] = new Personaje("Heroe", 8, "Nick Fury", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[4] = new Personaje("Heroe", 7, "Spider Man", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[5] = new Personaje("Heroe", 7 ,"Wolverine", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[6] = new Personaje("Heroe", 7, "Namor", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[7] = new Personaje("Heroe", 6, "Daredevil", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[8] = new Personaje("Heroe", 6, "Silver Surfer", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[9] = new Personaje("Heroe", 6, "Hulk", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[10] = new Personaje("Heroe", 6, "Iron Man", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[11] = new Personaje("Heroe", 5, "Thor", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[12] = new Personaje("Heroe", 5, "Human Torch", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[13] = new Personaje("Heroe", 5, "Cyclops", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[14] = new Personaje("Heroe",5, "Invisible Woman", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[15] = new Personaje("Heroe", 4, "Ghost Rider", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[16] = new Personaje("Heroe", 4, "Punisher", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[17] = new Personaje("Heroe", 4, "Blade", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[18] = new Personaje("Heroe", 4, "Thing", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[19] = new Personaje("Heroe", 3, "Emma Frost", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[20] = new Personaje("Heroe", 3, "She Hulk", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[21] = new Personaje("Heroe", 3, "Giant Man", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[22] = new Personaje("Heroe", 3, "Beast", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[23] = new Personaje("Heroe", 3, "Colossus", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[24] = new Personaje("Heroe", 1, "Black Widow", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[25] = new Personaje("Heroe", 2, "Phoenix", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[26] = new Personaje("Heroe", 2, "Elektra", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[27] = new Personaje("Heroe", 2, "Dr Strange", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[28] = new Personaje("Heroe", 2, "Nightcrawler", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[29] = new Personaje("Heroe", 2, "Gambit", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[30] = new Personaje("Heroe", 2, "Spider Girl", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[31] = new Personaje("Heroe", 2, "Ice Man", "/Imagenes_rebeca/10.mr_fantastic.png");
        heroes[32] = new Personaje("Heroe", 2, "Storm", "/Imagenes_rebeca/10.mr_fantastic.png");

        
        villanos[0] = new Personaje("Villano", 10, "Dr Doom", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[1] = new Personaje("Villano", 9, "Galactus", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[2] = new Personaje("Villano", 8, "Kingpin", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[3] = new Personaje("Villano", 8, "Magneto", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[4] = new Personaje("Villano", 7, "Apocalypse", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[5] = new Personaje("Villano", 7 ,"GreenGoblin", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[6] = new Personaje("Villano", 7, "Venom", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[7] = new Personaje("Villano", 6, "Bullseye", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[8] = new Personaje("Villano", 6, "Omega Red", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[9] = new Personaje("Villano", 6, "Onslaught", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[10] = new Personaje("Villano", 6, "Red Skull", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[11] = new Personaje("Villano", 5, "Mystique", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[12] = new Personaje("Villano", 5, "Mysterio", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[13] = new Personaje("Villano", 5, "Dr Octopus", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[14] = new Personaje("Villano",5, "Deadpool", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[15] = new Personaje("Villano", 4, "Abomination", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[16] = new Personaje("Villano", 4, "Thanos", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[17] = new Personaje("Villano", 4, "Black Cat", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[18] = new Personaje("Villano", 4, "Sabretooth", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[19] = new Personaje("Villano", 3, "Juggernaut", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[20] = new Personaje("Villano", 3, "Rhino", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[21] = new Personaje("Villano", 3, "Carnage", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[22] = new Personaje("Villano", 3, "Mole Man", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[23] = new Personaje("Villano", 3, "Lizzard", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[24] = new Personaje("Villano", 1, "Black Widow", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[25] = new Personaje("Villano", 2, "Mr Sinister", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[26] = new Personaje("Villano", 2, "Sentinel 1", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[27] = new Personaje("Villano", 2, "Ultron", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[28] = new Personaje("Villano", 2, "Sand Man", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[29] = new Personaje("Villano", 2, "Leader", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[30] = new Personaje("Villano", 2, "Viper", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[31] = new Personaje("Villano", 2, "Sentinel 2", "/Imagenes_rebeca/10.mr_fantastic.png");
        villanos[32] = new Personaje("Villano", 2, "Elektro", "/Imagenes_rebeca/10.mr_fantastic.png");
        
        tierraH = new Personaje("Tierra", 0, "Tierra Heroes", "/Imagenes_rebeca/bombaH/heroes_planet_earth.png");
        tierraV = new Personaje("Tierra", 0, "Tierra Villanos", "/Imagenes_rebeca/bombaV/planet_earth_villano.png");
        bombaH = new Personaje("Bomba", 11, "Nova Blast", "/Imagenes_rebeca/bombaH/nova_blast.png");
        bombaV = new Personaje("Bomba", 11, "Pumpkin Bomb", "/Imagenes_rebeca/bombaV/pumpkin_bomb.png");
    }
    
    private void setPersonajes(){
        int colTH = getRandom(1,8);
        botones[9][colTH].setText("Tierra H");
        botones[9][colTH].SetCharacter(tierraH);
//        botones[9][colTH].setImage();
        botones[9][colTH-1].setText("Nova Blast");
        botones[9][colTH-1].SetCharacter(bombaH);
//        botones[9][colTH].setImage();
        botones[9][colTH+1].setText("Nova Blast");
        botones[9][colTH+1].SetCharacter(bombaH);
//        botones[9][colTH].setImage();
        botones[8][colTH].setText("Nova Blast");
        botones[8][colTH].SetCharacter(bombaH);
//        botones[8][colTH].setImage();
        int nb=1; //Nueva Bomba
        while(nb<=3){
            int f=getRandom(8,9);
            int c=getRandom(0,9);
            if(botones[f][c].character==null){
                botones[f][c].setText("Nova Blast");
                botones[f][c].SetCharacter(bombaH);
                nb++;
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
                }
            }
        }
        // ubicando bombas y tierra villanos
        int colTV = getRandom(1,8);
        botones[0][colTV].setText("????");
        botones[0][colTV].SetCharacter(tierraV);
        botones[0][colTV].habilitado=false;
        botones[0][colTV-1].setText("????");
        botones[0][colTV-1].SetCharacter(bombaV);
        botones[0][colTV-1].habilitado=false;
        botones[0][colTV+1].setText("????");
        botones[0][colTV+1].SetCharacter(bombaV);
        botones[0][colTV+1].habilitado=false;
        botones[1][colTV].setText("????");
        botones[1][colTV].SetCharacter(bombaV);
        botones[1][colTV].habilitado=false;
        int pb=1;
        while(pb<=3){
            int f=getRandom(0,1);
            int c=getRandom(0,9);
            if(botones[f][c].character == null) {
                botones[f][c].setText("????");
                botones[f][c].SetCharacter(bombaV);
                botones[f][c].habilitado=false;
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
                    botones[f][c].setText("????");
                    botones[f][c].SetCharacter(villanos[posicion_villano]);
                    botones[f][c].habilitado=false;
                    villano_actual--;
                }
            }
        }
        
    }
    
    private void cambioTurno(){
        if (turnoPara=="Heroe"){
            turnoPara="Villano";
        }else{
            turnoPara="Heroe";
        }
        for(int f=0; f<10;f++) {
            for(int c=0;c<10;c++){
                if(botones[f][c].character!=null){
                    if(botones[f][c].character.Tipo==turnoPara || (turnoPara.equals("Villano") && botones[f][c].character.Nombre.equals("Pumpkin Bomb")) || (turnoPara.equals("Villano") && botones[f][c].character.Nombre.equals("Tierra Villanos"))
                            || (turnoPara.equals("Heroe") && botones[f][c].character.Nombre.equals("Nova Blast")) || (turnoPara.equals("Heroe") && botones[f][c].character.Nombre.equals("Tierra Heroes"))){
                        botones[f][c].setText(botones[f][c].character.Nombre+"("+String.valueOf(botones[f][c].character.Nivel)+")");
                        botones[f][c].habilitado=true;
                    }else{
                        botones[f][c].setText("????");
                        botones[f][c].habilitado=false;
                    }
                }
            }
        }
    }
    public void Ganador(){
        Date dia = new Date();
        String jugador1 = persona.getNombreUser();//nombre del jugador
        String jugador2=jugador.getJugador2(); // heroes o villanos
       String personajesUsados1= jugador.getJugador1();
        String ganador="";
        if ( personajesUsados1=="Heroes" ){
            ganador=jugador1;
            System.out.println("FELICIDADES "+ganador+" has ganado utilizando "+personajesUsados1+"SALVANDO la TIERRA!");
        }else if (personajesUsados1=="Villanos"){
            ganador=jugador1;
            System.out.println("FELICIDADES "+ganador+" has ganado utilizando "+personajesUsados1+" CAPTURANDO la TIERRA");
        }else if( jugador1 == persona.getNombreUser() && villanos.length==0){
          ganador=jugador1;
            System.out.println("FELICIDADES "+ganador+" usando HEROES ha ganado ya que los VILLANOS se han retirado del juego!");
        }
    }
    private int getRandom(int min, int max) {
        return (int)Math.floor(Math.random() * (max - min + 1) + min);
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
