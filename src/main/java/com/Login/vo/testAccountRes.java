package com.Login.vo;

import java.util.List;

public class testAccountRes extends BasicRes{
	
	private List<UserInfo> userInfoList;;
	
	public testAccountRes() {
	}

	public testAccountRes(int code, String message) {
		super(code, message);
	}

	public testAccountRes(int code, String message, List<UserInfo> userInfoList) {
		super(code, message);
		this.userInfoList = userInfoList;
	}

	public List<UserInfo> getUserInfo() {
		return userInfoList;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfoList = userInfoList;
	}
	
	
	
	
	
	
	

}
