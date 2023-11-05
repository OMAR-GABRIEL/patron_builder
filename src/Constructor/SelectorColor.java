
package Constructor;
import java.awt.BorderLayout;
import proyecto.principal;
import java.awt.Frame;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.event.ChangeEvent;


public class SelectorColor extends JDialog{

    private JColorChooser mColorChooser;
    private principal mParent;
    public SelectorColor(Frame owner, boolean modal) {
        super(owner,modal);
        mParent=(principal)owner;
        mColorChooser=new JColorChooser();
        add(mColorChooser,BorderLayout.CENTER);
        pack();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        mColorChooser.getSelectionModel().addChangeListener((ChangeEvent evt)->{
        mParent.setColorBackground(mColorChooser.getColor());
        });
    
    }
    
    

    
}
