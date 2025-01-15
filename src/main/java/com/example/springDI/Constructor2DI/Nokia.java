package com.example.springDI.Constructor2DI;

import org.springframework.stereotype.Component;

@Component
public class Nokia implements SmartPhone{
    @Override
    public String getPhoneName() {
        return "Nokia phone";
    }
}
