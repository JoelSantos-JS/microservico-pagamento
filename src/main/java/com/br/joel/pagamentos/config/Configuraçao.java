package com.br.joel.pagamentos.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuraçao {


    @Bean
    public ModelMapper obtModelMapper() {
        return new ModelMapper();
    
    }
    
}
