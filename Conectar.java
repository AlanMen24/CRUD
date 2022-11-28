/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author osito
 */
public class Conectar {
    
    Connection cn;
    
    public Connection conexicn (){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/basededatos","root","");
            System.out.println("conectado");
            
            } catch (ClassNotFoundException | SQLException e) { 
                
                System.err.println(e.getMessage ());
                       
        }
        
        return cn;
             
        }
    

    
}
