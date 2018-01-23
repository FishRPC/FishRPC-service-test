package com.fish.rpc.test.hello.impl;

import java.util.ArrayList;
import java.util.List;

import com.fish.rpc.RPC;
import com.fish.rpc.test.dto.Person;
import com.fish.rpc.test.hello.IBigdata;
@RPC
public class BigdataImpl implements IBigdata{

	@Override
	public List<Person> list() throws Exception{
		List<Person> list = new ArrayList<Person>();
		for(int i=0;i<10000;i++){
			Person newp = new Person();
			newp.setAge(10*i);
			newp.setName("测试"+i);
			list.add(newp);
		}
		throw new Exception("test Exception");  
	}
	
	public static void main(String[] args){
		System.out.println(new Byte("121"));
	}
}
