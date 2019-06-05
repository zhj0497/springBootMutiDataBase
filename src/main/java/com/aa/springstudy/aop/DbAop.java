package com.aa.springstudy.aop;

import com.aa.springstudy.mutidatabase.DBContextHolder;
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
    @Pointcut("!@annotation(com.aa.springstudy.annotation.Master) " +
            "&& (execution(* com.aa.springstudy.service..*.select*(..)) " +
            "||execution(* com.aa.springstudy.service..*.get*(..))"+
            "|| execution(* com.aa.springstudy.service..*.find*(..)))")
    public void readPointcut() {

    }

    @Pointcut("@annotation(com.aa.springstudy.annotation.Master) " +
            "|| execution(* com.aa.springstudy.service..*.insert*(..)) " +
            "|| execution(* com.aa.springstudy.service..*.add*(..)) " +
            "|| execution(* com.aa.springstudy.service..*.update*(..)) " +
            "|| execution(* com.aa.springstudy.service..*.edit*(..)) " +
            "|| execution(* com.aa.springstudy.service..*.delete*(..)) " +
            "|| execution(* com.aa.springstudy.service..*.remove*(..))")
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
