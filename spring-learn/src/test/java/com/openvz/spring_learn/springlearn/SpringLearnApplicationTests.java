package com.openvz.spring_learn.springlearn;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;


import com.openvz.spring_learn.springlearn.services.StudentServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringLearnApplicationTests {

	@TestConfiguration
	static class GetStudentService{
		@Bean
		public StudentServiceImpl getBean()
		{
			return new StudentServiceImpl();
		}
	}
	@MockBean
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@Before
	public void setStudentInfo()
	{
		Mockito.when(studentServiceImpl.getEmail()).thenReturn("zodgevv@gmail.com");
		Mockito.when(studentServiceImpl.getFirstName()).thenReturn("Swara");
		Mockito.when(studentServiceImpl.getLastName()).thenReturn("Zodge");
		Mockito.when(studentServiceImpl.getStudentId()).thenReturn(12);
	}
	
	@Test
	public void verifyStudentService() {
		System.out.println(studentServiceImpl.getEmail());
		System.out.println(studentServiceImpl.getFirstName());
		System.out.println(studentServiceImpl.getLastName());
		System.out.println(studentServiceImpl.getStudentId());
		System.out.println(StudentServiceImpl.getSampleResponse());
	}

}
