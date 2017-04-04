package com.phei.netty.basic;

public class NettyTest {
	
	public static void main(String[] args) {
		
		for(int i =0;i<300;i++)
		{
			new Thread(new NioRunnbale()).start();
		}
	}

}
