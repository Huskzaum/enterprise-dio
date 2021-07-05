package com.dio.enterprise.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Calender {
    @Id
    private Long id;
    @ManyToOne
    private DateType dateType;
    private String description;
    private LocalDateTime specialDate;
}
