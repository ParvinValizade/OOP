package aop.service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class ExecutionTimeLogger {

    @Pointcut(value = "execution(* aop.service.HelloService.*(..))")
    private void logExecutionTimePc(){}

    @SneakyThrows
    @Around(value = "logExecutionTimePc()")
    public void logExecutionTime(ProceedingJoinPoint joinPoint) {
        long started = System.currentTimeMillis();
        joinPoint.proceed();
        long ended = System.currentTimeMillis();
        log.info("Elapsed time {}",ended-started);
    }
}
