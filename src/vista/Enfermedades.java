/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Constructor.Controlador;
import com.sun.javafx.tk.Toolkit;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author gabriel
 */
public class Enfermedades extends javax.swing.JFrame {
    private Object image;
    static int contador;
    /**
     * Creates new form NewJFrame
     */
    public Enfermedades() {
        initComponents();
        this.setLocationRelativeTo(this);
        
     

labelimage(jLabel8,"src/imagen/imagen1.jpg");
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txt_n_enfer = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        agregarpaciente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PACIENTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 45, -1, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 144, -1, -1));

        jLabel3.setText("Apellifo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 182, -1, -1));

        jLabel4.setText("Cedula");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 213, -1, -1));

        jLabel5.setText("N_Enfermeda");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 270, -1, -1));

        jLabel6.setText("Descripcion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 298, -1, -1));

        txtnombre.setEditable(false);
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 141, 157, -1));

        txtapellido.setEditable(false);
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 179, 173, -1));

        txtcedula.setEditable(false);
        jPanel1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 210, 176, -1));
        jPanel1.add(txt_n_enfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 264, 180, -1));
        jPanel1.add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 295, 179, -1));

        agregarpaciente.setText("Agregar ");
        jPanel1.add(agregarpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 333, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("TIPO DE ENFERMEDAD Y SU DESCRIPCION");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 236, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/imagen1.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -80, 450, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Enfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
   Enfermedades v=new Enfermedades();
       Controlador c=new Controlador(v);
        v.setVisible(true);
        /* Create and display the form */
        
        
    }
    public void labelimage(JLabel labelName,String root){
        ImageIcon imagen=new ImageIcon(root);
        Icon icon =new ImageIcon(
                 imagen.getImage().getScaledInstance(labelName.getWidth(),labelName.getHeight(),Image.SCALE_DEFAULT)
               
        );
        labelName.setIcon(icon);
        this.repaint();
     }

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton agregarpaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_n_enfer;
    public javax.swing.JTextField txtapellido;
    public javax.swing.JTextField txtcedula;
    public javax.swing.JTextField txtdescripcion;
    public javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables



}
