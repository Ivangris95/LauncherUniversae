package launcheruniversae;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class utility {
<<<<<<< HEAD
        
 
    public static void SetImageLabel(JLabel labelName , String root) {
=======

    private static universaeApp uniApp = new universaeApp();

    public static void SetImageLabel(JLabel labelName, String root) {
>>>>>>> bd91298f047fd7b1dd51be22904509e51837bca2
        ImageIcon image = new ImageIcon(root);
        Icon icon;

        icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));

        labelName.setIcon(icon);

        labelName.repaint();
    }

    ;
     
    public static void SetImageLabel(JLabel labelName, String root, Dimension dimension) {
        ImageIcon image = new ImageIcon(root);
        Icon icon;

        icon = new ImageIcon(image.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_DEFAULT));

        labelName.setIcon(icon);

        labelName.repaint();
    }

    ;
     
    public static String[] CreateArrayWithImages(String[] imagesArray, int indexSimulador) {

        for (int i = 0; i < imagesArray.length; i++) {
            String urlGeneral;
            urlGeneral = uniApp.getImgSimulador(indexSimulador);
            String urlFinal = "src/images/" + urlGeneral + i + ".png";
            imagesArray[i] = urlFinal;
        }

        return imagesArray;
    }
;

}
