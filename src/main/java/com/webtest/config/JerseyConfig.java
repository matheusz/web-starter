package com.webtest.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@ApplicationPath("/jersey")
public class JerseyConfig extends ResourceConfig {

	private boolean recursiveScanning = true;
	
	public JerseyConfig () {
		packages(recursiveScanning, "com.webtest");
	}
	
}
