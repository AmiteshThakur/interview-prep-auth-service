package com.intrviewPrep.authservice.serviceImpl;

import com.intrviewPrep.authservice.DTO.RegisterDTO;
import com.intrviewPrep.authservice.entity.UserEntity;
import com.intrviewPrep.authservice.exception.UserAlreadyExistsException;
import com.intrviewPrep.authservice.mapper.UserRegistrationMapper;
import com.intrviewPrep.authservice.repository.UserRepository;
import com.intrviewPrep.authservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    public void register(RegisterDTO registerDTO) {
        UserEntity user = UserRegistrationMapper.mapToUserEntity(registerDTO, new UserEntity());
        Optional<UserEntity> userEntityOptional = userRepository.findByUserMobileNumber(registerDTO.getUserMobileNumber());
        if (userEntityOptional.isPresent()) {
            throw new UserAlreadyExistsException("User already registered with given mobile number "+ registerDTO.getUserMobileNumber());
        }
        UserEntity savedUser = userRepository.save(user);

    }

}
