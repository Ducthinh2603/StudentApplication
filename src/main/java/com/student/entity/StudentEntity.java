package com.student.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "STUDENT")
public class StudentEntity {

    @PostConstruct
    void init(){
        System.out.println("An entity bean is born: " + this.getClass().getName());
    }

    @PreDestroy
    void destroy(){
        System.out.println("An entity bean is passed away: " + this.getClass().getName());
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENTID", nullable = false)
    private Long id;

    @Column(name = "FIRSTNAME", nullable = false)
    private String firstName;

    @Column(name = "LASTNAME", nullable = false)
    private String lastName;

    @Column(name = "DEPARTMENT", nullable = false)
    private String department;

    @Column(name = "FEES")
    private Double fees;

//    @JsonManagedReference
//    @OneToMany(mappedBy = "studentEntity", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Collection<Course> courses = new ArrayList<>();

    public StudentEntity() {}

    public StudentEntity(Long id, String firstName, String lastName, Double fees, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fees = fees;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

//    public Collection<Course> getCourses() {
//        return courses;
//    }
//
//    public void add (Course course) {courses.add(course);}
}
