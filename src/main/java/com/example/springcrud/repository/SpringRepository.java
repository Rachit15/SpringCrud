package com.example.springcrud.repository;

import com.example.springcrud.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  interface SpringRepository extends CrudRepository<Student,Integer> {

    @Query(value = "select s from Student s where s.branch=?1 ")
List<Student> findStudentsByBranch(String branch);




}
