package com.czhhu.spring.pojo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

	private String name;
	private int age;

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName: " + name);
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge: " + age);
		this.age = age;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("[DisposableBean].destroy: " + this);

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[InitializingBean].afterPropertiesSet: " + this);

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("[BeanFactoryAware].setBeanFactory: " + this);

	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("[BeanNameAware].setBeanName: " + this);
	}

	public void init() {
		System.out.println("init-method call");
	}

	public void destroyM() {
		System.out.println("destroy-method call");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct");

	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy");
	}

	public Person() {

		super();
		System.out.println("person construct");
	}

}
