package br.com.truckpad.truckpad.MotoristaControllerTest;



import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MotoristaControllerTest {
		
	   @Autowired
	   public WebApplicationContext context;
		
		private MockMvc mvc;
		
		@Before
		public void setup() {
			this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
		}
		
		@Test
		public void testaRequisicao() throws Exception {
			String url = "/motoristas";
			this.mvc.perform(get(url))
			.andExpect(status().isOk())
			.andExpect(jsonPath("nome", equalTo("Marcos Roberto")));
			
		}
		
		@Test
		public void testaRequisicaoFalha() throws Exception {
			String url = "/motoristas";
			this.mvc.perform(get(url))
			.andExpect(status().isNotFound());
			
		}
	


}
