package com.wangx.netty.httpfile;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpRequest;

public class HttpFileServerHandler extends SimpleChannelInboundHandler<FullHttpRequest> {

	@Override
	protected void messageReceived(ChannelHandlerContext ctx, FullHttpRequest msg) throws Exception {
		
	}

}
