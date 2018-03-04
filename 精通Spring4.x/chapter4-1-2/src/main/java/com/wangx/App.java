package com.wangx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MoAttack moAttack = ctx.getBean("moAttack", MoAttack.class);
		moAttack.cityGateAsk();
	}
}
