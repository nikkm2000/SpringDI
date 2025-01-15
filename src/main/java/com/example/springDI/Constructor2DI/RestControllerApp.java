package com.example.springDI.Constructor2DI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestControllerApp {
    SmartPhone smartPhone;

    public RestControllerApp(@Qualifier("nokia") SmartPhone smartPhone) {
        this.smartPhone= smartPhone;
    }
    @GetMapping("/map/phoneName")
    public String getName(){
        return smartPhone.getPhoneName();
    }

}
