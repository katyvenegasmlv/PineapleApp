package com.pineapple.pineapplemarket;

import com.pineapple.pineapplemarket.Model.user;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class userTest {
    
    @Autowired
    user userModel;

    @Test
    void setId(){
        userModel = new user();
        userModel.setId(1);

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals(1, userModel.id);
    }

    @Test
    void getId(){
        userModel = new user();
        userModel.setId(1);

        long id = userModel.getId();

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals(1, id);
    }

    @Test
    void setusername(){
        userModel=new user();
        userModel.setusername("jose");

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals("jose",userModel.username);
    }

    @Test
    void getusername(){
        userModel = new user();
        userModel.setusername("jose");

        String name=userModel.getusername();

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals("jose", name);
    }

    @Test
    void setpassword(){
        userModel=new user();
        userModel.setpassword("contraseña");

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals("contraseña",userModel.password);
    }

    @Test
    void getpassword(){
        userModel = new user();
        userModel.setpassword("contraseña");

        String pass=userModel.getpassword();

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals("contraseña",pass);
    }
    
    @Test
    void setemail(){
        userModel=new user();
        userModel.setemail("correo");

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals("correo",userModel.email);
    }
    
    @Test
    void getemail(){
        userModel = new user();
        userModel.setemail("correo");

        String mail=userModel.getemail();

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals("correo",mail);
    }

    @Test
    void setname(){
        userModel=new user();
        userModel.setname("jose");

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals("jose",userModel.name);
    }
    @Test
    void getname(){
        userModel = new user();
        userModel.setname("jose");

        String name=userModel.getname();

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals("jose",name);
    }

    @Test
    void setlastName(){
        userModel=new user();
        userModel.setlastName("perez");

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals("perez",userModel.lastName);
    }

    @Test
    void getlastName(){
        userModel = new user();
        userModel.setlastName("perez");

        String lastname=userModel.getlastName();

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals("perez",lastname);
    }

    @Test
    void settrole(){
        userModel=new user();
        userModel.setrole("rol");

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals("rol",userModel.role);
    }
    
    @Test
    void getrole(){
        userModel = new user();
        userModel.setrole("rol");

        String role=userModel.getrole();

        Assertions.assertNotNull(userModel);
        Assertions.assertEquals("rol",role);
    }
}