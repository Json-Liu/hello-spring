package com.yy.aop.introduce;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import com.yy.aop.introduce.impl.IntroduceServerImpl;

/***为服务类引用新方法的切面
 ** @Author JosonLiu
 ** @Date 2016年9月23日
 ** @Version 1.0
 **/
@Aspect
@Component
public class IntroduceAop {
	@DeclareParents( value = "com.yy.aop.introduce.OriginServer+",//被代理接口 ,后面的 + 表示对其所有实现类生效
			defaultImpl=IntroduceServerImpl.class)//新方法的实现类
	public static IntroduceServer introduceServer;//新方法的接口对象
}

