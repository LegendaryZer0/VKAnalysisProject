package ru.vk.vkanalysisproject.security;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.vk.vkanalysisproject.service.UserService;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Component(value = "rights")
@RequiredArgsConstructor
public class Rights {
    private final UserService userService;


    @Transactional //Todo rename
    public boolean hasAccessToService(Long userId) {
        return  true;//Todo найти подпису, если нашли, вернём true
    }



}
