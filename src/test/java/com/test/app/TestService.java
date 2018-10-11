package com.test.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.pojo.Mobile;
import com.offcn.service.MobileService;

public class TestService {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dao.xml","spring/spring-service.xml");
		
		MobileService service = context.getBean(MobileService.class);
		
		Mobile find = service.find("1300000");
		
		System.out.println(find);
	}

}
