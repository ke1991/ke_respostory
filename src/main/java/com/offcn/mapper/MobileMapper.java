package com.offcn.mapper;

import com.offcn.pojo.Mobile;

public interface MobileMapper {
	
	public void save(Mobile mobile);
	
	public Mobile find(String MobileNumber);
	
}
