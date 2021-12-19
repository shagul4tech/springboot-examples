package com.s4t.spring.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.s4t.spring.reactive.greeting.GreetingClient;

@SpringBootApplication
public class SpringReactiveApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringReactiveApplication.class, args);
	    GreetingClient greetingClient = context.getBean(GreetingClient.class);
	    // We need to block for the content here or the JVM might exit before the message is logged
	    System.out.println(">> message = " + greetingClient.getMessage().block());
	}

}
