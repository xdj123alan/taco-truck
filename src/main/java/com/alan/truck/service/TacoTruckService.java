package com.alan.truck.service;

import com.alan.truck.entity.TacoTruckEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TacoTruckService {

    Page<TacoTruckEntity> findTruckByPage(Pageable pageable);
}
