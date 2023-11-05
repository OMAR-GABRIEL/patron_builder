
package proyecto;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Escalar {
    
public void Escalarlabel(JLabel label,String RutaImagen){
    label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(RutaImagen)).getImage()
    .getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_DEFAULT)));
}
}
