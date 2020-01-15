package com.fish.rpc.test.add.impl;

import com.fish.rpc.RPC;
import com.fish.rpc.ResourceId;
import com.fish.rpc.test.add.IAdd;
import com.fish.rpc.test.dto.Person;

@RPC
@ResourceId(id="AddImpl",memo="")
public class AddImpl implements IAdd{
	@Override
	public int add(int a,int b) {
		return a+b;
	}
}
