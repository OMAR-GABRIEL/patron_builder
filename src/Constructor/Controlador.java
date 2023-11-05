
package Constructor;
import vista.registro;
import vista.main;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.List;

import proyecto.Usuario;
import proyecto.UsuarioBuilder;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;
import java.awt.event.MouseAdapter;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeCellEditor;
import jdk.nashorn.internal.objects.NativeArray;
import proyecto.principal;
import vista.buscar_usuario;
import vista.Enfermedades;


public class Controlador implements ActionListener{
    principal pr=new principal();
    registro registro=new registro();
    buscar_usuario buscar=new buscar_usuario();
    Enfermedades en=new Enfermedades();

    main main=new main();
    DefaultTableModel modelo =new DefaultTableModel();


    public  Controlador(registro v){
        this.registro=v;

        this.registro.btnAceptar.addActionListener(this);
        this.registro.btnlistar.addActionListener(this);
        this.registro.btnregresar.addActionListener(this);
        this.registro.btnbuscar.addActionListener(this);

    }
    public  Controlador(Enfermedades e){
    this.en=e;
    this.en.agregarpaciente.addActionListener(this);
    }
    public Controlador(buscar_usuario b){
        this.buscar=b;
        this.buscar.btnBuscar.addActionListener(this);
    this.buscar.btngreso.addActionListener(this);
    
    this.buscar.tabla_busqueda.addMouseListener(new MouseAdapter() {
        
        public void mouseClicked(MouseEvent e){
              Controlador c=new Controlador(en);
        en.setVisible(true);
          int seleccion=buscar.tabla_busqueda.getSelectedRow();
         en.txtnombre.setText(buscar.tabla_busqueda.getValueAt(seleccion,0).toString());
          en.txtapellido.setText(buscar.tabla_busqueda.getValueAt(seleccion,1).toString());
           en.txtcedula.setText(buscar.tabla_busqueda.getValueAt(seleccion,2).toString());

        }
        
});
    
        }

    public Controlador(principal p){
        this.pr=p;
        this.pr.btningresar.addActionListener(this);
        this.pr.Btnrediregistro.addActionListener(this);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
   if(e.getSource()==en.agregarpaciente){
       String cedula=en.txtcedula.getText();
       String Nfermeda=en.txt_n_enfer.getText();
       String descripcion=en.txtdescripcion.getText();
       

    Usuario usuario=new UsuarioBuilder()
       
        .setNombre_enfermedad(Nfermeda)
        .setDescripcion(descripcion)
        .setCedula(cedula) 
        .build();
    main.paciente(usuario);
       this.en.dispose();
       
       
   }
        
        if(e.getSource()==registro.btnAceptar){
       guardar();


   }
   
   
    if(e.getSource()==buscar.btnBuscar){

       String busqueda=buscar.txtbuscar.getText();
         buscarporcedula(busqueda);

   }
    if(e.getSource()==buscar.btngreso){

        Controlador c=new Controlador(registro);
        registro.setVisible(true);
        this.buscar.dispose();


   }
   if(e.getSource()==registro.btnbuscar){

       Controlador c= new Controlador(buscar);
        buscar.setVisible(true);
         this.registro.dispose();

   }

   if(e.getSource()==pr.Btnrediregistro){

       regirigir();
   }
   if(e.getSource()==pr.btningresar){

         String usuario=pr.txt_usuario.getText();
        String pass=pr.txt_contraseña.getText();

       autenticacion(usuario,pass);
   }
   if(e.getSource()==registro.btnlistar){
       listar(registro.tabla);

   }if(e.getSource()==registro.btnregresar){

     Controlador c=new Controlador(pr);
        pr.setVisible(true);
        this.registro.dispose();



   }


    }   
    public void buscarporcedula(String cedula){
        List<Usuario>lista =main.listar();
          List<Usuario> usuariosEncontrados = lista.stream()
        .filter(usuario -> usuario.getCedula().equals(cedula))
        .collect(Collectors.toList());

    if (!usuariosEncontrados.isEmpty()) {
        System.out.println("Usuarios encontrados:");
        for (Usuario usuario : usuariosEncontrados) {
           // System.out.println("Nombre: " + usuario.getNombre() + ", Cédula: " + usuario.getCedula());
            modelo=(DefaultTableModel)buscar.tabla_busqueda.getModel();
             Object[]objeto=new Object[13];
  
objeto[0]=usuario.getNombre();
objeto[1]=usuario.getApellido();
objeto[2]=usuario.getCedula();
objeto[3]=usuario.getEdad();
objeto[4]=usuario.getFecha();
objeto[5]=usuario.getDepartamento();
objeto[6]=usuario.getCiudad();
objeto[7]=usuario.getBarrio();
objeto[8]=usuario.getEps();
objeto[9]=usuario.getContrato();
objeto[10]=usuario.getTelefono();
objeto[11]=usuario.getEmail();
modelo.addRow(objeto);
  
  buscar.tabla_busqueda.setModel(modelo);
        }
    } else {
        JOptionPane.showMessageDialog(null,"Usuario no esta registrado...");
    }       

    }

