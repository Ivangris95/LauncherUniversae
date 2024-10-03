package Activitys;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import launcheruniversae.universaeApp;
import launcheruniversae.utility;

public class simulatorActivity extends javax.swing.JPanel {

    private JLabel[] dotArray;
    private String[] imagesArray = new String[5];
    private int index;
    private universaeApp uniApp;
    private HomeActivity home;

    Dimension dimensionImgPrincipal = new Dimension(830, 450);
    Dimension dimensionImgFondo = new Dimension(480, 380);
    Dimension dotDimension = new Dimension(15, 15);

    public simulatorActivity(int indexGrado, int indexSimulador) {
        initComponents();

        uniApp = new universaeApp();

        imagesArray = utility.CreateArrayWithImages(imagesArray,indexGrado, indexSimulador);
        dotArray = new JLabel[]{indice1, indice2, indice3, indice4, indice5};
        index = 0;

        tittleTxt.setText(uniApp.getTituloSimulacion(indexGrado, indexSimulador));
        descripcionTxt.setText(uniApp.getDescripcionSimulacion(indexGrado, indexSimulador));

        setVisible(true);
        
        System.out.println("Grado = " + indexGrado + ", Simulador = " + indexSimulador);
    }

    public void iniciarSimulator() {
        Dimension dimensionBtnStart = new Dimension(253, 44);
        Dimension dimensionBtnStartHover = new Dimension(258, 49);
        Dimension dimensionBtnStartPressed = new Dimension(248, 39);

        Dimension dimensionBtnRigthAndLeft = new Dimension(21, 32);
        Dimension dimensionBtnRightAndLeftHover = new Dimension(23, 35);
        Dimension dimensionBtnRightAndLeftOPressed = new Dimension(19, 30);

        utility.SetImageLabel(comenzarBtn, "src/images/Comenzar.png", dimensionBtnStart);
        utility.SetImageLabel(flechaRight, "src/images/Flecha derecha.png", dimensionBtnRigthAndLeft);
        utility.SetImageLabel(flechaLeft, "src/images/Flecha izquierda.png", dimensionBtnRigthAndLeft);
        utility.SetImageLabel(principalImg, imagesArray[0], dimensionImgPrincipal);
        utility.SetImageLabel(lFondo, imagesArray[4], dimensionImgFondo);
        utility.SetImageLabel(rFondo, imagesArray[1], dimensionImgFondo);

        flechaLeft.addMouseListener(new MouseAdapter() {

            String urlFlechaLeft = "src/images/Flecha izquierda.png";

            @Override
            public void mouseEntered(MouseEvent e) {
                utility.SetImageLabel(flechaLeft, urlFlechaLeft, dimensionBtnRightAndLeftHover);
                flechaLeft.setCursor(new Cursor(Cursor.HAND_CURSOR));
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

            @Override
            public void mouseClicked(MouseEvent e) {

                index--;

                if (index < 0) {
                    index = 4;
                }

                funcionalidadCarrusel(index);
            }
        }
        );

        flechaRight.addMouseListener(
                new MouseAdapter() {

            String urlFlechaRight = "src/images/Flecha derecha.png";

            @Override
            public void mouseEntered(MouseEvent e
            ) {
                utility.SetImageLabel(flechaRight, urlFlechaRight, dimensionBtnRightAndLeftHover);
            }

            @Override
            public void mouseExited(MouseEvent e
            ) {
                utility.SetImageLabel(flechaRight, urlFlechaRight, dimensionBtnRigthAndLeft);
            }

            @Override
            public void mousePressed(MouseEvent e
            ) {
                utility.SetImageLabel(flechaRight, urlFlechaRight, dimensionBtnRightAndLeftOPressed);
            }

            @Override
            public void mouseReleased(MouseEvent e
            ) {
                utility.SetImageLabel(flechaRight, urlFlechaRight, dimensionBtnRigthAndLeft);
            }

            @Override
            public void mouseClicked(MouseEvent e) {

                index++;

                if (index > 4) {
                    index = 0;
                }

                funcionalidadCarrusel(index);
            }
        }
        );

        comenzarBtn.addMouseListener(
                new MouseAdapter() {

            String urlBtnBegin = "src/images/Comenzar.png";

            @Override
            public void mouseEntered(MouseEvent e
            ) {
                utility.SetImageLabel(comenzarBtn, urlBtnBegin, dimensionBtnStartHover);
            }

            @Override
            public void mouseExited(MouseEvent e
            ) {
                utility.SetImageLabel(comenzarBtn, urlBtnBegin, dimensionBtnStart);
            }

            @Override
            public void mousePressed(MouseEvent e
            ) {
                utility.SetImageLabel(comenzarBtn, urlBtnBegin, dimensionBtnStartPressed);
            }

            @Override
            public void mouseReleased(MouseEvent e
            ) {
                utility.SetImageLabel(comenzarBtn, urlBtnBegin, dimensionBtnStart);
            }
        }
        );
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
        indice1 = new javax.swing.JLabel();
        indice2 = new javax.swing.JLabel();
        indice3 = new javax.swing.JLabel();
        indice4 = new javax.swing.JLabel();
        indice5 = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        tittleTxt = new javax.swing.JLabel();
        descripcionTxt = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comenzarBtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(10, 38, 72));
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
        flechaRight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        indice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselFilled.png"))); // NOI18N
        indiceImg.add(indice1);

        indice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        indice2.setPreferredSize(new java.awt.Dimension(15, 15));
        indiceImg.add(indice2);

        indice3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        indice3.setPreferredSize(new java.awt.Dimension(15, 15));
        indiceImg.add(indice3);

        indice4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        indice4.setPreferredSize(new java.awt.Dimension(15, 15));
        indiceImg.add(indice4);

        indice5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        indice5.setPreferredSize(new java.awt.Dimension(15, 15));
        indiceImg.add(indice5);

        add(indiceImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 100, 20));

