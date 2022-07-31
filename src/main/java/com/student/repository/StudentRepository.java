package com.student.repository;

import com.student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    Collection<StudentEntity> findByDepartment(String department);

//    @Query("SELECT student FROM Student student where student.fees = :fees")
//    Collection<StudentEntity> getByFees(@Param("fees") Double fees);
}