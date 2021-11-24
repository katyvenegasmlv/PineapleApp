package com.pineapple.pineapplemarket.Controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.pineapple.pineapplemarket.Model.User;
import com.pineapple.pineapplemarket.Services.userServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
//Path despues inicio de la URL
@RequestMapping(path = "/user")
//inicio de la URL
@CrossOrigin(origins = "*")
public class userController {
	


    @Autowired
    private userServices servicio;
    
    ///Metodo para buscar muchos usuarios
    //Devuelve un listado de usuarios
    @GetMapping("/GetUsers")
    public List<User> GetUsers(){

        List<User> users = new ArrayList<User>();
     
        users=servicio.findAll();
        return users;
    } 

    ///Metodo para crear un usuario
    ///Recibe por parametro el usuario
    //Devuelve true en caso de exito
    @PostMapping("/InsertUser")
    public boolean InsertUser(@RequestBody User users){
    	 boolean result = true;
    	users.id_users=0;
        servicio.save(users);
        return result;

    } 

    ///Metodo para actualizar un usuario
    ///Recibe por parametro el usuario
    //Devuelve true en caso de exito
    @RequestMapping(value="/UpdateUser/{id_users}", method=RequestMethod.PUT)
    public void UpdateUser(@RequestBody User users){
        servicio.save(users);
    } 

    ///Metodo para buscar un usuario
    ///Recibe por parametro el id
    //Devuelve el usuario
    @GetMapping("/GetUser")
    public User GetUser(long id_users){
        User users = new User();
        users=servicio.findById(id_users);
        return users;
    } 

    ///Metodo para eliminar un usuario
    ///Recibe por parametro el usuario
    //Devuelve true en caso de exito
    @RequestMapping(value="/DeleteUser/{id_users}", method=RequestMethod.DELETE)
    public void DeleteUser(@PathVariable long id_users){
        servicio.deleteById(id_users);
    } 

    ///Metodo para buscar un usuario por login y pass
    ///Recibe por parametro el usuario
    //Devuelve el usuario
    @RequestMapping(value="/FindUserByEmailAndPass", method=RequestMethod.POST)
    public User FindUserByEmailAndPass(@RequestBody User userRequest){
        
    	User usuario = new User();
    	
        List<User> users = new ArrayList<User>();
     
        users=servicio.findAll();
        
        String contraseña = userRequest.password;
        byte[] bytesDecodificados = Base64.getDecoder().decode(contraseña);
        String cadenaDecodificada = new String(bytesDecodificados);
        
        
        for (User user : users) {
        
        	String passwordInterno = user.password;
            byte[] bytesDecodificadosInterno = Base64.getDecoder().decode(passwordInterno);
            String password = new String(bytesDecodificadosInterno);
            
            if(user.email.equals(userRequest.email) && password.equals(cadenaDecodificada)){
            	usuario = user;
            }
        }
        
        System.out.print(usuario);

        return usuario;
    }
}
    
