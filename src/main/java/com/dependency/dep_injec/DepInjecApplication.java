package com.dependency.dep_injec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dependency.dep_injec.constructor_injection.EmailService;
import com.dependency.dep_injec.constructor_injection.MessagingService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import com.dependency.dep_injec.constructor_injection.UserNotificationService;

@SpringBootApplication
public class DepInjecApplication {
	@Autowired
		//private App app;
		//private  UserService userservice;
		
			public static void main(String[] args) {
				
				var context = SpringApplication.run(DepInjecApplication.class, args);
		
				// Get the App bean from the context and call the helloService method
				// UserService userservice = context.getBean(UserService.class);
				// userservice.greetUser("shree");
				// MessagingService messagingService= context.getBean("emailservice",MessagingService.class);
				// messagingService.sendMessage("Hellooooooo");
				try {
					// Build the SessionFactory from hibernate.cfg.xml
					SessionFactory sessionFactory = new Configuration()
							.configure("hibernate.cfg.xml") // Config file name
							
							.buildSessionFactory();
		
					// Open a session and test the connection
					//Session session = sessionFactory.openSession();
					System.out.println("Hibernate connection successful!");
		
					//session.close();
					sessionFactory.close();
		
				} catch (Exception e) {
					System.out.println("Error: Could not establish Hibernate connection.");
					e.printStackTrace();
				}
			}
	}


