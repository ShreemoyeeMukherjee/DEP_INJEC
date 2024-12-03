package com.dependency.dep_injec;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component("dbconnection")
public class Dbconnection {
    public void connectDB(){
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
			
    

