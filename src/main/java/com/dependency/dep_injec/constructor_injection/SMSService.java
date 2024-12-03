package com.dependency.dep_injec.constructor_injection;

import org.springframework.stereotype.Component;
@Component("smsservice")

public class SMSService  implements MessagingService{
    public void sendMessage(String message)
    {
        System.out.println("Sending message through SMS Service"+message);
    }
    
}
