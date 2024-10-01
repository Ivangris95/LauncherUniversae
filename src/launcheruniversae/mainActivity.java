package launcheruniversae;

import Activitys.HomeActivity;
import Activitys.simulatorActivity;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;





public class mainActivity extends javax.swing.JFrame {
    
    private universaeApp uniApp;
         
    public mainActivity() {
        initComponents();
        
        uniApp = new universaeApp();
        
        System.out.println(uniApp.getImgGrado());
       
    
        //contentHome = new JPanel(new BorderLayout());
        JLabel[] escudos = {Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9, Button10, Button11, Button12, Button13, Button14};
        
        Dimension dimensionMiniaturaEscudo = new Dimension(90, 90);
        Dimension dimensionMiniaturaEscudoHover = new Dimension(95, 95);
        Dimension dimensionMiniaturaPressed = new Dimension(85, 85);
        
        
        for(int i = 0; i < escudos.length; i++) {
          String url = "src/images/LauncherButton" + i + ".png";
          
          utility.SetImageLabel(escudos[i], url, dimensionMiniaturaEscudo);
          escudos[i].setPreferredSize(new Dimension(90, 90));
          
          final int index = i;
          
          escudos[i].addMouseListener(new MouseAdapter(){
              
            @Override
            public void mouseClicked(MouseEvent e) {
                HomeActivity home = new HomeActivity();
                setPadre(home);
                showPanel(home);
                home.iniciar();
            }
              
            @Override
            public void mouseEntered(MouseEvent e) {
                utility.SetImageLabel(escudos[index], url, dimensionMiniaturaEscudoHover);
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                utility.SetImageLabel(escudos[index], url, dimensionMiniaturaEscudo);
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                utility.SetImageLabel(escudos[index], url, dimensionMiniaturaPressed);
            }
            
            @Override
            public void mouseReleased(MouseEvent e){
                 utility.SetImageLabel(escudos[index], url, dimensionMiniaturaEscudo);
            }

          }); 
        
        };
    
       
        HomeActivity home = new HomeActivity();
        setPadre(home);
        home.iniciar();
        showPanel(home);
        
      
    }

      public void iniciarSimulacionYMostrarPanel(){
          
            simulatorActivity simulator = new simulatorActivity();
            showPanel(simulator);
            simulator.iniciarSimulator();
            
        }  
        
      
        private void showPanel(JPanel panelName){
            contentHome.removeAll();
            panelName.setSize(1550, 880);
            panelName.setLocation(0, 0);
            
            contentHome.add(panelName, BorderLayout.CENTER);
            contentHome.revalidate();
            contentHome.repaint();
        }
        
