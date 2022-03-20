package com.jwtProject.repository;

import com.jwtProject.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<User, Long>{
	User findByUserName(String userName);
}
