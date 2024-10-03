package Activitys;

<<<<<<< HEAD
=======
import java.awt.Cursor;
>>>>>>> bd91298f047fd7b1dd51be22904509e51837bca2
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

import launcheruniversae.mainActivity;

import launcheruniversae.utility;

public class HomeActivity extends javax.swing.JPanel {

    public mainActivity padre;

    public HomeActivity() {
        initComponents();

    }

    public void iniciar() {

        JLabel[] simuladores = {simulador1, simulador2, simulador3, simulador4, simulador5, simulador6};

        Dimension dimensionMiniaturas = new Dimension(380, 270);
        Dimension dimensionMiniaturaHover = new Dimension(390, 280);
        Dimension dimensionMiniaturaPressed = new Dimension(375, 265);

        for (int i = 0; i < simuladores.length; i++) {

            String urlHome = "src/images/Grado" + i + ".png";
            utility.SetImageLabel(simuladores[i], urlHome, dimensionMiniaturas);

            final int index = i;

            simuladores[i].addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
<<<<<<< HEAD

                    padre.iniciarSimulacionYMostrarPanel(0);
                    System.out.println("simulador1");
=======
                    padre.iniciarSimulacionYMostrarPanel(index);

>>>>>>> bd91298f047fd7b1dd51be22904509e51837bca2
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    utility.SetImageLabel(simuladores[index], urlHome, dimensionMiniaturaHover);
<<<<<<< HEAD
=======
                    System.out.println("hola mundo");
                    Cursor handCursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
                    simuladores[index].setCursor(handCursor);
                    simuladores[index].revalidate();
                    simuladores[index].repaint();
>>>>>>> bd91298f047fd7b1dd51be22904509e51837bca2
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    utility.SetImageLabel(simuladores[index], urlHome, dimensionMiniaturas);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    utility.SetImageLabel(simuladores[index], urlHome, dimensionMiniaturaPressed);
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    utility.SetImageLabel(simuladores[index], urlHome, dimensionMiniaturas);
                }
            });

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        simulador1 = new javax.swing.JLabel();
        simulador2 = new javax.swing.JLabel();
        simulador3 = new javax.swing.JLabel();
        simulador4 = new javax.swing.JLabel();
        simulador5 = new javax.swing.JLabel();
        simulador6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(10, 38, 72));
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(1550, 880));
        setPreferredSize(new java.awt.Dimension(1550, 880));
        setLayout(new java.awt.GridBagLayout());

        simulador1.setForeground(new java.awt.Color(0, 0, 0));
        simulador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simulador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado0.png"))); // NOI18N
        simulador1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simulador1.setMaximumSize(new java.awt.Dimension(380, 270));
        simulador1.setMinimumSize(new java.awt.Dimension(380, 270));
        simulador1.setPreferredSize(new java.awt.Dimension(400, 300));
        add(simulador1, new java.awt.GridBagConstraints());

        simulador2.setForeground(new java.awt.Color(0, 0, 0));
        simulador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simulador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado1.png"))); // NOI18N
        simulador2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simulador2.setMaximumSize(new java.awt.Dimension(380, 270));
        simulador2.setMinimumSize(new java.awt.Dimension(380, 270));
        simulador2.setPreferredSize(new java.awt.Dimension(400, 300));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 70, 0, 70);
        add(simulador2, gridBagConstraints);

        simulador3.setForeground(new java.awt.Color(0, 0, 0));
        simulador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simulador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado2.png"))); // NOI18N
        simulador3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simulador3.setMaximumSize(new java.awt.Dimension(380, 270));
        simulador3.setMinimumSize(new java.awt.Dimension(380, 270));
        simulador3.setPreferredSize(new java.awt.Dimension(400, 300));
        add(simulador3, new java.awt.GridBagConstraints());

        simulador4.setForeground(new java.awt.Color(0, 0, 0));
        simulador4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simulador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado3.png"))); // NOI18N
        simulador4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simulador4.setMaximumSize(new java.awt.Dimension(380, 270));
        simulador4.setMinimumSize(new java.awt.Dimension(380, 270));
        simulador4.setPreferredSize(new java.awt.Dimension(400, 300));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(110, 0, 0, 0);
        add(simulador4, gridBagConstraints);

        simulador5.setForeground(new java.awt.Color(0, 0, 0));
        simulador5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simulador5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado4.png"))); // NOI18N
        simulador5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simulador5.setMaximumSize(new java.awt.Dimension(380, 270));
        simulador5.setMinimumSize(new java.awt.Dimension(380, 270));
        simulador5.setPreferredSize(new java.awt.Dimension(400, 300));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(110, 70, 0, 70);
        add(simulador5, gridBagConstraints);

        simulador6.setForeground(new java.awt.Color(0, 0, 0));
        simulador6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simulador6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado5.png"))); // NOI18N
        simulador6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simulador6.setMaximumSize(new java.awt.Dimension(380, 270));
        simulador6.setMinimumSize(new java.awt.Dimension(380, 270));
        simulador6.setPreferredSize(new java.awt.Dimension(400, 300));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(110, 0, 0, 0);
        add(simulador6, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel simulador1;
    private javax.swing.JLabel simulador2;
    private javax.swing.JLabel simulador3;
    private javax.swing.JLabel simulador4;
    private javax.swing.JLabel simulador5;
    private javax.swing.JLabel simulador6;
    // End of variables declaration//GEN-END:variables
}
