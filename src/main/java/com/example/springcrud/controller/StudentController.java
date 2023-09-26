package com.example.springcrud.controller;

import com.example.springcrud.model.Student;
import com.example.springcrud.services.Studentservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController@RequestMapping("/api")
public class StudentController {
    @Autowired
    private Studentservices s;
    @GetMapping("/getStudents")
    public List<Student> getList()
    {
        return s.getStudents();

    }



}
