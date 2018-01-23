package com.fish.rpc.test.boot;

import com.fish.rpc.boot.FishRPC;

public class FishRPCServer3 {

	public static void main(String[] args){
		if(args != null && args.length >0){
			FishRPC.start(args[0]);
			return ;
		}
		FishRPC.start("E:\\workspace\\FishRPC-service-test\\test\\fishRPC-server3.properties");
 	}
	
}
