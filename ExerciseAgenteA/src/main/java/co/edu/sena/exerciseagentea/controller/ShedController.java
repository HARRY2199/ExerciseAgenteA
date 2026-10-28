/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.model.Shed;
import java.util.ArrayList;
import java.util.List;



/**
 * Fecha:28/10/2026
 * @author H.Suarez
 * Autor: este es el controlador de galpon.
 */
public  class ShedController implements IShedController{
    public static List<Shed> shedlist = new ArrayList<>();
    
    public ShedController(){
        shedlist.add(new Shed(1, "DISPONIBLE"));
        shedlist.add(new Shed(2, "DISPONIBLE"));
        shedlist.add(new Shed(3, "OCUPADO"));
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
        
        shedlist.add(shed);
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
        boolean exists = false;
        for(int i = 0; i < shedlist.size(); i++){
            if (shedlist.get(i).getId() == shed.getId())
            {
                shedlist.set(i, shed); // actualiza
                exists = true;
                break;
            }
        }
        if (exists)
        {
            throw new Exception("El galpon no existe");
        }
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0)
        {
           throw new UnsupportedOperationException("Not supported yet."); 
        }
           //verificar existencia del galpon a Eliminar
        boolean exists = false;
        for(int i = 0; i < shedlist.size(); i++){
            if (shedlist.get(i).getId() == id)
            {
                shedlist.remove(i); //eliminar
                exists = true;
                break;
            }
        }
        if (exists)
        {
            throw new Exception("El galpon no existe");
        }
    }

    @Override
    public Shed find(int id) throws Exception {
        
        if(id == 0)
        {
             throw new UnsupportedOperationException("El numero es obligatorio"); 
        }
        Shed shed = null;
         for (Shed s: shedlist){
             if(s.getId() == id)
             {
                 shed = s;
                 break;
             }
             
         } 
         return shed;
    }

    @Override
    public List<Shed> findAll() throws Exception {
        
        return shedlist;
    }
}

