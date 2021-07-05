package com.dio.enterprise.service;

import com.dio.enterprise.model.WorkPeriod;
import com.dio.enterprise.repository.WorkPeriodRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class WorkPeriodService {

    private final WorkPeriodRepository workPeriodRepository;

    public WorkPeriodService(WorkPeriodRepository workPeriodRepository) {
        this.workPeriodRepository = workPeriodRepository;
    }

    public WorkPeriod saveWorkPeriod(WorkPeriod workPeriod) {
        return workPeriodRepository.save(workPeriod);
    }

    public List<WorkPeriod> findAll() {
        return workPeriodRepository.findAll();
    }

    public Optional<WorkPeriod> getById(Long periodId) {
        return workPeriodRepository.findById(periodId);
    }

    public WorkPeriod updateWorkPeriod(WorkPeriod workPeriod) {
        return workPeriodRepository.save(workPeriod);
    }

    public void deleteWorkPeriod(Long periodId) throws NoSuchElementException {
        Optional<WorkPeriod> workPeriod = getById(periodId);
        if (workPeriod.isPresent()) {
            workPeriodRepository.deleteById(periodId);
        } else {
            throw new NoSuchElementException("The work period with id '" + periodId + "' hasn't found!");
        }
    }

}
