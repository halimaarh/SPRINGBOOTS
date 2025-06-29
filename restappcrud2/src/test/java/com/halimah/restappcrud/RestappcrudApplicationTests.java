package com.halimah.restappcrud;

import com.halimah.restappcrud.entity.Student;
import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.awt.*;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class RestappcrudApplicationTests {

	//Using dependency injection to inject mock object
	@Autowired
	private MockMvc mockMvc;

	private static MockHttpServletRequest request;

	public static final MediaType APPLICATION_JSON_UTF8 = MediaType.APPLICATION_JSON;

	@BeforeAll
	public static void setup(){
		request = new MockHttpServletRequest();
	}

	@Test
	public void getAllStudents() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/students"))
				.andExpect(status().isOk())
				.andExpect((ResultMatcher) content().contentType(APPLICATION_JSON_UTF8))
				.andExpect((ResultMatcher) jsonPath("$", hasSize(4)));
	}

	@Test
	void contextLoads() {
	}

}
 //complete the code