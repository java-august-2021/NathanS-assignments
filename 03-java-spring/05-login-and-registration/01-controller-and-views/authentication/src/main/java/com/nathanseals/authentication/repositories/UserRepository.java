package com.nathanseals.authentication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nathanseals.authentication.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);
}
