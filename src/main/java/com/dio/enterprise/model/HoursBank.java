package com.dio.enterprise.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HoursBank {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class HoursBankId implements Serializable {
        private Long hoursBankId;
        private Long movementId;
        private Long userId;
    }

    @EmbeddedId
    private HoursBankId id;
    private LocalDateTime workedDate;
    private BigDecimal countWorkedHours;
    private BigDecimal balanceWorkedHours;
}
