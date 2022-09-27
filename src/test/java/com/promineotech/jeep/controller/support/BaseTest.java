package com.promineotech.jeep.controller.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import lombok.Getter;



public class BaseTest {
	@LocalServerPort
	protected int serverPort;
	
	@Autowired
	@Getter
	public TestRestTemplate restTemplate; 
	
	protected String getBaseUri() {
		return String.format("http://localhost:%d/jeeps", serverPort);
	}
}
//String uri = 
//String.format("http://localhost:%d/jeeps?model=%s&trim=%s", serverPort, model, trim);