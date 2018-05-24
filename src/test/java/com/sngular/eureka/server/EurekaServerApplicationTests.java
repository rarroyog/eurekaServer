package com.sngular.eureka.server;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author Raul Arroyo
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EurekaServerApplication.class)
@WebAppConfiguration
@ActiveProfiles("native") // "native" means use local classpath location rather than GitHub.
public class EurekaServerApplicationTests {

	@Autowired
	WebApplicationContext spring;
	MockMvc mockMvc;

	/**
	 * 
	 */
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(spring).build();
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void eurekaStartupTest() throws Exception {

		// For a simple test, we will just ensure that the application starts, and that
		// the main web page can display.
		mockMvc.perform(get("/")).andExpect(status().isOk()).andReturn();

	}
}
