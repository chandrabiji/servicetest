package com.sudaksha.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/calc")
public class Calculation {
	@GET
	@Path("/add/{i}/{j}")
	public String add(@PathParam("i")int i, @PathParam("j")int j)
	{
		return (i+j)+"";
	}
	@GET
	@Path("/sub/{i}/{j}")
	public String sub(@PathParam("i")int i, @PathParam("j")int j)
	{
		return (i-j)+"";
	}

}
