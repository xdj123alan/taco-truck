package com.alan.truck.repositotry;


import com.alan.truck.entity.TacoTruckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoTruckRepository extends JpaRepository<TacoTruckEntity, Long> {


}
