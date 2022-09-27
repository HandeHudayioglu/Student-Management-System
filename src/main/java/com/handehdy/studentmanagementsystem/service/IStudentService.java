package com.handehdy.studentmanagementsystem.service;

import com.handehdy.studentmanagementsystem.entity.Student;

import java.util.List;

public interface IStudentService {

    List<Student>getAllStudents();
    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
