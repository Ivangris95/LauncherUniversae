package launcheruniversae;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class utility {

    private static universaeApp uniApp = new universaeApp();

    //Esta función se utiliza para establecer una imagen en una etiqueta JLabel especificada.
    public static void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon;

        icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));

        labelName.setIcon(icon);

        labelName.repaint();
    };
     
    //Esta función se utiliza para cargar una imagen en una etiqueta JLabel especificada y ajustar su tamaño según las dimensiones proporcionadas.
    public static void SetImageLabel(JLabel labelName, String root, Dimension dimension) {
        ImageIcon image = new ImageIcon(root);
        Icon icon;

        icon = new ImageIcon(image.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_DEFAULT));

        labelName.setIcon(icon);

        labelName.repaint();
    };
     
    //Esta función crea un arreglo de cadenas de texto que contienen las rutas a las imágenes asociadas a un simulador específico.
    public static String[] CreateArrayWithImages(String[] imagesArray,int indexGrado, int indexSimulador) {

        for (int i = 0; i < imagesArray.length; i++) {
            String urlGeneral;
            urlGeneral = uniApp.getImgSimulador(indexGrado, indexSimulador);
            String urlFinal = "src/images/" + urlGeneral + i + ".png";
            imagesArray[i] = urlFinal;
        }

        return imagesArray;
    }
    
    
;

}
