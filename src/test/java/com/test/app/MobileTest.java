package com.test.app;

import org.springframework.web.client.RestTemplate;

import com.offcn.pojo.Mobile;

public class MobileTest {

	public static void main(String[] args) {
		
		RestTemplate template = new RestTemplate();
		
		Mobile mobile = template.getForObject("http://localhost/web-homework05/service/v1/mobilefind/find/13353718353", Mobile.class);
		
		System.out.println(mobile);
	}

}