    public void listar(JTable tabla){
        modelo=(DefaultTableModel)tabla.getModel();
        List<Usuario>lista=main.listar();
        Object[]objeto=new Object[13];
  for (int i = 0; i < lista.size(); i++) {
objeto[0]=lista.get(i).getNombre();
objeto[1]=lista.get(i).getApellido();
objeto[2]=lista.get(i).getCedula();
objeto[3]=lista.get(i).getEdad();
objeto[4]=lista.get(i).getFecha();
objeto[5]=lista.get(i).getDepartamento();
objeto[6]=lista.get(i).getCiudad();
objeto[7]=lista.get(i).getBarrio();
objeto[8]=lista.get(i).getEps();
objeto[9]=lista.get(i).getContrato();
objeto[10]=lista.get(i).getTelefono();
objeto[11]=lista.get(i).getEmail();
modelo.addRow(objeto);


    }
      registro.tabla.setModel(modelo);
    }


public void guardar(){


         String nombre=registro.txtnombre.getText();
         String apellido=registro.txtapellido.getText();
          String cedula=registro.txtcedula.getText();
          String edad=registro.txtedad.getText();
            int edadEntero = Integer.parseInt(edad);
         String fecha=registro.Txtfecha.getText();
          String departamento=registro.txtdepartamento.getText();
         String ciudad=registro.txtciudad.getText();
         String barrio=registro.txtbarrio.getText();
         String eps=registro.txteps.getText();
         String contrato;
          contrato = registro.txtcontrato.getText();
        String telefono=registro.txtelefono.getText();
       String email=registro.txtEmail.getText();




    Usuario usuario=new UsuarioBuilder()
        .setNombre(nombre)
        .setApellido(apellido)
        .setCedula(cedula)
        .setEdad(edadEntero)
        .setFecha(fecha)
        .setDepartamento(departamento)
        .setCiudad(ciudad)
        .setBarrio(barrio)
        .setEps(eps)
        .setContrato(contrato)
        .setTelefono(telefono)
        .setEmail(email)

        .build();
    main.agregar(usuario);



}


    private void autenticacion(String usua, String pass) {

    List<Usuario>lista=main.listar();

        for (int i = 0; i < lista.size(); i++) {

             Usuario usuario = lista.get(i);
              String nombre = usuario.getNombre();
               String cedula = usuario.getCedula();

              if(nombre.equals(usua) && cedula.equals(pass) ){

                  System.out.println("el usuario esta registradp en la base de datos"+nombre);
              }else{
                  regirigir();
              }

        }
    }
    public void  buscar(){


    }

    private  void regirigir() {
        System.out.println("estoy llegando ........");

           Controlador c=new Controlador(registro);

        registro.setVisible(true);
        this.pr.dispose();


    }

}