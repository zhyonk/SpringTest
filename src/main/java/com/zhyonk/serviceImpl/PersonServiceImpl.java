package com.zhyonk.serviceImpl;

import com.zhyonk.service.PersonService;

public class PersonServiceImpl implements PersonService{

	@Override
	public void save(String name) {
		System.out.println("我是save方法");  
	}

	@Override
	public void update(String name, Integer id) {
		System.out.println("我是update()方法");  
	}

	@Override
	public String getPersonName(Integer id) {
		System.out.println("我是getPersonName()方法");  
		return "xxx";
	}
}

