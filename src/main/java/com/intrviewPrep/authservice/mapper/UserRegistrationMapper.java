package com.intrviewPrep.authservice.mapper;

import com.intrviewPrep.authservice.DTO.RegisterDTO;
import com.intrviewPrep.authservice.entity.UserEntity;

public class UserRegistrationMapper {

    public static RegisterDTO mapToRegisterDTO(UserEntity userEntity, RegisterDTO registerDTO) {
        registerDTO.setUsername(userEntity.getUserName());
        registerDTO.setUserEmail(userEntity.getUserEmail());
        registerDTO.setUserRole(userEntity.getUserRole());
        registerDTO.setUserPassword(userEntity.getUserPassword());
        registerDTO.setUserMobileNumber(userEntity.getUserMobileNumber());

        return registerDTO;
    }

    public static UserEntity mapToUserEntity(RegisterDTO registerDTO, UserEntity userEntity) {
        userEntity.setUserEmail(registerDTO.getUserEmail());
        userEntity.setUserName(registerDTO.getUsername());
        userEntity.setUserPassword(registerDTO.getUserPassword());
        userEntity.setUserMobileNumber(registerDTO.getUserMobileNumber());
        userEntity.setUserRole(registerDTO.getUserRole());
        return userEntity;
    }

}