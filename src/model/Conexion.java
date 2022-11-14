/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Mensajes;

/**
 *
 *@author Sol Serna
 *@authorJessica Serna
 */


public class Conexion {
    
private static final String URL = "jdbc:mysql://localhost:3306/RecursosIUD";
private static final String USUARIO = "root";
private static final String CLAVE = ""; 

   private Connection coneccion;

    public Conexion()  {
    try {
        coneccion = DriverManager.getConnection(URL,USUARIO,CLAVE);
        coneccion.createStatement();
    } catch (SQLException ex) {
      Mensajes.mensajeError("Error", ex.getMessage());
        
        //crear aviso o msj grafico
        
        
    }
    }

 


    public Connection getConeccion() {
        return coneccion;
    }

    public void setConeccion(Connection coneccion) {
        this.coneccion = coneccion;
    }
    
 
    
    
    
    
    
}
