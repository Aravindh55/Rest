package com.api.services;

import com.api.base.BaseService;
import com.api.request.models.UpdatePetRequest;

import io.restassured.response.Response;

public class PetService extends BaseService{
 
	private static final String BASEPATH = "/api/v3/pet";
	public Response updateanExisitingPet(UpdatePetRequest payload) {
		
        return putRequest(payload, BASEPATH);
	}
}
