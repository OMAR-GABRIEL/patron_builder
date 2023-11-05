package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class conexion {
    private static final String URL = "jdbc:mysql://localhost:3307/construccion_d";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "";

    private Connection conexion;

    public conexion() {
        try {
            // Establecer la conexión a la base de datos
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("Conexión a la base de datos establecida.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión a la base de datos cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
            e.printStackTrace();
        }
    }

    
}
