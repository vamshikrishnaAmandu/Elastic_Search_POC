package com.krishna.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@ComponentScan("com.krishna")
@EnableElasticsearchRepositories("com.krishna")
public class ElasticSearchDemoApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(ElasticSearchDemoApplication.class, args);
	}

}
