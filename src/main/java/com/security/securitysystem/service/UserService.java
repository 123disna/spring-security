package com.security.securitysystem.service;

import com.security.securitysystem.dto.UserRegistrationDTO;
import com.security.securitysystem.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDTO registrationDTO);
}
