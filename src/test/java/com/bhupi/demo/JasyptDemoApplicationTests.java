package com.bhupi.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JasyptDemoApplicationTests {

	@Value("${demo.jasypt.username}")
	private String username;

	@Value("${demo.jasypt.password}")
	private String password;

	@Test
	void logProperties() {
		System.out.println(username);
		System.out.println(password);
	}

}
