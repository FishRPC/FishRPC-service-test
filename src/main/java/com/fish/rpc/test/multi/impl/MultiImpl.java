package com.fish.rpc.test.multi.impl;

import java.util.Random;

import com.fish.rpc.RPC;
import com.fish.rpc.test.multi.IMulti;
@RPC
public class MultiImpl implements IMulti{

	@Override
	public int multi(int a, int b) {
		int sleep = new Random().nextInt(50);
		/*try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		return a*b;
	}
	
	
	/*public static void main(String[] args){
		try {
	           Class clazz = Class.forName("com.fish.rpc.test.add.IAdd");
	           Method[] methods = clazz.getMethods();
	           for (Method method : methods) {
	               String methodName = method.getName();
	               System.out.println("方法名称:" + methodName);
	               Class<?>[] parameterTypes = method.getParameterTypes();
	               for (Class<?> clas : parameterTypes) {
	                   String parameterName = clas.getName();
	                   System.out.println("参数名称:" + parameterName);
	               }
	               System.out.println("*****************************");
	           }
	       } catch (ClassNotFoundException e) {
	           e.printStackTrace();
	       }
	}*/

}
