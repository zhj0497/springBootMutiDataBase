package com.cnepay.springstudy.aop;

import com.cnepay.springstudy.mutidatabase.DBContextHolder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Aspect
@Component
public class DbAop {
    @Pointcut("!@annotation(com.cnepay.springstudy.annotation.Master) " +
            "&& (execution(* com.cnepay.springstudy.service..*.select*(..)) " +
            "||execution(* com.cnepay.springstudy.service..*.get*(..))"+
            "|| execution(* com.cnepay.springstudy.service..*.find*(..)))")
    public void readPointcut() {

    }

    @Pointcut("@annotation(com.cnepay.springstudy.annotation.Master) " +
            "|| execution(* com.cnepay.springstudy.service..*.insert*(..)) " +
            "|| execution(* com.cnepay.springstudy.service..*.add*(..)) " +
            "|| execution(* com.cnepay.springstudy.service..*.update*(..)) " +
            "|| execution(* com.cnepay.springstudy.service..*.edit*(..)) " +
            "|| execution(* com.cnepay.springstudy.service..*.delete*(..)) " +
            "|| execution(* com.cnepay.springstudy.service..*.remove*(..))")
    public void writePointcut() {

    }

    @Before("readPointcut()")
    //@Transactional(propagation= Propagation.NOT_SUPPORTED)
    public void read(JoinPoint joinPoint) {
        DBContextHolder.slave();
        Object[] args= joinPoint.getArgs();
        Object o=joinPoint.getThis();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Transactional transactional=  methodSignature.getMethod().getAnnotation(Transactional.class);
        if(transactional!=null){

        }
    }

    @Before("writePointcut()")
    public void write(JoinPoint joinPoint) {
        DBContextHolder.master();
        Object[] args= joinPoint.getArgs();
        Object o=joinPoint.getThis();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Transactional transactional=  methodSignature.getMethod().getAnnotation(Transactional.class);
        if(transactional!=null){

        }

    }
}
