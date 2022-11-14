/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.FuncionarioDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;

/**
 *
 * @author Sol Serna
 * @authorJessica Serna
 */
public class FuncionarioController {
    
    
    private FuncionarioDao funcionarioDao;

    public FuncionarioController(FuncionarioDao funcionarioDao) {
        this.funcionarioDao = funcionarioDao;
    }
    
    public DefaultTableModel llenarTabla(){
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
     
        model.addColumn("Id");
        model.addColumn("Número Identificacion");
        model.addColumn("Nombres");
        model.addColumn("Apellidos");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Sexo");
        model.addColumn("Telefono");
        model.addColumn("Direccion");
        
        
        
        List<Funcionario> funcionarios = funcionarioDao.findAll();
        String [] registros = new String[8];
        for (Funcionario f: funcionarios){
            registros[0] = String.valueOf(f.getId());
            registros[1] = f.getNumeroIdentificacion();
            registros[2] = f.getNombres();
            registros[3] = f.getApellidos();
            registros[4] = f.getFechaNacimiento().toString();
            registros[5] = f.getSexo().toString();
            registros[6] = f.getTelefono().toString();
            registros[7] = f.getDireccion().toString();
            
         
            
           
            
            model.addRow(registros);
        }
        return model;
    }
     public Funcionario listarPorIdentificacion(String identificacion){
        return funcionarioDao.findByNumeroIdentificacion(identificacion);
    }
    
    public int guardar(Funcionario funcionario){
        return funcionarioDao.save(funcionario);
    }
    
     public int editar(Funcionario funcionario){
        return funcionarioDao.update(funcionario);
     }
       
         
      
        
     
      public void eliminar(String numeroIdentificacion){
        funcionarioDao.delete(numeroIdentificacion);
    }
}
