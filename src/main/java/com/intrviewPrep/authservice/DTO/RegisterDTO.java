package com.intrviewPrep.authservice.DTO;

import lombok.*;

@AllArgsConstructor 
@NoArgsConstructor
@Getter @Setter
@Data
 public class RegisterDTO {
    
    private String username;
    private String userEmail;
    private String userPassword;
    private String userRole;
    private String userMobileNumber;

}
