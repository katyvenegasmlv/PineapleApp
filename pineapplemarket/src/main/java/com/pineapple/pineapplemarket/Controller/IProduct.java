package com.pineapple.pineapplemarket.Controller;

import org.springframework.data.repository.CrudRepository;

public interface IProduct extends CrudRepository<com.pineapple.Clases.Product, Long> {
    
}
