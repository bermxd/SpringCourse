package org.example.springcourse;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Component
@Primary
public class Dog implements Pet{

//    private String name;
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }


//    @PostConstruct
//    public void init() {
//        System.out.println("Class Dog: init method");
//    }


//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class Dog: destroy method");
//    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
