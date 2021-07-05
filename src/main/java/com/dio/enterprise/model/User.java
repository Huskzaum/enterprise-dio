package com.dio.enterprise.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="user_dio")
public class User {
    @Id
    private Long id;
    @ManyToOne
    private UserCategory userCategory;
    private String username;
    @ManyToOne
    private Enterprise enterprise;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private WorkPeriod workPeriod;
    private BigDecimal tolerance;
    private LocalDateTime startPeriod;
    private LocalDateTime finishPeriod;
}
