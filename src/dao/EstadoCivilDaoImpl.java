/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Conexion;
import model.EstadoCivil;
import utils.Mensajes;

/**
 *
 * @authorSol Serna
 * @authorJessica Serna
 */
public class EstadoCivilDaoImpl implements EstadoCivilDao {

   private Conexion conexion;
    private Statement st;
    private ResultSet rS;
    
    

    @Override
    public List<EstadoCivil> findAll() {
        
        List<EstadoCivil> estadosC = new ArrayList <>();
        
        try {
            
            String sql = "SELECT * FROM estado_civil";
            conexion = new Conexion ();
            st = conexion.getConeccion().createStatement();
            
            rS = st.executeQuery(sql);
            while(rS.next()){
                EstadoCivil estadoCivil = new EstadoCivil();
                estadoCivil.setId(rS.getInt("id"));
                estadoCivil.setNombreEstadoCivil(rS.getString("nombre_estado_civil"));
                        
             
                estadosC.add(estadoCivil);
                
            }
            st.close();
            rS.close();
            conexion.getConeccion().close();
            
          
        } catch (SQLException ex) {
            Mensajes.mensajeError("Error BDD", ex.getMessage());
        }
        
        
        return estadosC;
    }  
    
 
    
    
    
}
