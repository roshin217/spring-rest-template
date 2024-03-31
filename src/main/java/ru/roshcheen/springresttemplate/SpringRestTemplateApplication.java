package ru.roshcheen.springresttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringRestTemplateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(SpringRestTemplateApplication.class, args);

		Communication communication = context.getBean("communication", Communication.class);
		System.out.println("Answer: " + communication.getAnswer());
	}

}
