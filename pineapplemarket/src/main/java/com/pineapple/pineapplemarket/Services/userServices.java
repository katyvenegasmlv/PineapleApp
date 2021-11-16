package com.pineapple.pineapplemarket.Services;

import java.util.List;

import com.pineapple.pineapplemarket.Model.user;

import org.springframework.transaction.annotation.Transactional;

public class userServices implements IUserServices {

    @Override
    @Transactional(readOnly=true)
    public List<user> findAll() {
        
        return null;
    }

    @Override
    public user save(user usuario) {
        
        return null;
    }

    @Override
    public void deleteById(long id) {
        
        
    }
    
}
