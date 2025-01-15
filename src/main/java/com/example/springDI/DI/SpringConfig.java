package com.example.springDI.DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Engine getEngineBean() {
        Engine engine= new NewEngine();
        return engine;
    }
}
