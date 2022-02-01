package ru.vk.vkanalysisproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vk.vkanalysisproject.model.dto.UserRegistrationCDTO;
import ru.vk.vkanalysisproject.model.dto.UserSubscriptionDTO;
import ru.vk.vkanalysisproject.service.UserService;

import javax.annotation.security.PermitAll;

@RequestMapping("/user-management")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @PermitAll
    public ResponseEntity<?> saveUser(@RequestBody UserRegistrationCDTO registrationCDTO){
        return ResponseEntity.ok(userService.saveUser(registrationCDTO));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> addUserSubscription(@RequestParam Long userId, @RequestBody UserSubscriptionDTO userSubscriptionDTO){
        return ResponseEntity.ok(userService.addSubscription(userId,userSubscriptionDTO));
    }
}
