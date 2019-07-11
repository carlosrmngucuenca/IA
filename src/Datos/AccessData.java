/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javagrafos.Nodo;
import javagrafos.Rutas;
import javax.swing.JOptionPane;

/**
 *
 * @author danny
 */
public class AccessData {
    public Conexion mysql = new Conexion();
    
    private Connection cn =mysql.conectar();
    private String sql;
    
    public boolean insetarNodo (Nodo nodo){
        try {
            sql="insert into Nodo(idNodo,PNombreheuristica) values(?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, nodo.getId());
            pst.setInt(2, nodo.getNombre());
            pst.setInt(3, nodo.getHeuristica());
            int n=pst.executeUpdate();
            if (n!=0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ""+ex);
            return false;
        }
        
    }
    
     public boolean insetarArista (Rutas ruta){
        try {
            sql="insert into Nodo(idNodoInicio,idNodoFin,PesoRuta) values(?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, ruta.getNodoInicio().getId());
            pst.setInt(2, ruta.getNodoFin().getId());
            pst.setInt(3, ruta.getNodoFin().getPeso());
            int n=pst.executeUpdate();
            if (n!=0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ""+ex);
            return false;
        }
        
    }
    
    
    
}
