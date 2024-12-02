package com.dependency.dep_injec;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public   void greet(String name)
    {
        System.out.println("Hello"+name);
    }
    
}
