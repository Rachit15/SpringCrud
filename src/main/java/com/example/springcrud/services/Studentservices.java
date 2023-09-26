package com.example.springcrud.services;

import com.example.springcrud.model.Student;
import com.example.springcrud.repository.SpringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Studentservices {
    @Autowired
    private SpringRepository springRepository;
    public List<Student> getStudents()
    {
        return (List<Student>)springRepository.findAll();

    }

    public void addStudent(Student s){
        springRepository.save(s);
    }
    public void updateStudent(Student s)
    {
       Optional<Student> s1=springRepository.findById(s.getId());
       if(s1.isPresent())
       {
           Student student=s1.get();
           student.setBranch(s.getBranch());
           springRepository.save(student);

       }

    }
    public void deleteStudent(int id)
    {
        Optional<Student> s1=springRepository.findById(id);
        if(s1.isPresent())
        {
            Student student=s1.get();
            springRepository.delete(student);
        }
    }
}
