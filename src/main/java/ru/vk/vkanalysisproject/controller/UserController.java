package ru.vk.vkanalysisproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vk.vkanalysisproject.model.dto.UserRegistrationCDTO;
import ru.vk.vkanalysisproject.model.dto.UserSubscriptionDTO;
import ru.vk.vkanalysisproject.service.UserService;

import javax.annotation.security.PermitAll;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    @PermitAll
    public ResponseEntity<?> saveUser(@RequestBody UserRegistrationCDTO registrationCDTO){
        return ResponseEntity.ok(userService.saveUser(registrationCDTO));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> addUserSubscription(@RequestParam Long userId, @RequestBody UserSubscriptionDTO userSubscriptionDTO){

    }
}
