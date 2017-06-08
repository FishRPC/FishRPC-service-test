package com.fish.rpc.test.multi.impl;

import com.fish.rpc.RPC;
import com.fish.rpc.test.multi.IMulti;
@RPC
public class MultiImpl implements IMulti{

	@Override
	public int multi(int a, int b) {
		/*try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		return a*b;
	}

}
