package com.pineapple.pineapplemarket.Repository;

import com.pineapple.pineapplemarket.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
//Interface que hereda de la libreria Jpa Repository, la cual 
//ya contiene los metodos de insercion, consulta, actualizacion y eliminacion.
public interface IUserRepository extends JpaRepository<User,Long>{
	@Query("FROM User WHERE email=:email")
	User findByEmail(@Param("email") String email);
}
