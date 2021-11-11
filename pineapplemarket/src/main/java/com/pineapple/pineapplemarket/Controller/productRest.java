package com.pineapple.pineapplemarket.Controller;

import java.util.ArrayList;
import java.util.List;

import com.pineapple.Clases.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productRest {
    
    ///Metodo que va devolver una lista de productos
    @GetMapping("/GetProducts")
    public List<Product> GetProducts(){
        
        List<Product> products = new ArrayList<Product>();


        return products;
    } 
    
    ///Metodo que va insertar 1 producto
    @GetMapping("/InsertProduct")
    public void InsertProduct(Product product){
        
    } 
    
    @GetMapping("/UpdateProduct")
    public void UpdateProduct(Product product){
        
    } 

    @GetMapping("/GetProduct")
    public void GetProduct(String name){
        
    } 

    @GetMapping("/DeleteProduct")
    public void DeleteProduct(String name){
        
    } 
}
