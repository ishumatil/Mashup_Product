package com.stackroute.questionserviceengine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class QuestionServiceEngineApplication  {
	private static final Logger log = LoggerFactory.getLogger(QuestionServiceEngineApplication.class);
	public static void main(String[] args) throws IOException {
		SpringApplication.run(QuestionServiceEngineApplication.class, args);
	}

}

