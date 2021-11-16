package com.pineapple.pineapplemarket.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//etiqueta entidad
@Entity
//etiqueta que identifica el nombre de la tabla usuarios
@Table(name="users")
public class user {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   public long id;

   @Column(length = 50,nullable = false )
   public String username;

   @Column(length = 50,nullable = false )
   public String password;

   @Column(length = 50,nullable = false )
   public String email;

   @Column(length = 50,nullable = false )
   public String name;
   
   @Column(length = 50,nullable = false )
   public String lastName;

   @Column(length = 50,nullable = false )
   public String role;

   public long getId(){
      return id;
   }

  public void setId(long id){
      this.id = id;
  }
   public user(){
       
   }



}
