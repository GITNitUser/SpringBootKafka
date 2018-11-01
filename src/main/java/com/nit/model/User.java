package com.nit.model;

public class User {
	private String accessToken;
	private String refershToken;
	private int userId;
	private int memberId;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefershToken() {
		return refershToken;
	}

	public void setRefershToken(String refershToken) {
		this.refershToken = refershToken;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getUserId() {
		return userId;
	}

	public int getMemberId() {
		return memberId;
	}
}
