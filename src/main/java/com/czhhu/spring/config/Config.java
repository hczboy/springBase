package com.czhhu.spring.config;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.czhhu.spring.lifcycle.MyBeanFactoryPostProcessor;
import com.czhhu.spring.lifcycle.MyBeanPostProcessor;
import com.czhhu.spring.lifcycle.MyInstantiationAwareBeanPostProcessor;
import com.czhhu.spring.pojo.Person;

@Configuration
public class Config {

	@Bean(initMethod = "init", destroyMethod = "destroyM")
	public Person person() {
		Person person = new Person();
		person.setAge(12);
		person.setName("dan");
		return person;
	}

	@Bean
	public BeanPostProcessor myBeanPostProcessor() {
		return new MyBeanPostProcessor();
	}

	@Bean
	public BeanFactoryPostProcessor myBeanFactoryPostProcessor() {
		return new MyBeanFactoryPostProcessor();

	}

	@Bean
	public InstantiationAwareBeanPostProcessor myInstantiationAwareBeanPostProcessor() {
		return new MyInstantiationAwareBeanPostProcessor();
	}
}
