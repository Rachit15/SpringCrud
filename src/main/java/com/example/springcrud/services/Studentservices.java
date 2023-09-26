package com.example.springcrud.services;

import com.example.springcrud.model.Student;
import com.example.springcrud.repository.SpringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentservices {
    @Autowired
    private SpringRepository springRepository;
    public List<Student> getStudents()
    {
        return (List<Student>)springRepository.findAll();

    }
}
