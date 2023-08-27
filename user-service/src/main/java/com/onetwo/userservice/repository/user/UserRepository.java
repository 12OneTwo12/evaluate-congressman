package com.onetwo.userservice.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetwo.userservice.entity.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, QUserRepository {
}
