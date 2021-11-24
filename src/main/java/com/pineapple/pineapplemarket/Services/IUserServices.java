package com.pineapple.pineapplemarket.Services;
import java.util.List;

import com.pineapple.pineapplemarket.Model.User;

public interface IUserServices{
    
    //Metodo de busqueda de todos los usuarios.
    public List<User> findAll();
    
    //Metodo de guardado de un usuario
    public User save(User users);
    
    //Metodo de eliminar de un usurio por Id
     public void deleteById(long id_users);

     //Metodo que va a buscar un usuario
     public User findById (long id_users);
}
