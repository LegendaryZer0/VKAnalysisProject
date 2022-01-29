package ru.vk.vkanalysisproject.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.vk.vkanalysisproject.service.UserService;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
@Slf4j
@Component(value = "rights")
@RequiredArgsConstructor
public class Rights {
    private final UserService userService;
    @Transactional //Todo rename
    public boolean hasAccessToFeature(Long userId,String subscriptionType) {
        log.info("userId {} subscriptionType {}",userId,subscriptionType);
        //ищем подписку по типу
        userService.findOrThrow(userId)
                .getSubscriptions()
                .stream()
                .filter(sub->sub.getType().name().equals(subscriptionType))
                .findFirst()
                .isPresent();
        return  true;//Todo найти подпису, если нашли, вернём true
    }



}
