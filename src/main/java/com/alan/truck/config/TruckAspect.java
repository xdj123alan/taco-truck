package com.alan.truck.config;

import com.alan.truck.dto.ResultDTO;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TruckAspect {

    @Pointcut("execution(* com.alan.truck.demos.web.*.*(..))")
    public void truckPointcut() {}

    @Around("truckPointcut()")
    public Object AroundAdvice(ProceedingJoinPoint joinPoint) {
        try {
            return joinPoint.proceed();
        } catch (Throwable ex){
            return ResultDTO.error(ex.getMessage());
        }

    }
}
