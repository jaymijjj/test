package com.example.spring;

import com.example.spring.module.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=	SpringApplication.run(SpringConceptsApplication.class, args);
		Person person=context.getBean(Person.class);
		person.eating();
	}
}
