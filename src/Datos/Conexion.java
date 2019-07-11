/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author danny
 */
public class Conexion {
    private String driver ="com.mysql.jdbc.Driver";
    private String cadenaconexion="jdbc:mysql://localhost/Grafo";
    private String usuario="root";
    private String contrasena="Clave2";
    public Connection con;
    private static Conexion PuntoDeAcceso = null;
    public Conexion() { }
    
    public static Conexion getInstance() throws SQLException {
        if (PuntoDeAcceso == null) {
            PuntoDeAcceso = new Conexion();
        }
        return PuntoDeAcceso;
    }
    
    public void establecerConexion() throws SQLException{
           try {
            Class.forName(driver);
            JOptionPane.showMessageDialog(null, "se pudo establecer la conexion");
            con=DriverManager.getConnection(cadenaconexion, usuario, contrasena);
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion"+ex);
        
    }
    }
    
    public void finalizarConexion(Statement stmt) throws Exception{
         try {
            if (stmt != null)
                stmt.close();
            if(this.con!=null)
                this.con.close();
        } catch (SQLException ex) {
             throw new Exception(ex.getMessage());
        }
     }
 
}
