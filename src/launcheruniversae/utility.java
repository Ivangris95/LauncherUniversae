
package launcheruniversae;



import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class utility {
        
 
    public static void SetImageLabel(JLabel labelName , String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon;
        
        icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_DEFAULT));
        
        labelName.setIcon(icon);
        
        labelName.repaint();
    };
     
    public static void SetImageLabel(JLabel labelName , String root, Dimension dimension) {
        ImageIcon image = new ImageIcon(root);
        Icon icon;
        
        icon = new ImageIcon(image.getImage().getScaledInstance(dimension.width, dimension.height,Image.SCALE_DEFAULT));
        
        labelName.setIcon(icon);
        
        labelName.repaint();
    };
     

     
    
}
