package com.example.springDI.Constructor2DI;

import org.springframework.stereotype.Component;

@Component
public class Apple implements SmartPhone{
    @Override
    public String getPhoneName() {
        return "Apple phone";
    }
}
