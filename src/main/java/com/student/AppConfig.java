package com.student;

import com.student.controller.StudentController;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("studentService")
    public StudentService studentService(){
        System.out.println("AppConfig create bean studentService");
        return new StudentServiceImpl();
    }

//    @Bean("studentController")
//    public StudentController studentController(){
//        System.out.println("AppConfig create bean studentController");
//        return new StudentController();
//    }
}
