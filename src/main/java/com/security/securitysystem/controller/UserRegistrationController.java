package com.security.securitysystem.controller;

import com.security.securitysystem.dto.UserRegistrationDTO;
import com.security.securitysystem.service.UserService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    @Autowired
    private UserService userService;

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDTO registrationDTO){
        userService.save(registrationDTO);
        return "redirect:/registration?success";
    }

    @GetMapping
    public String showRegForm(){

        return "registration";
    }

    @ModelAttribute("user")  // return dto
    public UserRegistrationDTO userRegistrationDTO()
    {

        return new UserRegistrationDTO();
    }


}
