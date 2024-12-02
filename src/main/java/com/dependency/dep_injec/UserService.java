package com.dependency.dep_injec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    GreetingService greetingService;
    public  void greetUser(String name)
    {
          greetingService.greet(name);
    }
}
