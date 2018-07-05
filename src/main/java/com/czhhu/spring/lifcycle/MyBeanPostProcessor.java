package com.czhhu.spring.lifcycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("[BeanPostProcessor].postProcessBeforeInitialization: " + bean + ", " + beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("[BeanPostProcessor].postProcessAfterInitialization: " + bean + ", " + beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	public MyBeanPostProcessor() {
		super();
		System.out.println("BeanPostProcessor.construct");
	}

}
