
package Activitys;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import launcheruniversae.utility;

public class simulatorActivity extends javax.swing.JPanel {

    public simulatorActivity() {
        initComponents();
        setVisible(true);
    }
    
    public void iniciarSimulator (){
        
        Dimension dimensionBtnStart = new Dimension(253, 44);
        Dimension dimensionBtnStartHover = new Dimension(258,49);
        Dimension dimensionBtnStartPressed = new Dimension(248, 39);
        
        Dimension dimensionBtnRigthAndLeft = new Dimension(21,32);
        Dimension dimensionBtnRightAndLeftHover = new Dimension(23, 35);
        Dimension dimensionBtnRightAndLeftOPressed = new Dimension(19,30);
        
        Dimension dimensionImgPrincipal = new Dimension(830,450);
        Dimension dimensionImgFondo = new Dimension(480,380);
        
        
       
        
        utility.SetImageLabel(beginBtn, "src/images/Comenzar.png",dimensionBtnStart);
        utility.SetImageLabel(flechaRight, "src/images/Flecha derecha.png", dimensionBtnRigthAndLeft);
        utility.SetImageLabel(flechaLeft, "src/images/Flecha izquierda.png", dimensionBtnRigthAndLeft);
        utility.SetImageLabel(principalImg, "src/images/Embarque0.png", dimensionImgPrincipal);
        utility.SetImageLabel(lFondo, "src/images/Embarque1.png", dimensionImgFondo);
        utility.SetImageLabel(rFondo, "src/images/Embarque2.png", dimensionImgFondo);
        
        flechaLeft.addMouseListener(new MouseAdapter(){
            
        String urlFlechaLeft = "src/images/Flecha izquierda.png";
        
                @Override
                public void mouseEntered(MouseEvent e) {
                utility.SetImageLabel(flechaLeft, urlFlechaLeft, dimensionBtnRightAndLeftHover);
                }
            
                @Override
                public void mouseExited(MouseEvent e) {
                utility.SetImageLabel(flechaLeft, urlFlechaLeft, dimensionBtnRigthAndLeft);
                }
            
                @Override
                public void mousePressed(MouseEvent e) {
                utility.SetImageLabel(flechaLeft, urlFlechaLeft, dimensionBtnRightAndLeftOPressed);               
                }
            
                @Override
                public void mouseReleased(MouseEvent e) {
                utility.SetImageLabel(flechaLeft, urlFlechaLeft, dimensionBtnRigthAndLeft);
                }  
    });   
        
        flechaRight.addMouseListener(new MouseAdapter(){
            
        String urlFlechaRight = "src/images/Flecha derecha.png";
        
                @Override
                public void mouseEntered(MouseEvent e) {
                utility.SetImageLabel(flechaRight, urlFlechaRight, dimensionBtnRightAndLeftHover);
                }
            
                @Override
                public void mouseExited(MouseEvent e) {
                utility.SetImageLabel(flechaRight, urlFlechaRight, dimensionBtnRigthAndLeft);
                }
            
                @Override
                public void mousePressed(MouseEvent e) {
                utility.SetImageLabel(flechaRight, urlFlechaRight, dimensionBtnRightAndLeftOPressed);               
                }
            
                @Override
                public void mouseReleased(MouseEvent e) {
                utility.SetImageLabel(flechaRight, urlFlechaRight, dimensionBtnRigthAndLeft);
                }  
    });   
        
        beginBtn.addMouseListener(new MouseAdapter(){
            
        String urlBtnBegin = "src/images/Comenzar.png";
        
                @Override
                public void mouseEntered(MouseEvent e) {
                utility.SetImageLabel(beginBtn, urlBtnBegin, dimensionBtnStartHover);
                }
            
                @Override
                public void mouseExited(MouseEvent e) {
                utility.SetImageLabel(beginBtn, urlBtnBegin, dimensionBtnStart);
                }
            
                @Override
                public void mousePressed(MouseEvent e) {
                utility.SetImageLabel(beginBtn, urlBtnBegin, dimensionBtnStartPressed);               
                }
            
                @Override
                public void mouseReleased(MouseEvent e) {
                utility.SetImageLabel(beginBtn, urlBtnBegin, dimensionBtnStart);
                }  
    });   
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalImg = new javax.swing.JLabel();
        rFondo = new javax.swing.JLabel();
        lFondo = new javax.swing.JLabel();
        flechaRight = new javax.swing.JLabel();
        flechaLeft = new javax.swing.JLabel();
        indiceImg = new javax.swing.JPanel();
        indicePrincipal = new javax.swing.JLabel();
        indiceVacio0 = new javax.swing.JLabel();
        indiceVacio1 = new javax.swing.JLabel();
        indiceVacio2 = new javax.swing.JLabel();
        indiceVacio3 = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        tittleTxt = new javax.swing.JLabel();
        jTextPane2 = new javax.swing.JTextPane();
        gradoTxt = new javax.swing.JLabel();
        unidadTxt = new javax.swing.JLabel();
        dificultadTxt = new javax.swing.JLabel();
        asignaturaTxt = new javax.swing.JLabel();
        duracionTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        beginBtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(10, 38, 72));
        setEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        principalImg.setBackground(new java.awt.Color(255, 255, 255));
        principalImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        principalImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Embarque0.png"))); // NOI18N
        add(principalImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 830, 450));

        rFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cuadrado fondo enfocado.png"))); // NOI18N
        add(rFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 480, 380));

        lFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cuadrado fondo enfocado.png"))); // NOI18N
        add(lFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 480, 380));

        flechaRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Flecha derecha.png"))); // NOI18N
        add(flechaRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 240, 22, 35));

        flechaLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Flecha izquierda.png"))); // NOI18N
        flechaLeft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flechaLeft.setMaximumSize(new java.awt.Dimension(30, 40));
        flechaLeft.setNextFocusableComponent(flechaLeft);
        flechaLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                flechaLeftMousePressed(evt);
            }
        });
        add(flechaLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 30, 40));

        indiceImg.setOpaque(false);
        indiceImg.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 4, 1));

        indicePrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselFilled.png"))); // NOI18N
        indiceImg.add(indicePrincipal);

        indiceVacio0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        indiceVacio0.setPreferredSize(new java.awt.Dimension(15, 15));
        indiceImg.add(indiceVacio0);

        indiceVacio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        indiceVacio1.setPreferredSize(new java.awt.Dimension(15, 15));
        indiceImg.add(indiceVacio1);

        indiceVacio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        indiceVacio2.setPreferredSize(new java.awt.Dimension(15, 15));
        indiceImg.add(indiceVacio2);

        indiceVacio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        indiceVacio3.setPreferredSize(new java.awt.Dimension(15, 15));
        indiceImg.add(indiceVacio3);

        add(indiceImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 100, 15));

        infoPanel.setOpaque(false);
        infoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Barrita aislada descripción.png"))); // NOI18N
        infoPanel.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, 10, 30));

        tittleTxt.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        tittleTxt.setForeground(new java.awt.Color(255, 255, 255));
        tittleTxt.setText("Mantenimiento de los equipos y herramientas de extinción de incendios forestales. ");
        infoPanel.add(tittleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 6, 1041, -1));

        jTextPane2.setEditable(false);
        jTextPane2.setBorder(null);
        jTextPane2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane2.setText("En un campo de prácticas sumido en el desorden y la confusión tienes que encontrar tienes que encontrar y colocar las partes de los EPIs utilizados en la extinción de incendios forestales. ");
        jTextPane2.setOpaque(false);
        infoPanel.add(jTextPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 1000, 97));

        gradoTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gradoTxt.setForeground(new java.awt.Color(255, 255, 255));
        gradoTxt.setText("Coordinación de emergencias y protección civil. ");
        infoPanel.add(gradoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 830, 30));

        unidadTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        unidadTxt.setForeground(new java.awt.Color(255, 255, 255));
        unidadTxt.setText("Planificación y supervisión del mantenimiento de equipos, medios técnicos e instalaciones. ");
        infoPanel.add(unidadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 830, 30));

        dificultadTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        dificultadTxt.setForeground(new java.awt.Color(255, 255, 255));
        dificultadTxt.setText("Fácil");
        infoPanel.add(dificultadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 830, 30));

        asignaturaTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        asignaturaTxt.setForeground(new java.awt.Color(255, 255, 255));
        asignaturaTxt.setText("Gestión de recursos de emergencias y protección civil ");
        infoPanel.add(asignaturaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 830, 30));

        duracionTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        duracionTxt.setForeground(new java.awt.Color(255, 255, 255));
        duracionTxt.setText("10 minutos. ");
        infoPanel.add(duracionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 830, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Nivel de dificultad:");
        infoPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 150, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Grado:");
        infoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Asignatura:");
        infoPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Unidad:");
        infoPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Duración:");
        infoPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, 30));

        add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 1070, 330));

        beginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        beginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Comenzar.png"))); // NOI18N
        add(beginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 770, 263, 54));
    }// </editor-fold>//GEN-END:initComponents

    Dimension dimensionBtnRightAndLeftOPressed = new Dimension(12,25);
    private void flechaLeftMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaLeftMousePressed
        utility.SetImageLabel(flechaLeft, "src/images/Flecha izquierda.png", dimensionBtnRightAndLeftOPressed);
    }//GEN-LAST:event_flechaLeftMousePressed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asignaturaTxt;
    private javax.swing.JLabel beginBtn;
    private javax.swing.JLabel dificultadTxt;
    private javax.swing.JLabel duracionTxt;
    private javax.swing.JLabel flechaLeft;
    private javax.swing.JLabel flechaRight;
    private javax.swing.JLabel gradoTxt;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel indiceImg;
    private javax.swing.JLabel indicePrincipal;
    private javax.swing.JLabel indiceVacio0;
    private javax.swing.JLabel indiceVacio1;
    private javax.swing.JLabel indiceVacio2;
    private javax.swing.JLabel indiceVacio3;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel lFondo;
    private javax.swing.JLabel principalImg;
    private javax.swing.JLabel rFondo;
    private javax.swing.JLabel tittleTxt;
    private javax.swing.JLabel unidadTxt;
    // End of variables declaration//GEN-END:variables
}
