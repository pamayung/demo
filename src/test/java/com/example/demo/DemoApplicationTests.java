package com.example.demo;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext context;

	@Before
	private void setUp(){
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void saveBranch() throws Exception {
		JSONObject jsonRequest = new JSONObject();
		jsonRequest.put("name", "Wildhan");
		jsonRequest.put("timezone", "UTC+7h");

		JSONObject jsonObjectResponse = new JSONObject();
		jsonObjectResponse.put("id", "string");
		jsonObjectResponse.put("name", "Wildhan");
		jsonObjectResponse.put("level", 0);
		jsonObjectResponse.put("parentName", "string");
		jsonObjectResponse.put("timezone", "UTC+7h");
		jsonObjectResponse.put("ehomeId", "string");
		jsonObjectResponse.put("lastActive", 0);

		mockMvc.perform(
				post("/api/branch/save")
						.contentType(MediaType.APPLICATION_JSON_VALUE)
						.content(jsonRequest.toString()))
				.andExpect(status().isOk())
				.andExpect(content().string(jsonObjectResponse.toString()))
				.andReturn();
	}

}
