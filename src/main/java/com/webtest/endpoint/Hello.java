package com.webtest.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.webtest.output.GreetingsOutput;

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public GreetingsOutput greetings(@QueryParam(value="personName") String name) {
		String greetings = "Hello, " + name + "!!"; 
		GreetingsOutput output = new GreetingsOutput();
		output.setGreetingsMessage(greetings);
		return output;
	}
	
}
