package com.pineapple.Clases;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user {
   
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   public long id;
   public String username;
   public String password;
   public String email;
   public String name;
   public String lastName;
   public String role;

   public user(){
       
   }



}