        public void setPadre(HomeActivity home) {
            home.padre = this;
        }
        
        
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        horizontalBar = new javax.swing.JPanel();
        Button1 = new javax.swing.JLabel();
        Button2 = new javax.swing.JLabel();
        Button3 = new javax.swing.JLabel();
        Button4 = new javax.swing.JLabel();
        Button5 = new javax.swing.JLabel();
        Button6 = new javax.swing.JLabel();
        Button7 = new javax.swing.JLabel();
        Button8 = new javax.swing.JLabel();
        Button9 = new javax.swing.JLabel();
        Button10 = new javax.swing.JLabel();
        Button11 = new javax.swing.JLabel();
        Button12 = new javax.swing.JLabel();
        Button13 = new javax.swing.JLabel();
        Button14 = new javax.swing.JLabel();
        contentHome = new javax.swing.JPanel();
        backgroundBody = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(10, 38, 72));
        body.setMinimumSize(new java.awt.Dimension(1920, 1080));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        horizontalBar.setBackground(new java.awt.Color(255, 255, 255));
        horizontalBar.setAlignmentX(0.0F);
        horizontalBar.setAlignmentY(0.0F);
        horizontalBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        horizontalBar.setMaximumSize(new java.awt.Dimension(1550, 200));
        horizontalBar.setName(""); // NOI18N
        horizontalBar.setOpaque(false);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 18);
        flowLayout1.setAlignOnBaseline(true);
        horizontalBar.setLayout(flowLayout1);

        Button1.setBackground(new java.awt.Color(102, 0, 255));
        Button1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button1.setAlignmentX(0.5F);
        Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button1.setMaximumSize(new java.awt.Dimension(120, 120));
        Button1.setMinimumSize(new java.awt.Dimension(70, 70));
        Button1.setPreferredSize(new java.awt.Dimension(90, 95));
        Button1.setRequestFocusEnabled(false);
        horizontalBar.add(Button1);

        Button2.setBackground(new java.awt.Color(255, 255, 255));
        Button2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button2.setAlignmentX(0.5F);
        Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button2.setMaximumSize(new java.awt.Dimension(120, 120));
        Button2.setMinimumSize(new java.awt.Dimension(70, 70));
        Button2.setPreferredSize(new java.awt.Dimension(90, 95));
        Button2.setRequestFocusEnabled(false);
        horizontalBar.add(Button2);

        Button3.setBackground(new java.awt.Color(204, 204, 204));
        Button3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button3.setAlignmentX(0.5F);
        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button3.setMaximumSize(new java.awt.Dimension(120, 120));
        Button3.setMinimumSize(new java.awt.Dimension(70, 70));
        Button3.setPreferredSize(new java.awt.Dimension(90, 95));
        Button3.setRequestFocusEnabled(false);
        horizontalBar.add(Button3);

        Button4.setBackground(new java.awt.Color(204, 204, 204));
        Button4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button4.setAlignmentX(0.5F);
        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button4.setMaximumSize(new java.awt.Dimension(120, 120));
        Button4.setMinimumSize(new java.awt.Dimension(70, 70));
        Button4.setPreferredSize(new java.awt.Dimension(90, 95));
        Button4.setRequestFocusEnabled(false);
        horizontalBar.add(Button4);

        Button5.setBackground(new java.awt.Color(204, 204, 204));
        Button5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button5.setAlignmentX(0.5F);
        Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button5.setMaximumSize(new java.awt.Dimension(120, 120));
        Button5.setMinimumSize(new java.awt.Dimension(70, 70));
        Button5.setPreferredSize(new java.awt.Dimension(90, 95));
        Button5.setRequestFocusEnabled(false);
        horizontalBar.add(Button5);

        Button6.setBackground(new java.awt.Color(204, 204, 204));
        Button6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button6.setAlignmentX(0.5F);
        Button6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button6.setMaximumSize(new java.awt.Dimension(120, 120));
        Button6.setMinimumSize(new java.awt.Dimension(70, 70));
        Button6.setPreferredSize(new java.awt.Dimension(90, 95));
        Button6.setRequestFocusEnabled(false);
        horizontalBar.add(Button6);

        Button7.setBackground(new java.awt.Color(204, 204, 204));
        Button7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button7.setAlignmentX(0.5F);
        Button7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button7.setMaximumSize(new java.awt.Dimension(120, 120));
        Button7.setMinimumSize(new java.awt.Dimension(70, 70));
        Button7.setPreferredSize(new java.awt.Dimension(90, 95));
        Button7.setRequestFocusEnabled(false);
        horizontalBar.add(Button7);

        Button8.setBackground(new java.awt.Color(204, 204, 204));
        Button8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button8.setAlignmentX(0.5F);
        Button8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button8.setMaximumSize(new java.awt.Dimension(120, 120));
        Button8.setMinimumSize(new java.awt.Dimension(70, 70));
        Button8.setPreferredSize(new java.awt.Dimension(90, 95));
        Button8.setRequestFocusEnabled(false);
        horizontalBar.add(Button8);

        Button9.setBackground(new java.awt.Color(255, 255, 255));
        Button9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button9.setAlignmentX(0.5F);
        Button9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button9.setMaximumSize(new java.awt.Dimension(120, 120));
        Button9.setMinimumSize(new java.awt.Dimension(70, 70));
        Button9.setPreferredSize(new java.awt.Dimension(90, 95));
        Button9.setRequestFocusEnabled(false);
        horizontalBar.add(Button9);

        Button10.setBackground(new java.awt.Color(255, 255, 255));
        Button10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button10.setAlignmentX(0.5F);
        Button10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button10.setMaximumSize(new java.awt.Dimension(120, 120));
        Button10.setMinimumSize(new java.awt.Dimension(70, 70));
        Button10.setPreferredSize(new java.awt.Dimension(90, 95));
        Button10.setRequestFocusEnabled(false);
        horizontalBar.add(Button10);

        Button11.setBackground(new java.awt.Color(255, 255, 255));
        Button11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button11.setAlignmentX(0.5F);
        Button11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button11.setMaximumSize(new java.awt.Dimension(120, 120));
        Button11.setMinimumSize(new java.awt.Dimension(70, 70));
        Button11.setPreferredSize(new java.awt.Dimension(90, 95));
        Button11.setRequestFocusEnabled(false);
        horizontalBar.add(Button11);

        Button12.setBackground(new java.awt.Color(255, 255, 255));
        Button12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button12.setAlignmentX(0.5F);
        Button12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button12.setMaximumSize(new java.awt.Dimension(120, 120));
        Button12.setMinimumSize(new java.awt.Dimension(70, 70));
        Button12.setPreferredSize(new java.awt.Dimension(90, 95));
        Button12.setRequestFocusEnabled(false);
        horizontalBar.add(Button12);

        Button13.setBackground(new java.awt.Color(255, 255, 255));
        Button13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button13.setAlignmentX(0.5F);
        Button13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button13.setMaximumSize(new java.awt.Dimension(120, 120));
        Button13.setMinimumSize(new java.awt.Dimension(70, 70));
        Button13.setPreferredSize(new java.awt.Dimension(90, 95));
        Button13.setRequestFocusEnabled(false);
        horizontalBar.add(Button13);

        Button14.setBackground(new java.awt.Color(255, 255, 255));
        Button14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LauncherButton0.png"))); // NOI18N
        Button14.setAlignmentX(0.5F);
        Button14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button14.setMaximumSize(new java.awt.Dimension(120, 120));
        Button14.setMinimumSize(new java.awt.Dimension(70, 70));
        Button14.setPreferredSize(new java.awt.Dimension(90, 95));
        Button14.setRequestFocusEnabled(false);
        horizontalBar.add(Button14);

        body.add(horizontalBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 1550, 130));

        contentHome.setBackground(new java.awt.Color(10, 38, 72));

        javax.swing.GroupLayout contentHomeLayout = new javax.swing.GroupLayout(contentHome);
        contentHome.setLayout(contentHomeLayout);
        contentHomeLayout.setHorizontalGroup(
            contentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1550, Short.MAX_VALUE)
        );
        contentHomeLayout.setVerticalGroup(
            contentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        body.add(contentHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 1550, 880));

        backgroundBody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo base.png"))); // NOI18N
        body.add(backgroundBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

   
    public static void main(String args[]) {
       
       
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainActivity().setVisible(true);
               
                
             
            }
         });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button1;
    private javax.swing.JLabel Button10;
    private javax.swing.JLabel Button11;
    private javax.swing.JLabel Button12;
    private javax.swing.JLabel Button13;
    private javax.swing.JLabel Button14;
    private javax.swing.JLabel Button2;
    private javax.swing.JLabel Button3;
    private javax.swing.JLabel Button4;
    private javax.swing.JLabel Button5;
    private javax.swing.JLabel Button6;
    private javax.swing.JLabel Button7;
    private javax.swing.JLabel Button8;
    private javax.swing.JLabel Button9;
    private javax.swing.JLabel backgroundBody;
    private javax.swing.JPanel body;
    private javax.swing.JPanel contentHome;
    private javax.swing.JPanel horizontalBar;
    // End of variables declaration//GEN-END:variables
}
