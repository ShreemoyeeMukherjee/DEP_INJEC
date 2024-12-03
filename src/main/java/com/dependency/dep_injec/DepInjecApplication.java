package com.dependency.dep_injec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dependency.dep_injec.constructor_injection.EmailService;
import com.dependency.dep_injec.constructor_injection.MessagingService;
//import com.dependency.dep_injec.constructor_injection.UserNotificationService;

@SpringBootApplication
public class DepInjecApplication {
	@Autowired
		//private App app;
		///private  UserService userservice;
		
			public static void main(String[] args) {
				
				var context = SpringApplication.run(DepInjecApplication.class, args);
		
				// Get the App bean from the context and call the helloService method
				// UserService userservice = context.getBean(UserService.class);
				// userservice.greetUser("shree");
				MessagingService messagingService= context.getBean("emailservice",MessagingService.class);
				messagingService.sendMessage("Hellooooooo");
	}

}
