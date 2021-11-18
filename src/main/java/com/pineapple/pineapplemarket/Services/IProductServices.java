package com.pineapple.pineapplemarket.Services;

import java.util.List;

import com.pineapple.pineapplemarket.Model.Product;

//Interface que define el servicio que proveera la informacion
public interface IProductServices {

    //Metodo de busqueda de todos los productos
    public List<Product> findAll();

    //Metodo de guardado de un producto
    public Product save(Product producto);

    //Metodo de eliminar de un producto por Id
    public void deleteById(long id);

    //Metodo de busqueda de un producto por Id
    public Product findById (long id);
}

