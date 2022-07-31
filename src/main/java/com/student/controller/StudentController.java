package com.student.controller;

import com.student.entity.StudentEntity;
import com.student.service.StudentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Inject
    private StudentService studentService;

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentEntity get(@PathVariable("id") long id){
        Optional<StudentEntity> optional = studentService.get(id);
        return optional.orElseGet(StudentEntity::new);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<StudentEntity> getAllStudent() {
        return studentService.getAllStudent();
    }
}
