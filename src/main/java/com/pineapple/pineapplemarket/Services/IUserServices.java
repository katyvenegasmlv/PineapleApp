package com.pineapple.pineapplemarket.Services;
import java.util.List;

import com.pineapple.pineapplemarket.Model.user;

public interface IUserServices{
    
    //Metodo de busqueda de todos los usuarios.
    public List<user> findAll();
    
    //Metodo de guardado de un usuario
    public user save(user usuario);
    
    //Metodo de eliminar de un usurio por Id
     public void deleteById(long id);

     //Metodo que va a buscar un usuario
     public user findById (long id);
}
