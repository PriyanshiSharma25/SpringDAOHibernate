package com.rays.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.service.UserServiceInt;


@Component("TestService")
public class TestService {

	@Autowired
	public UserServiceInt service = null;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		TestService test = (TestService) context.getBean("TestService");
		test.testAdd();
		//test.testUpdate();
		//test.testfindByPk();

	}

	private void testAdd() {
		UserDTO dto = new UserDTO();

		dto.setId(1);
		dto.setFirstName("hii");
		dto.setLastName("jikk");
		dto.setLogin("fdi");
		dto.setPassword("123");

		long pk = service.add(dto);

		System.out.println(pk+" Data Added : Successfully!!!");
		
	}

	

}
