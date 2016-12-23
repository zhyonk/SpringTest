package com.zhyonk.spring;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	@Test
	public void test() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("file:C:/dev/workspace/Eclipseworkspace/Spring/src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
		Object bean = beanFactory.getBean("homeController");
		String[] aliases = beanFactory.getAliases("homeController");
		System.out.println(bean);
	}

}
