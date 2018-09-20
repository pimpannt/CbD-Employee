package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.User;

//CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}