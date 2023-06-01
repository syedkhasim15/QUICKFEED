package binod.suman.Spring_Boot_Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import binod.suman.Spring_Boot_Project.entity.Student;
import binod.suman.Spring_Boot_Project.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/home")
	public String home() {
		return "This is my home page";
	}
	
	//@Pathvariable // URL/search/110
	//RequestParam  // URL/search?roll=110 or use params of postman
	//RequestBody // URL/search and use Body of postman
	
	
	@RequestMapping(value="/search/{roll}",method = RequestMethod.GET)
	public String search(@PathVariable int roll) {
		if(roll == 110)
		 return "Student name is - Binod Suman :";
		else
		  return "Student name is - Bill Gates :";	
		
		
	}
	
	@RequestMapping(value="/find",method = RequestMethod.GET)
	public String find(@RequestParam(value="roll") int roll) {
		if(roll == 110)
		 return "Student name is - Binod Suman :";
		else
		  return "Student name is - Bill Gates :";	
	}
	
	@RequestMapping(value="/find",method = RequestMethod.POST)
	public String findByName(@RequestBody String name) {
		return "You have entered name :"+name;
	}

	@RequestMapping("/all")
	//@GetMapping(value="/all",produces=MediaType.APPLICATION_XML_VALUE)
	//@GetMapping(value="/all",produces=MediaType.TEXT_PLAIN_VALUE)
	/**
	 <dependency>
            <groupId>com.fasterxml.jackson.dataformat</groupId>
            <artifactId>jackson-dataformat-xml</artifactId>
        </dependency>
	 */
	
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
	@RequestMapping("/all/{roll}")
	public Student getStudent(@PathVariable int roll) {
		return studentService.getStudent(roll);
	}

	/*
	 * { "roll": 1110, "name": "Steve Jobs", "city": "USA" }
	 */
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@PostMapping("/bulkAdd")
	public String addStudents(@RequestBody List<Student> students) {
		return studentService.addStudents(students);
	}
	
	@DeleteMapping("/all/{roll}")
	public String deleteStudent(@PathVariable int roll) {
		return studentService.deleteStudent(roll);
	}
	
	@PutMapping("/add")
	public String updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	
}
