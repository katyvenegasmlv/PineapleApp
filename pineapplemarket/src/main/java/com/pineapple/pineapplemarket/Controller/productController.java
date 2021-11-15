package com.pineapple.pineapplemarket.Controller;

import java.util.ArrayList;
import java.util.List;

import com.pineapple.pineapplemarket.Model.Product;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/product")
@CrossOrigin(origins = "http://localhost")
public class productController {

    ///Metodo para buscar muchos productos
    //Devuelve un listado de productos
    @GetMapping("/GetProducts")
    public List<Product> GetProducts(){

        List<Product> products = new ArrayList<Product>();


        return products;
    } 

    ///Metodo para crear un producto
    ///Recibe por parametro el producto
    //Devuelve true en caso de exito
    @GetMapping("/InsertProduct")
    public boolean InsertProduct(Product product){

        boolean result = true;

        return result;
    } 

    ///Metodo para actualizar un producto
    ///Recibe por parametro el producto
    //Devuelve true en caso de exito
    @GetMapping("/UpdateProduct")
    public boolean UpdateProduct(Product product){

        boolean result = true;

        return result;
    } 

    ///Metodo para buscar un producto
    ///Recibe por parametro el name
    //Devuelve el producto
    @GetMapping("/GetProduct")
    public Product GetProduct(String name){
        Product product = new Product();


        return product;
    } 

    ///Metodo para eliminar un producto
    ///Recibe por parametro el name
    //Devuelve true en caso de exito
    @GetMapping("/DeleteProduct")
    public boolean DeleteProduct(String name){
        boolean result = true;

        return result;
    } 
}
