package com.zhyonk.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint; 

public class MyAspect {
	
	public void before(JoinPoint point){
			String name = point.getTarget().getClass().getName();
			System.out.println("注入"+name+"方法"+"...前置通知");
	}
	
	public void afterReturn(){
		
		System.out.println("方法结束了。。。后置通知");
		
	}
	
	public void after(){
		System.out.println("不管方法有没有执行完。一定会执行的方法...最终通知");
	}
	
	public void afterThrowing(){
		System.out.println("方法执行时发生异常。。。执行异常通知");
	}
	
	public Object Around(ProceedingJoinPoint point) throws Throwable{
		
		Object obj = null;     
        System.out.println("进入Around通知");
        try {     
            obj = point.proceed();     //在这里获得需要切入的对象，将要切入的对象用ASM框架进行字节码重新编译
            System.out.println("退出Around通知");
        } catch (Throwable e) {     
    
            this.afterThrowing();  //相当于异常抛出后通知     
            throw e;     
        }finally{     
           System.out.println("Around中一定会执行的方法");
        }     
        return obj; 		//返回编译之后的字节码生成的对象
	}
}
