package com.pineapple.pineapplemarket;

import static org.junit.jupiter.api.Assertions.assertAll;

import javax.print.DocFlavor.STRING;

import com.pineapple.pineapplemarket.Model.Product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class productTest {
    
    @Autowired
    Product product;

    @Test
    void setId(){
        product = new Product();
        product.setId(1);

        Assertions.assertNotNull(product);
        Assertions.assertEquals(1, product.id);
    }

    @Test
    void getId(){
        product = new Product();
        product.setId(1);

        long id = product.getId();

        Assertions.assertNotNull(product);
        Assertions.assertEquals(1, id);
    }
   
    @Test
    void setname(){
        product = new Product();
        product.setname("harina");

        Assertions.assertNotNull(product);
        Assertions.assertEquals("harina",product.name);
    }

    @Test
    void getname(){
        product = new Product();
        product.setname("harina");

        String name=product.getname();

        Assertions.assertNotNull(product);
        Assertions.assertEquals("harina", name);
    }

    @Test
    void setcategory(){
        product=new Product();
        product.setcategory("alimentos");
        
        Assertions.assertNotNull(product);
        Assertions.assertEquals("alimentos", product.category);
    }

    @Test
    void getcategory(){
       product=new Product();
       product.setcategory("alimentos");

       String categoria=product.getcategory();

       Assertions.assertNotNull(product);
       Assertions.assertEquals("alimentos", categoria);
    }

    @Test
    void setdescription(){
        product= new Product();
        product.setdescription("harina de trigo");

        Assertions.assertNotNull(product);
        Assertions.assertEquals("harina de trigo", product.description);
    }

    @Test
    void getdescription(){
        product=new Product();
        product.setdescription("harina de trigo");

        String descripcion =product.getdescription();
        Assertions.assertNotNull(product);
        Assertions.assertEquals("harina de trigo", descripcion);
    }

    @Test
    void setquantity(){
       product = new Product();
       product.setquantity(2);

    Assertions.assertNotNull(product);
    Assertions.assertEquals(2, product.quantity);
    }

    @Test  
    void getquantity(){
        product=new Product();
        product.setquantity(2);

        Double cantidad=product.getquantity();

        Assertions.assertNotNull(product);
        Assertions.assertEquals(2, cantidad);

    }

    @Test
    void setunitPrice(){
        product=new Product();
        product.setunitPrice(3);

        Assertions.assertNotNull(product);
        Assertions.assertEquals(3, product.unitPrice);
    }

    @Test
    void getunitPrice(){
        product=new Product();
        product.setunitPrice(3);

        Double unidad=product.getunitPrice();

        Assertions.assertNotNull(product);
        Assertions.assertEquals(3, unidad);
        
    }
}

