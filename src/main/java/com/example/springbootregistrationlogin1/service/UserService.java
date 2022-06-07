package com.example.springbootregistrationlogin1.service;

import com.example.springbootregistrationlogin1.model.User;
import com.example.springbootregistrationlogin1.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}