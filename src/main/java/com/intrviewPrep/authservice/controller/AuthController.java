package com.intrviewPrep.authservice.controller;

import com.intrviewPrep.authservice.DTO.ResponseDTO;
import com.intrviewPrep.authservice.constants.RegistrationConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.intrviewPrep.authservice.DTO.RegisterDTO;
import com.intrviewPrep.authservice.service.UserService;

// @author Amitesh Thakur

@RestController
@RequestMapping(path="/auth",  produces={ MediaType.APPLICATION_JSON_VALUE} )
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<ResponseDTO> register(@RequestBody RegisterDTO registerDTO){
      userService.register(registerDTO);

      return ResponseEntity.
              status(HttpStatus.CREATED)
              .body(new ResponseDTO
                      (RegistrationConstants.STATUS_201,
                              RegistrationConstants.MESSAGE_201));
    }




}
