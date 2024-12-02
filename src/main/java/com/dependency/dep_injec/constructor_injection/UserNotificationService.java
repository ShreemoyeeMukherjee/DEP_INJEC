package com.dependency.dep_injec.constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserNotificationService {
    
    
    @Autowired
@Qualifier("emailservice")
private  MessagingService messagingService;
    
    public UserNotificationService(MessagingService messagingService)
    { 
        this.messagingService  = messagingService;
        
    }


}
