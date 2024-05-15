package org.example.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("org.example.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeGetExceptionHandlingAdvice(){
        System.out.println("beforeAddExceptionHandlingAdvice: ловим/обрабатываем исключение при попытке получить книгу/журнал");
        System.out.println("----------------------------------------");
    }
}
