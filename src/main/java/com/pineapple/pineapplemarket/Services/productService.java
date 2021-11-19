package com.pineapple.pineapplemarket.Services;

import java.util.List;


import com.pineapple.pineapplemarket.Model.Product;
import com.pineapple.pineapplemarket.Repository.IProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//Servicio que proveera la informacion
public class productService implements IProductServices{

    @Autowired
    private IProductRepository repositorio;

    @Override
    @Transactional(readOnly=true)
    public List<Product> findAll() {
        
        List<Product> listaProductos = repositorio.findAll();

        return listaProductos;
    }

    @Override
    public Product save(Product producto) {
        
        return repositorio.save(producto);
    }

    @Override
    public void deleteById(long id) {
        repositorio.deleteById(id);        
    }

    @Override
    public Product findById(long id){
        Product product = repositorio.findById(id).orElse(new Product());

        return product;
    }
}
