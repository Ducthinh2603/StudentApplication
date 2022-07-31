package com.student;

import org.apache.coyote.Response;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class StudentControllerRestTemplateTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testGetAllStudent() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/student", String.class);
		System.out.println(response.getBody());
	}

}
