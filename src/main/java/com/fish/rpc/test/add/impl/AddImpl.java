package com.fish.rpc.test.add.impl;

import com.fish.rpc.RPC;
import com.fish.rpc.test.add.IAdd;

@RPC
public class AddImpl implements IAdd{

	@Override	
	public int add(int a, int b) {
		/*try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		return a+b;
	}

}
