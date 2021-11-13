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

    ///Metodo que va devolver una lista de productos
    @GetMapping("/GetUsers")
    public List<user> GetUsers(){

        List<user> users = new ArrayList<user>();


        return users;
    } 

    ///Metodo que va insertar 1 producto
    @GetMapping("/InsertUsert")
    public void InsertProduct(user user){

    } 

    @GetMapping("/UpdateUser")
    public void UpdateProduct(user user){

    } 

    @GetMapping("/GetUser")
    public user GetUser(long id){
        user user = new user();

        return user;
    } 

    @GetMapping("/DeleteUser")
    public void DeleteUser(long id){

    } 
   

    @GetMapping("/VerifyUser")
    public user VerifyUser(String login, String pass){
        user user = new user();

        return user;
    } 
}
