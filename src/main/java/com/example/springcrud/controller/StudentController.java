package com.example.springcrud.controller;

import com.example.springcrud.model.Student;
import com.example.springcrud.services.Studentservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/addstudent")
    public String addStudent(@RequestBody Student stu){
        s.addStudent(stu);
        System.out.println("Student added successfully");
        return "Student added successfully";
    }
    @PutMapping("/updatestudent")
    public String updateStudent(@RequestBody Student st)
    {
        s.updateStudent(st);
        return "Updated Successfully";
    }
}
