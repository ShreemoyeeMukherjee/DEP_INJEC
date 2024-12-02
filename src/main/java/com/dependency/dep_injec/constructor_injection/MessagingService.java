package com.dependency.dep_injec.constructor_injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component

public interface MessagingService {
      public void  sendMessage(String message);
}
