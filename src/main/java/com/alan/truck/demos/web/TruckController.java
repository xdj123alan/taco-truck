package com.alan.truck.demos.web;

import com.alan.truck.dto.PageRequestDTO;
import com.alan.truck.dto.ResultDTO;
import com.alan.truck.entity.TacoTruckEntity;
import com.alan.truck.enums.ResultTypeEnum;
import com.alan.truck.service.TacoTruckService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class TruckController {

    @Resource
    private TacoTruckService tacoTruckService;

    @PostMapping("/truck/page")
    public ResultDTO<TacoTruckEntity> findTruckByPages(@RequestBody PageRequestDTO requestDto) {
        // 从DTO中提取分页参数
        int page = requestDto.getPage();
        int size = requestDto.getSize();
        String sort = requestDto.getSort();
        String direction = requestDto.getDirection();
        // 创建Sort对象
        Sort.Direction directionEnum = Sort.Direction.fromString(direction);
        Sort sortObj = Sort.by(directionEnum, sort);

        // 创建PageRequest对象
        PageRequest pageRequest = PageRequest.of(page, size, sortObj);
        return new ResultDTO(ResultTypeEnum.SUCCESS.getStatus(), tacoTruckService.findTruckByPage(pageRequest), null);
    }
}
