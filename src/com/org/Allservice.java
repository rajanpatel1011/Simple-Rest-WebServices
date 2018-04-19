package com.org;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("root")
public class Allservice {

	@Path("getEmp")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String getTheXMLContent() {
		return "<emp><name>rahul</name><age>23</age></emp>";
	}
	
	@Path("getStrings")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getText() {
		return "Hello Plain text";
	}
}
