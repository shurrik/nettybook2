package com.phei.netty.basic;

public class NioRunnbale implements Runnable{


	@Override
	public void run() {

		try {
			new TimeClient().connect(8080, "127.0.0.1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
