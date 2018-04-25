package com.wangx;

public class Director {
	public void direct() {
		// 1.制定角色的饰演者
		GeLi geli = new LiuDeHua();
		// 2.注入具体饰演者到剧本中
		// MoAttack moAttack = new MoAttack(geli);
		MoAttack moAttack = new MoAttack();
		// 通过接口方法注入
		moAttack.injectGeli(geli);
		moAttack.cityGateAsk();
	}

}
