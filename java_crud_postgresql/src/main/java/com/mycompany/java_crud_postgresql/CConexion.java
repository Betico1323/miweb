/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_crud_postgresql;

    import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class CConexion {
    
    Connection conectar = null; 
    
    String usuario= "postgres";
    String password= "postgres";
    String bd= "bdescuela";
    String ip= "5432";
    String puerto= "localhost";
    
    String cadena= "jdbc:postgresql://"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        
        try{
            Class.forName("org.postgresql.Driver");
             
            conectar= DriverManager.getConnection(cadena, usuario, password);
            
            JOptionPane.showMessageDialog(null,"Se conecto a la base de datos");
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error:"+e.toString());
        }
        return conectar;
    }
}
