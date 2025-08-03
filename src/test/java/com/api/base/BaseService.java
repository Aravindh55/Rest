package com.api.base;

import static io.restassured.RestAssured.*;

import com.api.filters.LoggingFilters;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;

public class BaseService {
	private static final String BASEURI = "https://petstore3.swagger.io";
	protected RequestSpecification requestSpecification;

	static {
		RestAssured.filters(new LoggingFilters());
	}
	public BaseService() {
		requestSpecification= given().baseUri(BASEURI);
	}

	public void setAuth(String token) {
		requestSpecification.header("Authorisation", token);
	}
	
	public Response putRequest(Object payload, String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).put(endpoint);
	}
}
