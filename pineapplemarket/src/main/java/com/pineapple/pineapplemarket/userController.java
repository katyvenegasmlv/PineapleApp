package com.pineapple.pineapplemarket;

import java.util.ArrayList;
import java.util.List;

import com.pineapple.Clases.user;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/user")
@CrossOrigin(origins = "http://localhost")
public class userController {

    ///Metodo para buscar muchos usuarios
    //Devuelve un listado de usuarios
    @GetMapping("/GetUsers")
    public List<user> GetUsers(){

        List<user> users = new ArrayList<user>();


        return users;
    } 

    ///Metodo para crear un usuario
    ///Recibe por parametro el usuario
    //Devuelve true en caso de exito
    @GetMapping("/InsertUsert")
    public void InsertProduct(user user){

    } 

    ///Metodo para actualizar un usuario
    ///Recibe por parametro el usuario
    //Devuelve true en caso de exito
    @GetMapping("/UpdateUser")
    public void UpdateProduct(user user){

    } 

    ///Metodo para buscar un usuario
    ///Recibe por parametro el id
    //Devuelve el usuario
    @GetMapping("/GetUser")
    public user GetUser(long id){
        user user = new user();

        return user;
    } 

    ///Metodo para eliminar un usuario
    ///Recibe por parametro el usuario
    //Devuelve true en caso de exito
    @GetMapping("/DeleteUser")
    public void DeleteUser(long id){

    } 
}
