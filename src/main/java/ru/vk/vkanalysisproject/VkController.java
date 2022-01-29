package ru.vk.vkanalysisproject;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vk.vkanalysisproject.service.VkServiceImpl;

@RestController
public class VkController {
    @Autowired
    VkServiceImpl vkService;

    @SneakyThrows
    @GetMapping("/callbackVk")
    public void check(){
        vkService.getToken();
    }
}
