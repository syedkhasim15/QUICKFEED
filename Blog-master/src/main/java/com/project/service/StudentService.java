package com.project.service;

import com.project.model.Image;

import java.util.List;

public interface StudentService {
    public Image saveStudent(Image student);
    public List<Image> getAllStudents();
}
