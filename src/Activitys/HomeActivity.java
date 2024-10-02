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
        
       
        JLabel[] simuladores = {simulador1, simulador2, simulador3, simulador4, simulador5, simulador6};
        
        Dimension dimensionMiniaturas = new Dimension(380, 270);
        Dimension dimensionMiniaturaHover = new Dimension(390, 280);
        Dimension dimensionMiniaturaPressed = new Dimension(375,265);
        
        
        for (int i = 0; i < simuladores.length; i++) {
      
            String urlHome = "src/images/Grado" + i + ".png";
            utility.SetImageLabel(simuladores[i], urlHome, dimensionMiniaturas);
            
            
            final int index = i;
            
            simuladores[i].addMouseListener(new MouseAdapter(){
            
                @Override
                public void mouseClicked (MouseEvent e) {      
                padre.iniciarSimulacionYMostrarPanel();
                
                    switch (index) {
                        case 0:
                            System.out.println("simulador1");
                            break;
                        case 1:
                            System.out.println("simulador2");
                            break;
                        case 2:
                            System.out.println("simulador3");
                            break;
                        case 3:
                            System.out.println("simulador4");
                            break;
                        case 4:
                            System.out.println("simulador5");
                            break;
                        case 5:
                            System.out.println("simulador6");
                            break;        
                        default:
                            System.err.println("Error");
                    }
                }
                
                @Override
                public void mouseEntered(MouseEvent e) {
                utility.SetImageLabel(simuladores[index], urlHome, dimensionMiniaturaHover);
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

        display1 = new javax.swing.JPanel();
        simulador1 = new javax.swing.JLabel();
        display2 = new javax.swing.JPanel();
        simulador2 = new javax.swing.JLabel();
        display3 = new javax.swing.JPanel();
        simulador3 = new javax.swing.JLabel();
        display4 = new javax.swing.JPanel();
        simulador4 = new javax.swing.JLabel();
        display5 = new javax.swing.JPanel();
        simulador5 = new javax.swing.JLabel();
        display6 = new javax.swing.JPanel();
        simulador6 = new javax.swing.JLabel();

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

        simulador1.setForeground(new java.awt.Color(0, 0, 0));
        simulador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simulador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado0.png"))); // NOI18N
        simulador1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simulador1.setMaximumSize(new java.awt.Dimension(380, 270));
        simulador1.setMinimumSize(new java.awt.Dimension(380, 270));
        simulador1.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout display1Layout = new javax.swing.GroupLayout(display1);
        display1.setLayout(display1Layout);
        display1Layout.setHorizontalGroup(
            display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simulador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        display1Layout.setVerticalGroup(
            display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simulador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        simulador2.setForeground(new java.awt.Color(0, 0, 0));
        simulador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simulador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado1.png"))); // NOI18N
        simulador2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simulador2.setMaximumSize(new java.awt.Dimension(380, 270));
        simulador2.setMinimumSize(new java.awt.Dimension(380, 270));
        simulador2.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout display2Layout = new javax.swing.GroupLayout(display2);
        display2.setLayout(display2Layout);
        display2Layout.setHorizontalGroup(
            display2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simulador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        display2Layout.setVerticalGroup(
            display2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simulador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        simulador3.setForeground(new java.awt.Color(0, 0, 0));
        simulador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simulador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado2.png"))); // NOI18N
        simulador3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simulador3.setMaximumSize(new java.awt.Dimension(380, 270));
        simulador3.setMinimumSize(new java.awt.Dimension(380, 270));
        simulador3.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout display3Layout = new javax.swing.GroupLayout(display3);
        display3.setLayout(display3Layout);
        display3Layout.setHorizontalGroup(
            display3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simulador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        display3Layout.setVerticalGroup(
            display3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simulador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        simulador4.setForeground(new java.awt.Color(0, 0, 0));
        simulador4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simulador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado3.png"))); // NOI18N
        simulador4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simulador4.setMaximumSize(new java.awt.Dimension(380, 270));
        simulador4.setMinimumSize(new java.awt.Dimension(380, 270));
        simulador4.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout display4Layout = new javax.swing.GroupLayout(display4);
        display4.setLayout(display4Layout);
        display4Layout.setHorizontalGroup(
            display4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simulador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        display4Layout.setVerticalGroup(
            display4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simulador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        simulador5.setForeground(new java.awt.Color(0, 0, 0));
        simulador5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simulador5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado4.png"))); // NOI18N
        simulador5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simulador5.setMaximumSize(new java.awt.Dimension(380, 270));
        simulador5.setMinimumSize(new java.awt.Dimension(380, 270));
        simulador5.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout display5Layout = new javax.swing.GroupLayout(display5);
        display5.setLayout(display5Layout);
        display5Layout.setHorizontalGroup(
            display5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simulador5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        display5Layout.setVerticalGroup(
            display5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simulador5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        simulador6.setForeground(new java.awt.Color(0, 0, 0));
        simulador6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simulador6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Grado5.png"))); // NOI18N
        simulador6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simulador6.setMaximumSize(new java.awt.Dimension(380, 270));
        simulador6.setMinimumSize(new java.awt.Dimension(380, 270));
        simulador6.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout display6Layout = new javax.swing.GroupLayout(display6);
        display6.setLayout(display6Layout);
        display6Layout.setHorizontalGroup(
            display6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simulador6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        display6Layout.setVerticalGroup(
            display6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simulador6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JLabel simulador1;
    private javax.swing.JLabel simulador2;
    private javax.swing.JLabel simulador3;
    private javax.swing.JLabel simulador4;
    private javax.swing.JLabel simulador5;
    private javax.swing.JLabel simulador6;
    // End of variables declaration//GEN-END:variables
}
  
