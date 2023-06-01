package binod.suman.Spring_Boot_Project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import binod.suman.Spring_Boot_Project.entity.Student;

public interface StudentDAO extends JpaRepository<Student, Integer>{
	
	

}
