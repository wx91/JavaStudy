package com.wangx;

public class MoAttack implements ActorArrangable {

	private GeLi geli;

	// 注入革离的具体饰演者 通过初始方法注入
	public MoAttack() {

	}

	// 注入革离的具体饰演者 通过初始方法注入
	public MoAttack(GeLi geli) {
		this.geli = geli;
	}

	// 属性注入
	public void setGeli(GeLi geli) {
		this.geli = geli;
	}

	// 接口注入
	public void injectGeli(GeLi geli) {
		this.geli = geli;
	}

	public void cityGateAsk() {
		geli.responseAsk("墨者革离");
	}

}
