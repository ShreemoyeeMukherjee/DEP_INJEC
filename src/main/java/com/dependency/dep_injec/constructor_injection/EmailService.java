package com.dependency.dep_injec.constructor_injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class EmailService  implements  MessagingService{
    public void sendMessage(String message)
    {
        System.out.println("Messaging through email"+message);
    }
    
}
