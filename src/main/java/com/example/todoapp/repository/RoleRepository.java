package com.example.todoapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.todoapp.models.ERole;
import com.example.todoapp.models.Role;


public interface RoleRepository extends MongoRepository <Role, String>{
	 Optional<Role> findByName(ERole name);
}
