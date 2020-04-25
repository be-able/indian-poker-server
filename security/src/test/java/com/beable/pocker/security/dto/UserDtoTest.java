package com.beable.pocker.security.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

public class UserDtoTest {
	
	
	@Test
	public void testCreateUserDto() {
		
		UserDto userDto = UserDto.builder()
				.email("hyobin.roh@formalworks.com")
				.id(3L)
				.build();
		
		String json = new Gson().toJson(userDto);
		
		System.out.println(json);
		
		String jsonDummy = "{\"id\":3}";
		
		UserDto dummyDto = new Gson().fromJson(jsonDummy, UserDto.class);
		
		System.out.println(dummyDto.getId());
		System.out.println(dummyDto.getEmail());
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			UserDto jsonString = mapper.readValue(jsonDummy, UserDto.class);
			
			System.out.println(jsonString.getId());
			System.out.println(jsonString.getEmail());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
	}
}