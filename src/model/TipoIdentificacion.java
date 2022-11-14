/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Sol Serna
 * @authorJessica Serna
 */
public class TipoIdentificacion {
    
   
 private int id;
 private String nombreIdentificacion;
  private String descripcion;


public TipoIdentificacion(){
}

    public TipoIdentificacion(int id) {
        this.id = id;
        
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreIdentificacion() {
        return nombreIdentificacion;
    }

    public void setNombreIdentificacion(String nombreIdentificacion) {
        this.nombreIdentificacion = nombreIdentificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




    
}
