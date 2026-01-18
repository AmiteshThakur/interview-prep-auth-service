package com.intrviewPrep.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intrviewPrep.authservice.entity.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

Optional<UserEntity> findByUserMobileNumber(String userMobileNumber);

}
