package com.whb.web.config.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author whb
 * @date 2018年12月20日 下午7:06:52 
 * @Description: 设置全局session
 * <listener>
 *   <listener-class>com.workbgm.common.listener.SessionListener</listener-class>
 * </listener>
 */
public class SessionListener implements HttpSessionListener {

	private MySessionContext context = MySessionContext.getSessionContext();
	
	/**
	 * 在用户登录的时候调用addSession方法，会踢掉之前登录的用户
	 */
    @Override
    public void sessionCreated(HttpSessionEvent e) {
        context.addSession(e.getSession());
    }
 
    @Override
    public void sessionDestroyed(HttpSessionEvent e) {
        context.delSession(e.getSession());//只是处理session超时的情况
    }
}
