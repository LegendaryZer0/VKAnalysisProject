package ru.vk.vkanalysisproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VKController {

    @GetMapping("/shadow-pages/{user_id}")
    @PreAuthorize("@rights.hasAccessToFeature(#userId,\"FIND_SHADOW_PAGES\")")
    public ResponseEntity<?> getShadowPages(@PathVariable("user_id") Long userId){
        //todo сервис вызова функции
        return ResponseEntity.ok("200");
    }
}
