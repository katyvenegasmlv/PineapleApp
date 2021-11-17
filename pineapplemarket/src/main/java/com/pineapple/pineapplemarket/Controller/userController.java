package com.pineapple.pineapplemarket.Controller;

import java.util.ArrayList;
import java.util.List;

import com.pineapple.pineapplemarket.Model.user;
import com.pineapple.pineapplemarket.Services.userServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//Path despues inicio de la URL
@RequestMapping(path = "/user")
//inicio de la URL
@CrossOrigin(origins = "http://localhost")
public class userController {

    @Autowired
    private userServices servicio;
    
    ///Metodo para buscar muchos usuarios
    //Devuelve un listado de usuarios
    @GetMapping("/GetUsers")
    public List<user> GetUsers(){

        List<user> users = new ArrayList<user>();
     
        users=servicio.findAll();
        return users;
    } 

    ///Metodo para crear un usuario
    ///Recibe por parametro el usuario
    //Devuelve true en caso de exito
    @GetMapping("/InsertUsert")
    public void InsertProduct(user user){
        user.id=0;
        servicio.save(user);

    } 

    ///Metodo para actualizar un usuario
    ///Recibe por parametro el usuario
    //Devuelve true en caso de exito
    @GetMapping("/UpdateUser")
    public void UpdateProduct(user usuario){
        servicio.save(usuario);
    } 

    ///Metodo para buscar un usuario
    ///Recibe por parametro el id
    //Devuelve el usuario
    @GetMapping("/GetUser")
    public user GetUser(long id){
        user user = new user();
        user=servicio.findById(id);
        return user;
    } 

    ///Metodo para eliminar un usuario
    ///Recibe por parametro el usuario
    //Devuelve true en caso de exito
    @GetMapping("/DeleteUser")
    public void DeleteUser(long id){
        servicio.deleteById(id);
    } 

    ///Metodo para buscar un usuario por login y pass
    ///Recibe por parametro el usuario
    //Devuelve el usuario
    @GetMapping("/FindUserByEmailAndPass")
    public user FindUserByEmailAndPass(String email, String pass){
        
        List<user> users = new ArrayList<user>();
     
        users=servicio.findAll();

        user usuario = new user();

        for (user user : users) {
            if(user.email == email && user.password == pass){
                usuario = user;
            }
        }

        return usuario;
    } 

}
