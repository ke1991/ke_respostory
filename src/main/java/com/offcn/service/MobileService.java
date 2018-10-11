package com.offcn.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.offcn.pojo.Mobile;

public interface MobileService {

	@GET
	@Path("/find/{MobileNumber}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Mobile find(@PathParam("MobileNumber") String MobileNumber);

}
