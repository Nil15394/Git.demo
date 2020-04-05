package com.demo.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
		System.out.println("Application started >>>>>>>>>>>>>");
		printMyName();
	}

	private static void printMyName() {
		System.out.println("Nilesh Narkhede");
	}

}
