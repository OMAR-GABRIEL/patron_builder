
package Constructor;

import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import vista.Enfermedades;

public class CambiarImagen {
static int contador;
    public static void main(String[] args) {
        int velocidad=2;
        Timer timer;
        TimerTask tarea;
        int velmil =velocidad*1000;
        Enfermedades en=new Enfermedades();
        en.setVisible(true);
        tarea =new TimerTask() {

            @Override
            public void run() {
         Icon icono;
         
         switch(contador){
             case 0:
                 contador=1;
                 icono= new ImageIcon(getClass().getResource("imagen/imagen1.jpg"));
                 en.jLabel8.setIcon(icono);
                 break;
                 
                 
             case 1:
                 contador=1;
                 icono= new ImageIcon(getClass().getResource("imagen/imagen1.png"));
                 en.jLabel8.setIcon(icono);
                 break;
                 
         }
            
            }
        };
        
       
        
    }
}
