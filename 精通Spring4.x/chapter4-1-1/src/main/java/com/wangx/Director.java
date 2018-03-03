package com.wangx;

public class Director {
	public void direct() {
		// 1.制定角色的饰演者
		GeLi geLi = new LiuDeHua();
		// 2.注入具体饰演者到剧本中
		MoAttack moAttack = new MoAttack(geLi);
		moAttack.cityGateAsk();
	}

}
