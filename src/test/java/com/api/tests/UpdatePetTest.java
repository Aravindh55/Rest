package com.api.tests;

import java.util.ArrayList;

import java.util.List;
import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.models.response.UpdatePetResponse;
import com.api.request.models.UpdatePetRequest;
import com.api.request.models.UpdatePetRequest.tags;
import com.api.services.PetService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;

@Listeners(com.api.listeners.Listeners.class)
public class UpdatePetTest {

	@Test
	public void run_test() throws JsonProcessingException {
		PetService pet = new PetService();

		UpdatePetRequest.category category = new UpdatePetRequest.category(1, "dogs");
		List<UpdatePetRequest.tags> tags = new ArrayList<UpdatePetRequest.tags>();
		tags.add(new UpdatePetRequest.tags(0, "favorite"));
		List<String> list = new ArrayList<String>();
		list.add("testmage");
		UpdatePetRequest request = new UpdatePetRequest(10, "doggie", category, list, tags, "available");


		Response response = pet.updateanExisitingPet(request);
		
		UpdatePetResponse res = response.as(UpdatePetResponse.class);
		Assert.assertEquals(res.getId(), 10);
		

		

	}
}
