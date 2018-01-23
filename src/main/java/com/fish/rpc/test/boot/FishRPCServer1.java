package com.fish.rpc.test.boot;

import com.fish.rpc.boot.FishRPC;

public class FishRPCServer1 {

	public static void main(String[] args){
		FishRPC.startHttpServer("127.0.0.1",8080);
		
		if(args != null && args.length >0){ 
			FishRPC.start(args[0]);
			
			 
		} 
		
		//FishRPC.start("E:\\workspace\\FishRPC-service-test\\test\\fishRPC-server1.properties");
 	}
	
}
