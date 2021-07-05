package com.dio.enterprise.controller;

import com.dio.enterprise.model.WorkPeriod;
import com.dio.enterprise.service.WorkPeriodService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/period")
public class WorkPeriodController {

    private final WorkPeriodService workPeriodService;

    public WorkPeriodController(WorkPeriodService workPeriodService) {
        this.workPeriodService = workPeriodService;
    }

    @PostMapping
    public WorkPeriod createWorkPeriod(@RequestBody WorkPeriod workPeriod){
        return workPeriodService.saveWorkPeriod(workPeriod);
    }

    @GetMapping
    public List<WorkPeriod> getWorkPeriodList(){
        return workPeriodService.findAll();
    }

    @GetMapping("/{periodId}")
    public ResponseEntity<WorkPeriod> getWorkPeriodByID(@PathVariable("periodId") Long periodId) throws NoSuchElementException {
        return  ResponseEntity.ok(workPeriodService.getById(periodId)
                .orElseThrow(() -> new NoSuchElementException("The work period with id '" + periodId + "' hasn't found!")));
    }

    @PutMapping
    public WorkPeriod updateWorkPeriod(@RequestBody WorkPeriod workPeriod){
        return workPeriodService.updateWorkPeriod(workPeriod);
    }

    @DeleteMapping("/{periodId}")
    public ResponseEntity<?> deleteById(@PathVariable("periodId") Long periodId) {
        try {
            workPeriodService.deleteWorkPeriod(periodId);
            return ResponseEntity.ok("The work period with id '" + periodId + "' has deleted!");
        } catch (NoSuchElementException exception) {
            return ResponseEntity.badRequest().body(exception);
        }
    }

}
