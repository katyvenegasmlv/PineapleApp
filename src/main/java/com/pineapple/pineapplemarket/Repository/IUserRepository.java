package com.pineapple.pineapplemarket.Repository;

import com.pineapple.pineapplemarket.Model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//Interface que hereda de la libreria Jpa Repository, la cual 
//ya contiene los metodos de insercion, consulta, actualizacion y eliminacion.
public interface IUserRepository extends JpaRepository<user,Long>{
   
}
