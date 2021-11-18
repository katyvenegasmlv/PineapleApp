package com.pineapple.pineapplemarket.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//etiqueta entidad//
@Entity
//etiqueta que identifica el nombre de la tabla productos//
@Table(name="product")
public class Product implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }

    public String getcategory(){
        return category;
    }
    public void setcategory(String category){
        this.category=category;
    }
    
    public String getdescription(){
        return description;
    }
    public void setdescription(String description){
        this.description=description;
    }

    public double getquantity(){
         return quantity;
    }
    public void setquantity(double quantity){
        this.quantity=quantity;
    }
    

    public double getunitPrice(){
        return unitPrice;
    }
    public void setunitPrice (double unitPrice){
        this.unitPrice=unitPrice;
    }
    
    public byte[] getpicture(){
        return picture;
    }
    public void setpicture (byte[] picture){
        this.picture=picture;
    }
}
