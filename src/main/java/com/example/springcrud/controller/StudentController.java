package com.example.springcrud.controller;

import com.example.springcrud.model.Student;
import com.example.springcrud.services.Studentservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController@RequestMapping("/api")
public class StudentController {
    @Autowired
    private Studentservices s;
    @GetMapping("/getStudents")
    public ResponseEntity<List<Student>> getList()
    {
        List<Student> s1=s.getStudents();
        if(s1.size()<=0)
        {
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(s1));

    }
    @PostMapping("/addstudent")
    public ResponseEntity<String> addStudent(@RequestBody Student stu){

        try {
            s.addStudent(stu);
            return ResponseEntity.ok("Student added successfully");
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }


    }
    @PutMapping("/updatestudent")
    public ResponseEntity<String> updateStudent(@RequestBody Student st)
    {

        try {
            s.updateStudent(st);
            return ResponseEntity.ok("Student updated Successfully");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @DeleteMapping("/deletestudent")
            public ResponseEntity<String> deleteStudent(@RequestBody Student st)

    {
        try {

            int id = st.getId();
            s.deleteStudent(id);
            return ResponseEntity.ok("Student Deleted Successfully");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @GetMapping("/getstudentsbybranch/{branch}")
    public ResponseEntity<List<Student>> getList(@PathVariable String branch)
    {
        List<Student> s1=s.getStudentsByBranch(branch);
        if(s1.size()<=0)
        {
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(s1));
    }
}
