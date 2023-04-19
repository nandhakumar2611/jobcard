package com.example.jobcard.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jobcard.model.Role;

/**
 * Repository for the {@link Role} JPA entity. Any custom methods, not already
 * defined in {@link JpaRepository}, are to be defined here.
 * 
 * @author Nandha Kumar
 * @version 1.0
 * @since April 2023
 * 
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	/**
	 * @param role
	 * @return @role
	 */
	Optional<Role> findByRole(String role);

}
