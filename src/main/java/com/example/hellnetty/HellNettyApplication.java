package com.example.hellnetty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellNettyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HellNettyApplication.class, args);
	}

	@Autowired
	private ServerTest serverTest;

	@Override
	public void run(String... strings) throws Exception {
		serverTest.start();
	}
}
