package com.function.config;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFunction {
	
	private final SubscriberService subscribers;
	
	public SpringConfigFunction(SubscriberService subscribers) {
		this.subscribers=subscribers;
	}

	@Bean
	public Consumer<String> create() {
		return (email) -> subscribers.create(email);
	}

	@Bean
	public Supplier<List<String>> findAll() {
		return () -> subscribers.findAll();
	}

}
