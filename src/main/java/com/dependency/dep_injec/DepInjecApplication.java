package com.dependency.dep_injec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepInjecApplication {
	@Autowired
		private App app;

	public static void main(String[] args) {
		
		var context = SpringApplication.run(DepInjecApplication.class, args);

        // Get the App bean from the context and call the helloService method
        App app = context.getBean(App.class);
        app.HelloService();
	}

}
