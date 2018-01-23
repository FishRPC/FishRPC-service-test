package com.fish.rpc.test.add.impl;

import com.fish.rpc.RPC;
import com.fish.rpc.ResourceId;
import com.fish.rpc.test.add.IAdd;
import com.fish.rpc.test.dto.Person;

@RPC
@ResourceId(id="AddImpl",memo="")
public class AddImpl implements IAdd{

	@Override	
	public int add(int a, Person p,int b) {
		/*int sleep = new Random().nextInt(50);
		try {
			System.out.println(p);
			Thread.sleep(sleep);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		return a+b;
	}
	
	@Override	
	public int add(int a,int b) {
		return a+b;
	}

	@Override
	public Person get() {
		Person p = new Person();
		p.setAge(100);
		p.setName("温晓宇");
		return p;
	}

}
