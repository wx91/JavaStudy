package com.wangx.rabbit.routing;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RoutingSendDirect {
	private static final String EXCHANGE_NAME = "direct_logs";  
	 
	private static final String[] routingKeys = new String[]{"info" ,"warning", "error"};  
	 
	public static void main(String[] args) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		final Connection connection=factory.newConnection();
		final Channel channel=connection.createChannel();
		
//      声明交换器  
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");  
//      发送消息  
        for(String severity :routingKeys){  
            String message = "Send the message level:" + severity;  
            channel.basicPublish(EXCHANGE_NAME, severity, null, message.getBytes());  
            System.out.println(" [x] Sent '" + severity + "':'" + message + "'");  
        }  
        channel.close();  
        connection.close();  
	}
}
