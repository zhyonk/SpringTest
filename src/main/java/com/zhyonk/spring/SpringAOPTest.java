package com.zhyonk.spring;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zhyonk.service.PersonService;

public class SpringAOPTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("C:/dev/workspace/Eclipseworkspace/Spring/src/main/webapp/WEB-INF/spring/root-context.xml");
		PersonService service = (PersonService) ctx.getBean("personServiceImpl");
		service.save("....");
	}

}
