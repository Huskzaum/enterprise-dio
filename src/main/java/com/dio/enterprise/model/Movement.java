package com.dio.enterprise.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class MovementId implements Serializable {
        private Long movementId;
        private Long userId;
    }

    @EmbeddedId
    private MovementId id;
    private LocalDateTime entryDate;
    private LocalDateTime exitDate;
    private BigDecimal period;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private Calender calender;
}
