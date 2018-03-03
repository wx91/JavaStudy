package com.wangx;

public class MoAttack {

	private GeLi geli;

	// 注入革离的具体饰演者
	public MoAttack(GeLi geli) {
		this.geli = geli;
	}

	public void cityGateAsk() {
		geli.responseAsk("墨者革离");
	}

}
