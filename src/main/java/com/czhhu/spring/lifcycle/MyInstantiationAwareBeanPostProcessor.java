package com.czhhu.spring.lifcycle;

import java.beans.PropertyDescriptor;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("[InstantiationAwareBeanPostProcessor].postProcessBeforeInstantiation, beanClass: "
				+ beanClass + ", beanName: " + beanName);
		return super.postProcessBeforeInstantiation(beanClass, beanName);
	}

	public MyInstantiationAwareBeanPostProcessor() {
		System.out.println("InstantiationAwareBeanPostProcessor.construct");
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("[InstantiationAwareBeanPostProcessor].postProcessAfterInstantiation, bean: " + bean
				+ ", beanName: " + beanName);
		return super.postProcessAfterInstantiation(bean, beanName);
	}

	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean,
			String beanName) throws BeansException {
		System.out.println("[InstantiationAwareBeanPostProcessor].postProcessPropertyValues: PropertyValues: " + pvs
				+ ", PropertyDescriptor[]: " + Arrays.asList(pds));
		return super.postProcessPropertyValues(pvs, pds, bean, beanName);
	}

}
