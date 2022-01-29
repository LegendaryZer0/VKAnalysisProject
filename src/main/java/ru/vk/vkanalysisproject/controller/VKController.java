package ru.vk.vkanalysisproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VKController {

    @GetMapping("/shadow-pages")
    @PreAuthorize("@rights.hasAccessToService(#userId)")
    public ResponseEntity<?> getShadowPages(Long userId){

    }
}
