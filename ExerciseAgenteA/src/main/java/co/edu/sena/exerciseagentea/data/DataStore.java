/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.data;

import co.edu.sena.exerciseagentea.model.Shed;
import java.util.ArrayList;
import java.util.List;

/**
 *  Fecha:28/10/2026
 *  @author H.Suarez
 *  Ibjetivo:almacenb de datos o listas de datos
 */
public class DataStore {
    private static final List<Shed> shedlist = new ArrayList<>();
    
    static{
        //carga inicial de datos
        shedlist.add(new Shed(1, "DISPONIBLE"));
        shedlist.add(new Shed(2, "DISPONIBLE"));
        shedlist.add(new Shed(3, "OCUPADO"));
        
    }
    
    public static List<Shed> getSheList(){
        return shedlist;
    }
    
}
