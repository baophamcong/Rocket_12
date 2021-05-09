package com.vti.entity;

public class Relationship {

	private int user_one_id; // user nguoi gui moi ket ban luon nho hon user nguoi nhan
	private int user_two_id; // user dc moi ket ban
	private int status; // 1:Accepted: da dc chap nhan, 0: Pending:cho xu ly, 2:Declined:tu choi, 3:Blocked:bi chan
	private int action_user_id;

	/*
	 * Nếu người dùng có id 1 đã gửi yêu cầu đến người dùng có id 2, id người dùng
	 * hành động sẽ là 1. Vì vậy, người dùng đã gửi yêu cầu kết bạn sẽ là người dùng
	 * 1 Nếu id người dùng 2 đã chặn id người dùng 3, thì id người dùng 2 sẽ là id
	 * người dùng hành động.
	 */
	public Relationship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Relationship(int user_one_id, int user_two_id, int status, int action_user_id) {
		super();
		this.user_one_id = user_one_id;
		this.user_two_id = user_two_id;
		this.status = status;
		this.action_user_id = action_user_id;
	}

	public int getUser_one_id() {
		return user_one_id;
	}

	public void setUser_one_id(int user_one_id) {
		this.user_one_id = user_one_id;
	}

	public int getUser_two_id() {
		return user_two_id;
	}

	public void setUser_two_id(int user_two_id) {
		this.user_two_id = user_two_id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getAction_user_id() {
		return action_user_id;
	}

	public void setAction_user_id(int action_user_id) {
		this.action_user_id = action_user_id;
	}

	@Override
	public String toString() {
		return "Relationship [user_one_id=" + user_one_id + ", user_two_id=" + user_two_id + ", status=" + status
				+ ", action_user_id=" + action_user_id + "]";
	}

}
