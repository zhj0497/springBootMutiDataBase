package com.aa.springstudy.mutidatabase;

import java.util.concurrent.atomic.AtomicInteger;

public class DBContextHolder {
    private final static ThreadLocal<DBType> contextHolder = new ThreadLocal<DBType>();
    private static  final AtomicInteger counter = new AtomicInteger(-1);

    public static DBType get(){
      return   contextHolder.get();
    }
    public static void set(DBType dbType){
        contextHolder.set(dbType);
    }

    public static void master() {
        set(DBType.MASTER);
        System.out.println("切换到master");
    }

    public static void slave() {
        set(DBType.SLAVE);
        System.out.println("切换到SLAVE");
        //  轮询
       /* int index = counter.getAndIncrement() % 2;
        if (counter.get() > 9999) {
            counter.set(-1);
        }
        if (index == 0) {
            set(DBTypeEnum.SLAVE1);
            System.out.println("切换到slave1");
        }else {
            set(DBTypeEnum.SLAVE2);
            System.out.println("切换到slave2");
        }*/
    }

}
