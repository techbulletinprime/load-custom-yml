package com.yaml.load;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootApplication
@PropertySource(factory=YamlPropertySourceFactory.class,value = "states.yaml")
public class LoadCustomYalmApplication {

	public static void main(String[] args) {

	ConfigurableApplicationContext ctx= SpringApplication.run(LoadCustomYalmApplication.class, args);
		Environment env=ctx.getEnvironment();
		System.out.println("Odisha abbr ::"+env.getProperty("india.odisha"));
	}

}
