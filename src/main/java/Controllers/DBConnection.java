/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hecto
 */
public class DBConnection {
    
    public static Connection con = connect();

    public static Connection connect() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Connection con = null;
        
        String url = "jdbc:postgresql:Progra2BD";
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","123456");
        try {
            con = DriverManager.getConnection(url, props);
            if (con != null){
                System.out.println("Connection Established");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: Failed to establish connection. Error:\n");
            ex.printStackTrace();
        }
        return con;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Procedures.insert("NEW_PATIENT", new String[]{"Marianela", "Delgado", "Aguirre", "1969-06-29", "A+", "Casa", "Costa Rica"});
    }
    
}
