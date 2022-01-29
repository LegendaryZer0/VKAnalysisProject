package ru.vk.vkanalysisproject.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.vk.vkanalysisproject.exception.ErrorType;
import ru.vk.vkanalysisproject.exception.Exc;
import ru.vk.vkanalysisproject.model.dto.UserRegistrationCDTO;
import ru.vk.vkanalysisproject.model.dto.UserSubscriptionDTO;
import ru.vk.vkanalysisproject.model.entity.Subscription;
import ru.vk.vkanalysisproject.model.entity.User;
import ru.vk.vkanalysisproject.repository.UserRepository;

import java.sql.Timestamp;
import java.time.Instant;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(UserRegistrationCDTO registrationCDTO) {
        return userRepository.save(
                User.builder()
                        .hashPassword(passwordEncoder.encode(registrationCDTO.getPassword()))
                        .login(registrationCDTO.getLogin())
                        .build());
    }

    @Override
    public User findOrThrow(Long userId) {
        return userRepository
                .findById(userId)
                .orElseThrow(Exc.sup(ErrorType.ENTITY_NOT_FOUND,"Сущность пользователя не найдена"));
    }

    @Override
    public User addSubscription(Long userId,UserSubscriptionDTO userSubscriptionDTO) {
        findOrThrow(userId).getSubscriptions()
                .add(Subscription
                        .builder()
                        .subscriptionStartDate(Timestamp.from(Instant.now()))
                        .
                        .build())
    }
}
