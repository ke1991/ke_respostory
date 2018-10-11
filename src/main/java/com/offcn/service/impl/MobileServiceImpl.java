package com.offcn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.offcn.mapper.MobileMapper;
import com.offcn.pojo.Mobile;
import com.offcn.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileMapper mobileMapper;
	
	@Override
	public Mobile find(String MobileNumber) {

		return mobileMapper.find(MobileNumber.length()>7? MobileNumber.substring(0, 7) :MobileNumber);
		 
	}

}
