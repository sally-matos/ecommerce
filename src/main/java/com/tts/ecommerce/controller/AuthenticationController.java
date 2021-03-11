package com.tts.ecommerce.controller;

import com.tts.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.validation.Valid;
import java.security.AuthProvider;

@Controller
public class AuthenticationController {
    @Autowired
    private UserService userService;
    private User user;

    @GetMapping("/signin")
    public String login(){
        return "signin";

        @PostMapping("/signin")
                public String signup(@Valid User user;
        user,
        @RequestParam String submit,
                BindingResult bindingResult,
        HttpServiceRquest AuthProvider request;
        request) throws ServletException {
            String password = user.getPassword();
            if(submit.equals("up ")) {
                if(userService.findByUsername(user.getUsername()) == null) {
                    userService.saveNew(user);
                }else{
                    bindingResult.rejectValue("username", "error.user", "Username is already taken.");
                    return "signin";
                }
            }
            request.login(user.getUsername(), password);
            return "redirect:/";
        }
    }
}

//this page is wrong