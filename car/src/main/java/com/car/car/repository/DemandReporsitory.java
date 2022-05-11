package com.car.car.repository;

import com.car.car.model.Demand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandReporsitory extends JpaRepository<Demand,Integer> {
}
