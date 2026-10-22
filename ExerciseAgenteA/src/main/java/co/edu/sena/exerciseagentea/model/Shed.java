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
    private String status;
    
    public Shed() {
    }

    public Shed(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "shed{" + "id=" + id + ", status=" + status + '}';
    }
    
    
    
    
    
}
