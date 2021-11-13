package com.pineapple.Clases;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String name;
    public String category;
    public String description;
    public double quantity, unitPrice;
    public byte[] picture;

    public Product(){
    
    }

    public void insert(Product product){

    }
}
