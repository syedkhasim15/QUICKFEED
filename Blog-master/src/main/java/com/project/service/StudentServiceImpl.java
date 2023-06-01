package com.project.service;

import com.project.model.Image;
import com.project.repository.ImageRepository;
import com.project.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Image saveStudent(Image student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Image> getAllStudents() {
        return studentRepository.findAll();
    }
}
