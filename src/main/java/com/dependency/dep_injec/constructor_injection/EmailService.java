package com.dependency.dep_injec.constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("emailservice")

public class EmailService  implements  MessagingService{
    
        @Autowired
        @Qualifier("id2")
        Serviceid serviceid;
    
    public void sendMessage(String message)
    {
        System.out.println("Messaging through email"+message+serviceid.a);
    }
    
}
