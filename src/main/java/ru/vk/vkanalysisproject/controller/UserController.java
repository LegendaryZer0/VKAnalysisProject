package ru.vk.vkanalysisproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

@RestController
public class UserController {



    @GetMapping
    @PermitAll
    public String saveUser(){

    }
}
