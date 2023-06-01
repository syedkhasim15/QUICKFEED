package binod.suman.Spring_Boot_Project;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import binod.suman.Spring_Boot_Project.entity.Student;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RequestTest {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void homePageTest() throws Exception{
		System.out.println("** Port Number :"+port);
		String ret = restTemplate.getForObject("http://localhost:" + port +"/home", String.class);
		System.out.println("Return String :"+ret);
		assertThat(ret.contains("This is"));
		
		
		
	}
	
	@Test
	public void apiTest() throws Exception{
		Student student = restTemplate.getForObject("http://localhost:" + port+"/all/110", Student.class);
		System.out.println(student);
		assertThat(student.getCity().contains("Bangalore"));
		
	}

}
