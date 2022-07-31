package com.student.service;

import com.student.entity.StudentEntity;
import com.student.repository.StudentRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import java.util.Collection;
import java.util.Optional;

public class StudentServiceImpl implements StudentService{

    @Inject
    private StudentRepository studentRepository;

    @PostConstruct
    void init(){
        System.out.println("A bean is born: " + this.getClass().getName());
    }

    @PreDestroy
    void destroy(){
        System.out.println("A bean is passed away: " + this.getClass().getName());
    }

    @Override
    public Optional<StudentEntity> get(long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Collection<StudentEntity> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Collection<StudentEntity> getStudentsByDepartment(String department) {
        return studentRepository.findByDepartment(department);
    }
}
