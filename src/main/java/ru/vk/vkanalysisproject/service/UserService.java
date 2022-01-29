package ru.vk.vkanalysisproject.service;

import ru.vk.vkanalysisproject.model.dto.UserRegistrationCDTO;
import ru.vk.vkanalysisproject.model.dto.UserSubscriptionDTO;
import ru.vk.vkanalysisproject.model.entity.User;

public interface UserService {
    public User saveUser(UserRegistrationCDTO registrationCDTO);
    public User findOrThrow(Long userId);
    public User addSubscription(Long userId,UserSubscriptionDTO userSubscriptionDTO);
}
