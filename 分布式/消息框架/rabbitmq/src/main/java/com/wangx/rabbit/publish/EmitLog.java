package com.wangx.rabbit.publish;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

public class EmitLog {
	
	 private static final String EXCHANGE_NAME = "logs";

	public static void main(String[] args) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection=factory.newConnection();
		Channel channel=connection.createChannel();
		
		channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

		for(int i=0;i<5;i++){
			String message ="Hello World!"+i;
			channel.basicPublish(EXCHANGE_NAME,"" , MessageProperties.PERSISTENT_TEXT_PLAIN, message.getBytes());
			System.out.println("[x] Sent '"+message+"'");
		}
		//关闭频道和连接
		channel.close();
		connection.close();
	}
}
