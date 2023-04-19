package com.example.jobcard.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jobcard.model.User;


/**
 * Repository for the {@link User} JPA entity. Any custom methods, not already
 * defined in {@link JpaRepository}, are to be defined here.
 * 
 * @author Nandha Kumar
 * @version 1.0
 * @since April 2023
 * 
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	/**
	 * @param username
	 * @return @User
	 */
	Optional<User> findByUsername(String username);
	
	/**
	 * @param username
	 * @return true if a user with the given username exists in the database, false otherwise
	 */
	Boolean existsByUsername(String username);
	
	/**
	 * @param email
	 * @return true if a user with the given email exists in the database, false otherwise
	 */
	Boolean existsByEmail(String email);

}
