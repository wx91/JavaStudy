package com.wangx.netty.heartBeat;

import java.net.InetAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.ScheduledFuture;

public class ClienHeartBeattHandler extends ChannelHandlerAdapter {

	private ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(1);

	private ScheduledFuture<?> heartBeat;
	// 主动向服务发送认证信息
	private InetAddress addr;

	private static final String SUCCESS_KEY = "auth_success_key";

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		addr = InetAddress.getLocalHost();
		String ip = addr.getHostAddress();
		String key = "1234";
		// 证书
		String auth = ip + "," + key;
		ctx.writeAndFlush(auth);
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		try {
			if (msg instanceof String) {
				String ret = (String) msg;
				if (SUCCESS_KEY.equals(ret)) {
					//握手成功，主动发送心跳消息

				}
			}

		} finally {
			
		}
	}

	private class HeartBeatTask implements Runnable {
		private final ChannelHandlerContext ctx;

		public HeartBeatTask(final ChannelHandlerContext ctx) {
			this.ctx = ctx;
		}

		public void run() {
			try {

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
			cause.printStackTrace();
			if (heartBeat != null) {
				heartBeat.cancel(true);
				heartBeat = null;
			}
			ctx.fireExceptionCaught(cause);
		}
	}
}
