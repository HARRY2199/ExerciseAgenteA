/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.model.Shed;
import java.util.List;
import javax.swing.GroupLayout.Group;

/**
 *
 * @author Aprendiz
 */
public interface IShedController {
    
    public void insert(Shed shed ) throws Exception;
    public void update(Shed shed) throws Exception;
    public void delete(int id) throws Exception;
    public Group find(int id) throws Exception;
    public List<Shed> findAll() throws Exception;
}