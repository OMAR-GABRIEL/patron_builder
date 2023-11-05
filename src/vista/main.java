
package vista;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import proyecto.Usuario;
import proyecto.UsuarioBuilder;
import Conexion.conexion;
import Constructor.Controlador;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class main {
    
        conexion conexion=new conexion();
    Connection conn = conexion.getConexion();
    
       PreparedStatement ps;
       ResultSet rs;
  
       
        public  int agregar(Usuario u ){
        
    
 try {
    
            // Consulta SQL para insertar un usuario
            String consulta = "INSERT INTO usuario (nombre,apellido,cedula,edad,fecha,departamento,"
                    + "ciudad,barrio,eps,contrato,telefono,email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            // Crear una sentencia preparada
            PreparedStatement preparedStatement = conn.prepareStatement(consulta);
            preparedStatement.setString(1, u.getNombre());
            preparedStatement.setString(2, u.getApellido());
            preparedStatement.setString(3, u.getCedula());
            preparedStatement.setInt(4, u.getEdad());
            preparedStatement.setString(5, u.getFecha());
            preparedStatement.setString(6, u.getDepartamento());
            preparedStatement.setString(7, u.getCiudad());
            preparedStatement.setString(8, u.getBarrio());
            preparedStatement.setString(9, u.getEps());
            preparedStatement.setString(10, u.getContrato());
            preparedStatement.setString(11, u.getTelefono());
            preparedStatement.setString(12, u.getEmail());

            // Ejecutar la consulta para insertar el usuario
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Usuario insertado correctamente en la base de datos.");
            } else {
                System.out.println("No se pudo insertar el usuario en la base de datos.");
            }

            // Cerrar la conexión
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return 1;
    
}
        public  int paciente(Usuario u){
            
            try {
                String consulta = "INSERT INTO enfermedades(nombre_enfermedad,descripcion,cedula) VALUES (?, ?, ?)";

                
            PreparedStatement preparedStatement = conn.prepareStatement(consulta);
            preparedStatement.setString(1, u.getNombre_enfermedad());
            preparedStatement.setString(2, u.getDescripcion());
            preparedStatement.setString(3, u.getCedula());
             int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                
       JOptionPane.showMessageDialog(null,"Paciente exitosamente registrado");
            } else {
               JOptionPane.showMessageDialog(null,"No se pudo insertar al paciente en la base de datos.");
            }

            // Cerrar la conexión
            preparedStatement.close();
            conn.close();
            } catch (Exception e) {
                  e.printStackTrace();
            }
            return 1;
        }

      
public List listar(){
    
    List <Usuario>datos= new ArrayList<>();
    String sql="SELECT  nombre,apellido,cedula,edad,fecha,departamento,ciudad,barrio,eps,contrato,telefono,email FROM usuario ";
 
    try {
        
      ps =conn.prepareStatement(sql);
      rs=ps.executeQuery();
        while (rs.next()) {
             Usuario usuario=new UsuarioBuilder()
           .setNombre(rs.getString(1))
           .setApellido(rs.getString(2))
           .setCedula(rs.getString(3))
           .setEdad(rs.getInt(4))
           .setFecha(rs.getString(5))
           .setDepartamento(rs.getString(6))
           .setCiudad(rs.getString(7))
           .setBarrio(rs.getString(8))
           .setEps(rs.getString(9))
           .setContrato(rs.getString(10))
           .setTelefono(rs.getString(11))
           .setEmail(rs.getString(12))
           
        .build();
           datos.add(usuario);
                   }
       
        
    } catch (Exception e) {
    }
    
            return datos;
}
    

    
}