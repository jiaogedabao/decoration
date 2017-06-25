package org.offer.common;

import org.offer.bean.UserinfoBean;

public class LoginBean {
	
	private String ticket;
	
	private String cookieKey;
	
	private UserinfoBean user;

	public String getTicket() {
		return ticket;
	}


	public void setTicket(String ticket) {
		this.ticket = ticket;
	}


	public String getCookieKey() {
		return cookieKey;
	}


	public void setCookieKey(String cookieKey) {
		this.cookieKey = cookieKey;
	}


	public UserinfoBean getUser() {
		return user;
	}


	public void setUser(UserinfoBean user) {
		this.user = user;
	}
	
	

}
