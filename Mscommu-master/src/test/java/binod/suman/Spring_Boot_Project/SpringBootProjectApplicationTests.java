package binod.suman.Spring_Boot_Project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import binod.suman.Spring_Boot_Project.controller.StudentController;

@SpringBootTest
class SpringBootProjectApplicationTests {

	@Autowired
	private StudentController studentController;
	
	@Test
	void contextLoads() {
		assertThat(studentController).isNotNull();
	}

}
