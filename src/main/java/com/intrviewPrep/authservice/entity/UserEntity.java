package com.intrviewPrep.authservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  
  @Column(nullable = false)
  private String userName;

  @Column(nullable = false)
  private String userEmail;

  private String userPassword;

  @Column(nullable = false)
  private String userRole;

  private boolean isActive = true;

  @Column(nullable = false)
  private String userMobileNumber;

  @Column(nullable = false)
  private String userSecurityRole;
}
