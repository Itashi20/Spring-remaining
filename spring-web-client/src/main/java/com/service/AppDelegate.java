package com.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppDelegate {
RestTemplate template=new RestTemplate();


public String loadEmp() {
	String data=template.exchange("http://localhost:8090/users/loadusers",
			HttpMethod.GET,
			null,
			new ParameterizedTypeReference<String>() {
			}).getBody();
	return data;
}


public String loadEmp2() {
	String data=template.exchange("http://localhost:8080/mainapp1/loadAll",
			HttpMethod.GET,
			null,
			new ParameterizedTypeReference<String>() {
			}).getBody();
	return data;
}
}
