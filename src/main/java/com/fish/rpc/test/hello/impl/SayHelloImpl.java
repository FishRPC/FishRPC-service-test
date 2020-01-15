package com.fish.rpc.test.hello.impl;

import com.fish.rpc.RPC;
import com.fish.rpc.test.dto.Person;
import com.fish.rpc.test.hello.ISayHello;
@RPC
public class SayHelloImpl implements ISayHello{
	@Override
	public void hello() {
		System.out.println("Say Hello.");
	}

	@Override
	public String echo(String speak) {
		return "I am receive you talk:"+speak;
	}

	@Override
	public Integer helloInt() {
		return 100;
	}

	@Override
	public Integer savePerson(Person person) {
		System.out.println("save persopn:"+person);
		return 1;
	}

	@Override
	public Person getPersion() {
		Person p = new Person();
		p.setAge(20);
		p.setName("fishRPC");
		System.out.println("get persopn:"+p);
		return p;
	}

	@Override
	public double why() {
 		return 0;
	}

}
