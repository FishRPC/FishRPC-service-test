package com.fish.rpc.test.add.impl;

import java.util.Random;

import com.fish.rpc.RPC;
import com.fish.rpc.test.add.IAdd;

@RPC
public class AddImpl implements IAdd{

	@Override	
	public int add(int a, int b) {
		int sleep = new Random().nextInt(50);
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return a+b;
	}

}
