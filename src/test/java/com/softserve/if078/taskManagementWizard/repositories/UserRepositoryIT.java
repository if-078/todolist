package com.softserve.if078.taskManagementWizard.repositories;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.softserve.if078.taskManagementWizard.TaskManagementWizardApplication;
import com.softserve.if078.taskManagementWizard.configuration.H2JpaConfig;
import com.softserve.if078.taskManagementWizard.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { TaskManagementWizardApplication.class, H2JpaConfig.class })
public class UserRepositoryIT {

	@Autowired
	private UserRepository repository;

	@Test
	public void iTShouldInsertAndGetById()
	    throws Exception {
		// Given
		User userTest = new User();
		userTest.setName("userAcademy");
		userTest.setEmail("softServeAcademy@gmail.test");
		userTest.setPass("academypassword");
		// When
		User userSave = repository.save(userTest);
		User userGetOne = repository.getOne(userSave.getId());
		// Then
		assertEquals(userTest.getEmail(), userSave.getEmail());
		assertEquals(userTest.getPass(), userSave.getPass());
		assertEquals(userSave.getId(), userGetOne.getId());
	}

	@Test
	public void iTShouldGetAllAndEmailPassAndDelete()
	    throws Exception {
		// Given
		User userTest1 = new User();
		userTest1.setName("user1");
		userTest1.setEmail("email1");
		userTest1.setPass("pass1");

		User userTest2 = new User();
		userTest2.setName("user2");
		userTest2.setEmail("email2");
		userTest2.setPass("pass2");
		// When
		repository.save(userTest1);
		repository.save(userTest2);
		List<User> listUsers = repository.findAll();
		User usEmailPass = repository.findByEmailAndPass(userTest2.getEmail(), userTest2.getPass());
		repository.delete(userTest1.getId());
		// Then
		assertEquals(userTest2.getEmail(), usEmailPass.getEmail());
		assertEquals(listUsers.size() - 1, repository.findAll().size());
	}

}
