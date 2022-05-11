package com.car.car.controller;

import com.car.car.dto.DemandAdminDto;
import com.car.car.dto.DemandDto;
import com.car.car.exception.EntityNotFoundException;
import com.car.car.service.DemandService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demand")
@AllArgsConstructor
public class DemandController {

    private final DemandService demandService;

    @PostMapping("/form")
    public ResponseEntity<DemandAdminDto> setDemand(@RequestBody DemandAdminDto demandAdminDto) throws EntityNotFoundException {

        demandService.setDemand(demandAdminDto);
        return ResponseEntity.ok(demandAdminDto) ;
    }

    @GetMapping("/table")
    public ResponseEntity<List<DemandDto>> getDemand(){
        return ResponseEntity.ok(demandService.getDemand());

    }
}
