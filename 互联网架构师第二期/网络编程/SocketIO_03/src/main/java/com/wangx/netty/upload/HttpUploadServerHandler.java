package com.wangx.netty.upload;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.HttpObject;

public class HttpUploadServerHandler extends SimpleChannelInboundHandler<HttpObject> {

	@Override
	protected void messageReceived(ChannelHandlerContext ctx, HttpObject msg) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
