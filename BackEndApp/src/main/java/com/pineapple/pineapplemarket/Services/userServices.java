package com.pineapple.pineapplemarket.Services;

import java.util.List;

import com.pineapple.pineapplemarket.Model.User;
import com.pineapple.pineapplemarket.Repository.IUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class userServices implements IUserServices {

    @Autowired
    private IUserRepository repositorio; 

    @Override
    @Transactional(readOnly=true)
    public List<User> findAll() {
        List<User> listaUsuario=repositorio.findAll();
        return listaUsuario ;
    }

    @Override
    public User save(User users) {
        return repositorio.save(users);
    }

    @Override
    public void deleteById(long id_users) {
        repositorio.deleteById(id_users);
    }
    
    @Override
    public User findById(long id_users){
       User users=repositorio.findById(id_users).orElse(new User());
        return users;
    }
}
