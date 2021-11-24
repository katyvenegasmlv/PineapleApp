package com.pineapple.pineapplemarket.Configuration;

import com.pineapple.pineapplemarket.Services.IProductServices;
import com.pineapple.pineapplemarket.Services.IUserServices;
import com.pineapple.pineapplemarket.Services.productService;
import com.pineapple.pineapplemarket.Services.userServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public IProductServices productConfiguration(){
        return new productService();
    }

    @Bean
    public IUserServices userConfiguration(){
        return new userServices();
    }
}
