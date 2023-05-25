package com.security.securitysystem.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRegistrationDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
