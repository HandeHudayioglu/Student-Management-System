package com.handehdy.studentmanagementsystem.service.impl;

import com.handehdy.studentmanagementsystem.entity.Student;
import com.handehdy.studentmanagementsystem.repository.IStudentRepository;
import com.handehdy.studentmanagementsystem.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService {

    private IStudentRepository studentRepository;

    public StudentServiceImpl(IStudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
         studentRepository.deleteById(id);
    }
}
