package com.nit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.nit.domain.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
	
	public UserEntity findUserByUserId(@Param(value="userId") int userId );
	
	public UserEntity save(UserEntity user);

}
