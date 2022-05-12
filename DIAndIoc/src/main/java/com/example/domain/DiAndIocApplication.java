package com.example.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.repository.ProductRepositoryImpl;

@SpringBootApplication
public class DiAndIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiAndIocApplication.class, args);

		// ProductRepositoryImpl productRepositoryImpl = new ProductRepositoryImpl();

		// IOC & DI
		// Expecting the spring framework to inject the dependancy.

		ProductRepositoryImpl productRepositoryImpl = null;
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		productRepositoryImpl = classPathXmlApplicationContext.getBean("productRepositoryImpl",
				ProductRepositoryImpl.class);
		System.out.println(productRepositoryImpl.findAll());
		classPathXmlApplicationContext.close();
	}

}
