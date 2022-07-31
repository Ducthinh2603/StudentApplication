package com.student.service;

import com.student.entity.StudentEntity;

import java.util.Collection;
import java.util.Optional;

public interface StudentService {

    Optional<StudentEntity> get(long id);

    Collection<StudentEntity> getAllStudent();

    Collection<StudentEntity> getStudentsByDepartment(String department);
}
