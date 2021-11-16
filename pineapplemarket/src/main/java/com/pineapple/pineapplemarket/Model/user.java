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

   public String getusername(){
      return username;
   }
   public void setusername(String username){
      this.username=username;
   }
   public String getpassword(){
      return password;
   }
   public void setpassword(String password){
      this.password=password;
   }

   public String getemail(){
      return email;
   }
   public void setemail(String email){
      this.email=email;
   }

   public String getname(){
      return name;
   }
   public void setname(String name){
      this.name=name;
   }

   public String getlastName(){
      return lastName;
   }
   public void setlastName(String lastName){
      this.lastName=lastName;
   }
   public String getrole(){
      return role;
   }
   public void setrole(String role){
      this.role=role;
   }
}
