package com.dependency.dep_injec;
import org.springframework.stereotype.Component;

@Component

public class App
{
    public void HelloService()
    {
        System.out.println("Hello from HelloService");
    }

}