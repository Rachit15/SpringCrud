package com.example.springcrud.repository;

import com.example.springcrud.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface SpringRepository extends CrudRepository<Student,Integer> {


}
