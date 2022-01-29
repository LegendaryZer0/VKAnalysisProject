package ru.vk.vkanalysisproject.service;

import ru.vk.vkanalysisproject.model.entity.User;

public interface UserService {
    public void saveUser();
    public User findOrThrow();
}
