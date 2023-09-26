package com.example.springcrud.repository;

import com.example.springcrud.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public  interface SpringRepository extends MongoRepository<Student,Integer> {


}
