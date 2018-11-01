package com.nit.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1634376560971090163L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private int memberId;
	private String accessToken;
	private String refershToken;

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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accessToken == null) ? 0 : accessToken.hashCode());
		result = prime * result + memberId;
		result = prime * result + ((refershToken == null) ? 0 : refershToken.hashCode());
		result = prime * result + userId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		if (accessToken == null) {
			if (other.accessToken != null)
				return false;
		} else if (!accessToken.equals(other.accessToken))
			return false;
		if (memberId != other.memberId)
			return false;
		if (refershToken == null) {
			if (other.refershToken != null)
				return false;
		} else if (!refershToken.equals(other.refershToken))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

}
