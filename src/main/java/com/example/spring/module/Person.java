package com.example.spring.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    Food food;
    public void speak(){
        System.out.println("person is walking");
    }

    public void eating(){
        food.recipes();
    }

}
