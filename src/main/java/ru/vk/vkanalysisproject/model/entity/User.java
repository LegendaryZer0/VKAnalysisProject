package ru.vk.vkanalysisproject.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.vk.vkanalysisproject.model.dto.UserRegistrationCDTO;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String hashPassword;
    private String phone;
    private String name;
    private String surName;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<Subscription> subscriptions;




    public static User from(UserRegistrationCDTO userRegistrationCDTO){
        return User.builder().build();
    }

}
