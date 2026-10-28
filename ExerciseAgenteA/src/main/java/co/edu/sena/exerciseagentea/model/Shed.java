/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.model;

/**
 * Fecha:22/10/2026
 * @author H.Suarez
 * Autor: este  es el modelo de granja.
 */
public class Shed {
    private int id;
    private String state;

    public Shed() {
    }

    public Shed(int id, String state) {
        this.id = id;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Shed{" + "id=" + id + ", state=" + state + '}';
    }


    
    
    
    
    
}