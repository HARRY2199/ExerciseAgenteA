/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.model.Shed;
import java.util.ArrayList;
import java.util.List;


/**
 * Fecha:22/10/2026
 * @author H.Suarez
 * Autor: este es el controlador de granja.
 */
public  class ShedController implements IShedController{
      public static List<Shed> sheds = new ArrayList<>();
      public ShedController(){
        Shed shed1 = new Shed(1, "DISPONIBLE");
        sheds.add(shed1);
        Shed shed2 = new Shed(2, "OCUPADO");
        sheds.add(shed2);
        Shed shed3 = new Shed(3, "DISPONIBLE");
        sheds.add(shed3);
              
      }

    @Override
    public void insert(Shed shed) throws Exception {
        if(shed == null)
        {
            throw new Exception("El Galpón está vacío");
        }
        if(shed.getId() == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        if("".equals(shed.getStatus()))
        {
            throw new Exception("El estado es obligatorio");
        }
        //insertar
        sheds.add(shed);
        
    }

    @Override
    public void update(Shed shed) throws Exception {
                    if(shed == null)
        {
            throw new Exception("El Galpón está vacío");
        }
        if(shed.getId() == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        if("".equals(shed.getStatus()))
        {
            throw new Exception("El estado es obligatorio");
        }
                //validar si el grupo a actualizar existe        
        boolean exists = false;
        for (int i = 0; i < sheds.size(); i++) {
            if(sheds.get(i).getId() == shed.getId())
            {
                //actualizar
                sheds.set(i, shed);
                exists = true;
                break;
            }
        }
        
        if(!exists)
        {
            throw new Exception("No existe El Galpón a actualizar");
        }    
    }

    public void delete(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        //eliminar
        for (Shed s : sheds) {
            if(s.getId() == id)
            {
                sheds.remove(s);
                break;
            }
        }
    }

      @Override
    public Shed find(int id) throws Exception {
                if(id == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        Shed result = null;
        for (Shed s : sheds) {
            if(s.getId() == id)
            {
                result = s;
            }
        }
        
        return result;
    }

    @Override
    public List<Shed> findAll() throws Exception {
                return sheds;
    } 
}
