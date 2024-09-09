package com.alan.truck.service.impl;

import com.alan.truck.entity.TacoTruckEntity;
import com.alan.truck.repositotry.TacoTruckRepository;
import com.alan.truck.service.TacoTruckService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;

@Service
public class TacoTruckServiceImpl implements TacoTruckService {

    @Resource
    private TacoTruckRepository repository;

    @Override
    public Page<TacoTruckEntity> findTruckByPage(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
