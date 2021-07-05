package com.dio.enterprise.repository;

import com.dio.enterprise.model.WorkPeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkPeriodRepository extends JpaRepository<WorkPeriod, Long> {
}
