package ru.vk.vkanalysisproject.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp subscriptionStartDate;
    private Timestamp subscriptionEndDate;
    @Enumerated(EnumType.STRING)
    private Type type;

    @ManyToOne(cascade = {CascadeType.ALL}, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public enum Type{ //Todo правильно наименовать
        FIND_MESSGES_BY_MAKET,ANALYS_FRIENDS_TOWNS,FIND_SHADOW_PAGES
    }
}
