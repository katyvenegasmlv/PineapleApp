package com.pineapple.pineapplemarket.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//etiqueta entidad
@Entity
//etiqueta que identifica el nombre de la tabla productos
@Table(name="product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(length = 50,nullable = false )
    public String name;

    @Column(length = 50,nullable = false )
    public String category;

    @Column(length = 50)
    public String description;

    @Column(nullable = false )
    public double quantity;

    @Column(nullable = false )
    public double unitPrice;

    @Column(nullable = false )
    public byte[] picture;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public Product(){
    
    }

    public void insert(Product product){

    }
}
