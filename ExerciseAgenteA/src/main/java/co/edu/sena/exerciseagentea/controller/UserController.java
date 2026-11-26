/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.db.DBUser;
import co.edu.sena.exerciseagentea.model.User;
import java.util.List;

/**
 *
 * @author H.Suarez
 * Objetivo:controlador linea
 */
public class UserController implements IUserController{
    private DBUser dbUser = new DBUser();

    @Override
    public void insert(User user) throws Exception {
        if(user == null)
        {
            throw new Exception("El usuario está vacío");
        }
        
        if("".equals(user.getDocument()))
        {
            throw new Exception("El documento es obligatorio");
        }
        if("".equals(user.getFullName()))
        {
            throw new Exception("El nombre  es obligatorio");
        }
        if("".equals(user.getEmail()))
        {
            throw new Exception("El correo es obligatorio");
        }
        if("".equals(user.getPassword()))
        {
            throw new Exception("La contraseña es obligatoria");
        }
        if(user.getRole() == null)
        {
            throw new Exception("El rol es obligatorio");
        }
        dbUser.insert(user);
    }

    @Override
    public void update(User user) throws Exception {
        if(user == null)
        {
            throw new Exception("El usuario está vacío");
        }
            
        if("".equals(user.getDocument()))
        {
            throw new Exception("El Documento es obligatorio");
        }
        if("".equals(user.getFullName()))
        {
            throw new Exception("El nombre es obligatorio");
        }
        if("".equals(user.getEmail()))
        {
            throw new Exception("El correo es obligatorio");
        }
        if("".equals(user.getPassword()))
        {
            throw new Exception("El Documento es obligatorio");
        }
        if (user.getRole() == null)       
        {
            throw new Exception("El role es obligatorio");
        }
        //verificar existencia de la linea a actualizar
        User userExist = find(user.getId());
        if(userExist == null)
        {
            throw new Exception("No existe el registro a actualizar");
        }
        dbUser.update(user);
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        //verificar existencia de la linea a eliminar
        User userExist = find(id);
        if(userExist == null)
        {
            throw new Exception("No existe el registro a eliminar");
        }
        
        dbUser.delete(id);
    }

    @Override
    public User find(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        return dbUser.find(id);
    }

    @Override
    public List<User> findAll() throws Exception {
        return dbUser.findAll();
    }
}
