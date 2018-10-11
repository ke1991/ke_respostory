package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.pojo.Mobile;
import com.offcn.service.MobileService;

@Controller
public class MobileController {
	
	@Autowired
	private MobileService mobileService;

	@RequestMapping("find")
	public String find(String MobileNumber, Model model) {

		String msg = "";
		
		Mobile mobile = mobileService.find(MobileNumber);

		if (mobile != null) {

			msg = "手机号码:" + MobileNumber +" "+ "归属地是:" + mobile.getMobileArea() +" "+ "号码类型是:" + mobile.getMobileType();
		}

		model.addAttribute("msg", msg);

		return "mobile";
	}

}