        infoPanel.setOpaque(false);
        infoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Barrita aislada descripción.png"))); // NOI18N
        infoPanel.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, 10, 30));

        tittleTxt.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        tittleTxt.setForeground(new java.awt.Color(255, 255, 255));
        tittleTxt.setText("Esto será un título de la simulación");
        infoPanel.add(tittleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 6, 1041, -1));

        descripcionTxt.setEditable(false);
        descripcionTxt.setBorder(null);
        descripcionTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descripcionTxt.setForeground(new java.awt.Color(255, 255, 255));
        descripcionTxt.setText("Esto será una descripción de la simulación");
        descripcionTxt.setOpaque(false);
        infoPanel.add(descripcionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 874, 97));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Coordinación de emergencias y protección civil. ");
        infoPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 880, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Planificación y supervisión del mantenimiento de equipos, medios técnicos e instalaciones. ");
        infoPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 880, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fácil");
        infoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 880, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestión de recursos de emergencias y protección civil ");
        infoPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 880, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("10 minutos. ");
        infoPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 880, 30));

        add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 1070, 320));

        comenzarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comenzarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Comenzar.png"))); // NOI18N
        comenzarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comenzarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comenzarBtnMouseClicked(evt);
            }
        });
        add(comenzarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 770, 263, 54));
    }// </editor-fold>//GEN-END:initComponents

    Dimension dimensionBtnRightAndLeftOPressed = new Dimension(12, 25);
    private void flechaLeftMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaLeftMousePressed
        utility.SetImageLabel(flechaLeft, "src/images/Flecha izquierda.png", dimensionBtnRightAndLeftOPressed);
    }//GEN-LAST:event_flechaLeftMousePressed

    private void comenzarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comenzarBtnMouseClicked
        try {
            String rutaEjecutable = "C:/Users/loco8/OneDrive/Escritorio/QuizDemo/QuizDemo.exe";
            Runtime.getRuntime().exec(rutaEjecutable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_comenzarBtnMouseClicked

    private void funcionalidadCarrusel(int index) {

        if (index == 0) {
            utility.SetImageLabel(lFondo, imagesArray[4], dimensionImgFondo);
        } else {
            utility.SetImageLabel(lFondo, imagesArray[index - 1], dimensionImgFondo);
        }

        utility.SetImageLabel(principalImg, imagesArray[index], dimensionImgPrincipal);

        if (index == 4) {
            utility.SetImageLabel(rFondo, imagesArray[0], dimensionImgFondo);
        } else {
            utility.SetImageLabel(rFondo, imagesArray[index + 1], dimensionImgFondo);
        }

        for (int i = 0; i < dotArray.length; i++) {
            if (i == index) {
                utility.SetImageLabel(dotArray[i], "src/images/PuntoCarruselFilled.png", dotDimension);
            } else {
                utility.SetImageLabel(dotArray[i], "src/images/PuntoCarruselEmpty.png", dotDimension);

            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel comenzarBtn;
    private javax.swing.JTextPane descripcionTxt;
    private javax.swing.JLabel flechaLeft;
    private javax.swing.JLabel flechaRight;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel indice1;
    private javax.swing.JLabel indice2;
    private javax.swing.JLabel indice3;
    private javax.swing.JLabel indice4;
    private javax.swing.JLabel indice5;
    private javax.swing.JPanel indiceImg;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lFondo;
    private javax.swing.JLabel principalImg;
    private javax.swing.JLabel rFondo;
    private javax.swing.JLabel tittleTxt;
    // End of variables declaration//GEN-END:variables
}
