package com.car.car.dto.mappers;

import com.car.car.dto.DemandAdminDto;
import com.car.car.dto.DemandDto;
import com.car.car.model.Demand;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DemandMapper {

    Demand demandDtoToDemand(DemandDto demandDto);
    DemandDto demandToDemandDto(Demand demand);
    List<DemandDto> demandToDemandDto(List<Demand> demands);

    Demand demandAdminDtoToDemand(DemandAdminDto demandAdminDto);
    DemandAdminDto demandToDemandAdminDto(Demand demand);


}
