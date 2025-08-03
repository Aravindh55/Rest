package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilters implements Filter {

	private static final Logger logger = LogManager.getLogger(LoggingFilters.class);

	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		logRequest(requestSpec);
		Response response = ctx.next(requestSpec, responseSpec);
		logResponse(response);
		return response;
	}

	public void logRequest(FilterableRequestSpecification requestSpec) {
		logger.info("BaseUri :" + requestSpec.getBaseUri());
		logger.info("Headers :" + requestSpec.getHeaders());
		logger.info("Request body : " + requestSpec.getBody());
	}

	public void logResponse(Response response) {
		logger.info("status code :" + response.statusCode());
		logger.info("Headers :" + response.getHeaders());
		logger.info("response body : " + response.getBody().asPrettyString());
	}

}
