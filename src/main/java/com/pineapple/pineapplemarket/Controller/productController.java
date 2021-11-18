package com.pineapple.pineapplemarket.Controller;

import java.util.ArrayList;
import java.util.List;

import com.pineapple.pineapplemarket.Model.Product;
import com.pineapple.pineapplemarket.Services.productService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/product")
@CrossOrigin(origins = "http://localhost")
public class productController {

    @Autowired
    private productService servicio;


    @Autowired(required = true)
    ///Metodo para buscar muchos productos
    //Devuelve un listado de productos
    @GetMapping("/GetProducts")
    public List<Product> GetProducts(){

        //Creo una lista de tipo producto que voy a llenar y devolver
        List<Product> products = new ArrayList<Product>();

        //Lleno la lista de tipo producto
        products = servicio.findAll();

        //Retorna la lista de tipo Producto con la informacion
        return products;
    } 

    ///Metodo para crear un producto
    ///Recibe por parametro el producto
    //Devuelve true en caso de exito
    @GetMapping("/InsertProduct")
    public boolean InsertProduct(Product product){

        boolean result = true;

        product.id=0;

        servicio.save(product);
        
        return result;
    } 

    ///Metodo para actualizar un producto
    ///Recibe por parametro el producto
    //Devuelve true en caso de exito
    @GetMapping("/UpdateProduct")
    public boolean UpdateProduct(Product product){

        boolean result = true;

        servicio.save(product);

        return result;
    } 

    ///Metodo para buscar un producto
    ///Recibe por parametro el name
    //Devuelve el producto
    @GetMapping("/GetProduct")
    public Product GetProduct(long id){
        Product product = new Product();

        product=servicio.findById(id);

        return product;
    } 

    ///Metodo para eliminar un producto
    ///Recibe por parametro el name
    //Devuelve true en caso de exito
    @GetMapping("/DeleteProduct")
    public boolean DeleteProduct(long id){
        boolean result = true;

        servicio.deleteById(id);
        
        return result;
    } 
}
