/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.data.DataStore;
import co.edu.sena.exerciseagentea.db.DBShed;
import co.edu.sena.exerciseagentea.model.Shed;

import java.util.List;



/**
 * Fecha:28/10/2026
 * @author H.Suarez
 * Autor: este es el controlador de galpon.
 */
public  class ShedController implements IShedController{
    private DBShed dbShed = new DBShed();
    
    public ShedController(){
        
    }

    @Override
    public void insert(Shed shed) throws Exception {
        if (shed == null)
        {
            throw new UnsupportedOperationException("El gapon esta vacio");
        }
        
        if (shed.getId() == 0)
        {
            throw new Exception("El Número es obligatorio");
            
        }
        if(" ".equals(shed.getState()))
        {
            throw new Exception("El estado es obligatorio");
        }
        
        dbShed.insert(shed);
    }

    @Override
    public void update(Shed shed) throws Exception {
        if (shed == null)
        {
            throw new UnsupportedOperationException("El gapon esta vacio");
        }
        
        if (shed.getId() == 0)
        {
            throw new Exception("El Número es obligatorio");
            
        }
        if(" ".equals(shed.getState()))
        {
            throw new Exception("El estado es obligatorio");
        }
        
         //verificar existencia del galpon a actualizar
         Shed shedExist = find(shed.getId());
         if(shedExist == null)
         {
             throw new Exception("NO existe el registro a actualizar");
         }
         dbShed.update(shed);
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0)
        {
           throw new UnsupportedOperationException("Not supported yet."); 
        }
           //verificar existencia del galpon a Eliminar
        Shed shedExist = find(id);
         if(shedExist == null)
         {
             throw new Exception("NO existe el registro a actualizar");
         }
         dbShed.delete(id);
    }

    @Override
    public Shed find(int id) throws Exception {
        
        if(id == 0)
        {
             throw new UnsupportedOperationException("El numero es obligatorio"); 
        }
        return dbShed.find(id);
    }

    @Override
    public List<Shed> findAll() throws Exception {
        
        return dbShed.findAll();
    }
}

