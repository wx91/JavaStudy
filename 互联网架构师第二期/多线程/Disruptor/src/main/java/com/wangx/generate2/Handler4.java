package com.wangx.generate2;

import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.WorkHandler;
import com.wangx.generate1.Trade;

public class Handler4 implements EventHandler<Trade>,WorkHandler<Trade>{

	public void onEvent(Trade event) throws Exception {
		 this.onEvent(event);  
	}

	public void onEvent(Trade event, long sequence, boolean endOfBatch) throws Exception {
		System.out.println("handler4: get name : " + event.getName());
    	event.setName(event.getName() + "h4");
	}
	
}
