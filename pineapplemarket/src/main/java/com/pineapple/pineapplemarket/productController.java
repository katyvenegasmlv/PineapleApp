package com.pineapple.pineapplemarket;

import java.util.ArrayList;
import java.util.List;

import com.pineapple.Clases.Product;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/product")
@CrossOrigin(origins = "http://localhost")
public class productController {

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
