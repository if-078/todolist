package com.softserve.if078.taskManagementWizard.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.softserve.if078.taskManagementWizard.TaskManagementWizardApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = TaskManagementWizardApplication.class)
@WebAppConfiguration
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.properties")
public class UserRepositoryTest {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private UserRepository repository;

	@Test
	public void givenEmployees_whenGetEmployees_thenStatus200()
	    throws Exception {

		System.out.println("-------------------");
		repository.findAll();
		System.out.println("-------------------");

		//createTestEmployee("bob");

		/*
		 * mvc.perform(get("/api/employees").contentType(MediaType.APPLICATION_JSON)).andExpect(status()
		 * .isOk()).andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON)).andExpect
		 * (jsonPath("$[0].name", is("bob")));
		 */

	}

}
