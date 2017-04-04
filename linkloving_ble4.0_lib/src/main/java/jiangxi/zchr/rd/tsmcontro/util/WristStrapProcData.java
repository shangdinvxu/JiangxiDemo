package jiangxi.zchr.rd.tsmcontro.util;

import android.content.Context;
import android.os.Handler;

public class WristStrapProcData {

	//上下文
	private Context m_objContext = null;

	//消息处理句柄
	private Handler m_objHandler = null;

	//发现手环处理消息值
	private int m_iFoundWristStrapMsgCode = 0;

	//连接手环结果消息值
	private int m_iConnectWristStrapRsltCode = 0;

	//断开连接手环结果消息值
	private int m_iDisConnectWristStrapRsltCode = 0;

	public WristStrapProcData() {
		// TODO Auto-generated constructor stub
	}

	public void setContext(Context i_objContext) {
		m_objContext = i_objContext;
	}

	public Context getContext() {
		return m_objContext;
	}

	public void setMsgProcHandler(Handler i_objHandler) {
		m_objHandler = i_objHandler;
	}

	public Handler getMsgProcHanlder() {
		return m_objHandler;
	}

	public void setFoundWristStrapMsgCode(int i_iFoundWristStrapMsgCode) {
		m_iFoundWristStrapMsgCode = i_iFoundWristStrapMsgCode;
	}

	public int getFoundWristStrapMsgCode() {
		return m_iFoundWristStrapMsgCode;
	}

	public void setConnectWristStrapRsltCode(int i_iConnectWristStrapRsltCode) {
		m_iConnectWristStrapRsltCode = i_iConnectWristStrapRsltCode;
	}

	public int getConnectWristStrapRsltCode() {
		return m_iConnectWristStrapRsltCode;
	}

	public void setDisConnectWristStrapRsltCode(int i_iDisConnectWristStrapRsltCode) {
		m_iDisConnectWristStrapRsltCode = i_iDisConnectWristStrapRsltCode;
	}

	public int getDisConnectWristStrapRsltCode() {
		return m_iDisConnectWristStrapRsltCode;
	}
}
