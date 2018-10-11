package com.test.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.mapper.MobileMapper;
import com.offcn.pojo.Mobile;

public class TestMapper {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
		MobileMapper mapper = context.getBean(MobileMapper.class);
	/*	Mobile mobile =  new Mobile();
		mobile.setMobileNumber("1300000");
		mobile.setMobileArea("山东 济南");
		mobile.setMobileType("中国联通GSM");
		mobile.setAreaCode("0531");
		mobile.setPostCode("250000");
		mapper.save(mobile );*/
		
		Mobile find = mapper.find("1300000");
		
		System.out.println(find);

		/*String[] strings = context.getBeanDefinitionNames();
		for (String string : strings) {
			
			System.out.println(string);
			
		}*/
		
	}

}
