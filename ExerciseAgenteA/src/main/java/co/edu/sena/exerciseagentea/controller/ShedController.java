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

    @Override
    public void insert(Shed shed) throws Exception {
        for (Shed s : sheds){
            if (s.getId()== shed.getId()){
            throw new Exception("El Galpón con este ID ya Existe.");
        }
            sheds.add(shed);
        }
    }

    @Override
    public void update(Shed shed) throws Exception {
        boolean found = false;
        for (int i = 0; i < sheds.size(); i++){
            if (sheds.get(i).getId() == shed.getId()){
                sheds.set(i, shed);
                found = true;
                break;
            }
            if (!found){
                throw new UnsupportedOperationException("El Galpón que intenta modificar no Existe.");
            }
        }
        
    }

    @Override
    public void delete(int id) throws Exception {
        boolean found = false;
        for (int i = 0; i < sheds.size(); i++){
            if (sheds.get(i).getId() == id){
                sheds.remove(i);
                found = true;
                break;
            }
        }
              if (!found){
                throw new UnsupportedOperationException("El Galpón que intenta eliminar no Existe.");
              }   
    }

    @Override
    public Shed find(int id) throws Exception {
        for (Shed s:sheds){
            if (s.getId() == id){
                return s;
            }
        }
             throw new UnsupportedOperationException("Galpón NO encontrado.");
    }
    

    @Override
    public List<Shed> findAll() throws Exception {
        return sheds;
    }

}
