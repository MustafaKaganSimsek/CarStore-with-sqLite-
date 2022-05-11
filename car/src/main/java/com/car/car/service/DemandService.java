package com.car.car.service;

import com.car.car.dto.DemandAdminDto;
import com.car.car.dto.DemandDto;
import com.car.car.dto.mappers.DemandMapper;
import com.car.car.exception.EntityNotFoundException;
import com.car.car.model.Demand;
import com.car.car.repository.DemandReporsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemandService {

    private final DemandMapper mapper;
    private final CarService carService;
    private final DemandReporsitory demandReporsitory;

    public void setDemand(DemandAdminDto demandAdminDto) throws EntityNotFoundException{
        if(!carService.isPresent(demandAdminDto.getCar_id())){
            throw new EntityNotFoundException("Not Found The Car");
        }
        Demand demand = mapper.demandAdminDtoToDemand(demandAdminDto);
        demandReporsitory.save(demand);
    }

    public List<DemandDto> getDemand(){

        return mapper.demandToDemandDto(demandReporsitory.findAll());

    }
}
