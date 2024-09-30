package Activitys;




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
        
        JLabel[] grados = {grado1, grado2, grado3, grado4, grado5, grado6};
        
        Dimension dimensionMiniaturas = new Dimension(380, 270);
        Dimension dimensionMiniaturaHover = new Dimension(390, 280);
        Dimension dimensionMiniaturaPressed = new Dimension(375,265);
        
        
        for (int i = 0; i < grados.length; i++) {
      
            String urlHome = "src/images/Grado" + i + ".png";
            utility.SetImageLabel(grados[i], urlHome, dimensionMiniaturas);
            
            
            final int index = i;
            
            grados[i].addMouseListener(new MouseAdapter(){
            
                @Override
                public void mouseClicked (MouseEvent e) {      
                padre.iniciarSimulacionYMostrarPanel();
                }
                
                @Override
                public void mouseEntered(MouseEvent e) {
                utility.SetImageLabel(grados[index], urlHome, dimensionMiniaturaHover);
                }
            
                @Override
                public void mouseExited(MouseEvent e) {
                utility.SetImageLabel(grados[index], urlHome, dimensionMiniaturas);
                }
            
                @Override
                public void mousePressed(MouseEvent e) {
                utility.SetImageLabel(grados[index], urlHome, dimensionMiniaturaPressed);               
                }
            
                @Override
                public void mouseReleased(MouseEvent e) {
                utility.SetImageLabel(grados[index], urlHome, dimensionMiniaturas);
                }     
         });
            
        }
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        display1 = new javax.swing.JPanel();
        grado1 = new javax.swing.JLabel();
        display2 = new javax.swing.JPanel();
        grado2 = new javax.swing.JLabel();
        display3 = new javax.swing.JPanel();
        grado3 = new javax.swing.JLabel();
        display4 = new javax.swing.JPanel();
        grado4 = new javax.swing.JLabel();
        display5 = new javax.swing.JPanel();
        grado5 = new javax.swing.JLabel();
        display6 = new javax.swing.JPanel();
        grado6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(10, 38, 72));
        setToolTipText("");
        setEnabled(false);
        setLayout(new java.awt.GridBagLayout());

        display1.setBackground(new java.awt.Color(255, 255, 255));
        display1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display1.setMaximumSize(new java.awt.Dimension(370, 280));
        display1.setMinimumSize(new java.awt.Dimension(380, 270));
        display1.setOpaque(false);
        display1.setPreferredSize(new java.awt.Dimension(400, 300));

        grado1.setForeground(new java.awt.Color(0, 0, 0));
        grado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado0.png"))); // NOI18N
        grado1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grado1.setMaximumSize(new java.awt.Dimension(380, 270));
        grado1.setMinimumSize(new java.awt.Dimension(380, 270));
        grado1.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout display1Layout = new javax.swing.GroupLayout(display1);
        display1.setLayout(display1Layout);
        display1Layout.setHorizontalGroup(
            display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        display1Layout.setVerticalGroup(
            display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        add(display1, gridBagConstraints);

        display2.setBackground(new java.awt.Color(255, 255, 255));
        display2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display2.setMaximumSize(new java.awt.Dimension(370, 280));
        display2.setMinimumSize(new java.awt.Dimension(380, 270));
        display2.setOpaque(false);
        display2.setPreferredSize(new java.awt.Dimension(400, 300));

        grado2.setForeground(new java.awt.Color(0, 0, 0));
        grado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado1.png"))); // NOI18N
        grado2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grado2.setMaximumSize(new java.awt.Dimension(380, 270));
        grado2.setMinimumSize(new java.awt.Dimension(380, 270));
        grado2.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout display2Layout = new javax.swing.GroupLayout(display2);
        display2.setLayout(display2Layout);
        display2Layout.setHorizontalGroup(
            display2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        display2Layout.setVerticalGroup(
            display2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 100);
        add(display2, gridBagConstraints);

        display3.setBackground(new java.awt.Color(255, 255, 255));
        display3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display3.setMaximumSize(new java.awt.Dimension(370, 280));
        display3.setOpaque(false);
        display3.setPreferredSize(new java.awt.Dimension(400, 300));

        grado3.setForeground(new java.awt.Color(0, 0, 0));
        grado3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado2.png"))); // NOI18N
        grado3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grado3.setMaximumSize(new java.awt.Dimension(380, 270));
        grado3.setMinimumSize(new java.awt.Dimension(380, 270));
        grado3.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout display3Layout = new javax.swing.GroupLayout(display3);
        display3.setLayout(display3Layout);
        display3Layout.setHorizontalGroup(
            display3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        display3Layout.setVerticalGroup(
            display3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        add(display3, gridBagConstraints);

        display4.setBackground(new java.awt.Color(255, 255, 255));
        display4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display4.setMaximumSize(new java.awt.Dimension(370, 280));
        display4.setMinimumSize(new java.awt.Dimension(380, 270));
        display4.setOpaque(false);
        display4.setPreferredSize(new java.awt.Dimension(400, 300));

        grado4.setForeground(new java.awt.Color(0, 0, 0));
        grado4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado3.png"))); // NOI18N
        grado4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grado4.setMaximumSize(new java.awt.Dimension(380, 270));
        grado4.setMinimumSize(new java.awt.Dimension(380, 270));
        grado4.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout display4Layout = new javax.swing.GroupLayout(display4);
        display4.setLayout(display4Layout);
        display4Layout.setHorizontalGroup(
            display4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        display4Layout.setVerticalGroup(
            display4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(100, 0, 0, 0);
        add(display4, gridBagConstraints);

        display5.setBackground(new java.awt.Color(255, 255, 255));
        display5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display5.setMaximumSize(new java.awt.Dimension(370, 280));
        display5.setMinimumSize(new java.awt.Dimension(380, 270));
        display5.setOpaque(false);
        display5.setPreferredSize(new java.awt.Dimension(400, 300));

        grado5.setForeground(new java.awt.Color(0, 0, 0));
        grado5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado4.png"))); // NOI18N
        grado5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grado5.setMaximumSize(new java.awt.Dimension(380, 270));
        grado5.setMinimumSize(new java.awt.Dimension(380, 270));
        grado5.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout display5Layout = new javax.swing.GroupLayout(display5);
        display5.setLayout(display5Layout);
        display5Layout.setHorizontalGroup(
            display5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        display5Layout.setVerticalGroup(
            display5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(100, 100, 0, 100);
        add(display5, gridBagConstraints);

        display6.setBackground(new java.awt.Color(255, 255, 255));
        display6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display6.setMaximumSize(new java.awt.Dimension(370, 280));
        display6.setMinimumSize(new java.awt.Dimension(380, 270));
        display6.setOpaque(false);
        display6.setPreferredSize(new java.awt.Dimension(400, 300));

        grado6.setForeground(new java.awt.Color(0, 0, 0));
        grado6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado5.png"))); // NOI18N
        grado6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grado6.setMaximumSize(new java.awt.Dimension(380, 270));
        grado6.setMinimumSize(new java.awt.Dimension(380, 270));
        grado6.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout display6Layout = new javax.swing.GroupLayout(display6);
        display6.setLayout(display6Layout);
        display6Layout.setHorizontalGroup(
            display6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grado6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        display6Layout.setVerticalGroup(
            display6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grado6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(100, 0, 0, 0);
        add(display6, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel display1;
    private javax.swing.JPanel display2;
    private javax.swing.JPanel display3;
    private javax.swing.JPanel display4;
    private javax.swing.JPanel display5;
    private javax.swing.JPanel display6;
    private javax.swing.JLabel grado1;
    private javax.swing.JLabel grado2;
    private javax.swing.JLabel grado3;
    private javax.swing.JLabel grado4;
    private javax.swing.JLabel grado5;
    private javax.swing.JLabel grado6;
    // End of variables declaration//GEN-END:variables
}
  
