package ru.vk.vkanalysisproject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserSubscriptionDTO {
    private String subscriptionType;
    private Timestamp endDate;

}
