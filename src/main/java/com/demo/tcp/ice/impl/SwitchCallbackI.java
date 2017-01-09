package com.demo.tcp.ice.impl;

import org.apache.log4j.Logger;

import Ice.Current;
import switcher.SwitchException;
import switcher._ISwitchCallbackDisp;

/**
 * 回调客户端接口定义(服务端调用客户端的接口)
 */
public class SwitchCallbackI extends _ISwitchCallbackDisp {

	private static Logger LOGGER = Logger.getLogger(SwitchCallbackI.class);
	private static final long serialVersionUID = 1L;

	public SwitchCallbackI() {
	}

@Override
public boolean send(byte[] byteSeq, Current __current) throws SwitchException {
	// 客户端打印会打印以下信息
	LOGGER.info("服务端回调客户端--发送二进制消息--send() byteSeq = " + new String(byteSeq));
	return true;
}

@Override
public boolean sendMsg(String msg, Current __current) throws SwitchException {
	// 客户端打印会打印以下信息
	LOGGER.info("服务端回调客户端--发送String消息--sendMsg() msg = " + msg);
	return true;
}

}
