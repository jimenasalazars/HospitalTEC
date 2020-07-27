/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author hecto
 */
public class Procedures {
    public static void insert(String procName, String[] values) throws SQLException{
        String statement = "CALL " + procName + "(";
        Statement stm;
        try {
            stm = DBConnection.con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Error establishing connection. (Class: Procedures. Method: insert)");
            return;
        }
        
        
        for(int i = 0; i < values.length; i++){
            if(i == (values.length-1)){
                
                try{
                    Integer.parseInt(values[i]);
                    statement = statement + "'" + values[i] + "'::INTEGER)";
                    
                } catch(Exception e){
                    
                    try{
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        dateFormat.parse(values[i]);
                        statement = statement + "'" + values[i] + "'::DATE)";
                        
                    } catch(Exception ex){
                        
                        statement = statement + "'" + values[i] + "'::text)";
                    }
                }
            }
            else{
                try{
                    Integer.parseInt(values[i]);
                    statement = statement + "'" + values[i] + "'::INTEGER, ";
                    
                } catch(Exception e){
                    
                    try{
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        dateFormat.parse(values[i]);
                        statement = statement + "'" + values[i] + "'::DATE, ";
                        
                    } catch(Exception ex){
                        
                        statement = statement + "'" + values[i] + "'::text, ";
                    }
                }
            }
        }
        System.out.println(statement);
        stm.execute(statement);
    }
    
    
    public static void function(String fName) throws SQLException{
        Statement stm = DBConnection.con.createStatement();
    }
}
