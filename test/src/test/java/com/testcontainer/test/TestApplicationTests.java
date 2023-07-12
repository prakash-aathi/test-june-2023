package com.testcontainer.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
@Testcontainers
class TestApplicationTests {

	static MySQLContainer<?> mySqlContainer = new MySQLContainer<>("mysql:8.0");

	@BeforeAll
	static void setUp() {
		mySqlContainer.start();
	}

	@AfterAll
	static void tearDown() {
		mySqlContainer.stop();
	}


	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testHello() throws Exception {
		System.out.println("JDBC URL: " + mySqlContainer.getJdbcUrl());
		System.out.println("Username: " + mySqlContainer.getUsername());
		System.out.println("Password: " + mySqlContainer.getPassword());
		System.out.println("Database Name: " + mySqlContainer.getDatabaseName());

		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		String content = result.getResponse().getContentAsString();
		System.out.println(content);
	}

}
