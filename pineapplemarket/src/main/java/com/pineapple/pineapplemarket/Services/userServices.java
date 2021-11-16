package com.pineapple.pineapplemarket.Services;

import java.util.List;

import com.pineapple.pineapplemarket.Model.user;
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
    public List<user> findAll() {
        List<user> listaUsuario=repositorio.findAll();
        return listaUsuario ;
    }

    @Override
    public user save(user usuario) {
        user  cliente;
        cliente=repositorio.save(usuario);
        return cliente;
    }

    @Override
    public void deleteById(long id) {
        repositorio.deleteById(id);
    }
    
    @Override
    public user findById(long id){
        user usuario;
        usuario=repositorio.findById(id).orElse(new user());
        return usuario;
    }
}
