package binod.suman.Spring_Boot_Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import binod.suman.Spring_Boot_Project.dao.StudentDAO;
import binod.suman.Spring_Boot_Project.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDAO dao;
	
	public List<Student> getStudents(){
		return dao.findAll();
	}
	
	public Student getStudent(int roll) {
		return dao.findById(roll).get();
	}
	
	public String addStudent(Student student) {
		dao.save(student);
		return "New Student has been added to Database, whose roll number :"+student.getRoll();
	}
	
	public String addStudents(List<Student> students) {
		dao.saveAll(students);
		return "All Student has been added to Database";
	}
	
	public String deleteStudent(int roll) {
		Student student = dao.getById(roll);
		dao.delete(student);
		return "Roll Number is deleted :"+roll;
	}
	
	public String updateStudent(Student student) {
		dao.save(student);
		return "Roll Number is update :"+student.getRoll();
	}
	

}
