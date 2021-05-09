package com.vti.entity;

import java.util.Date;

public class Message {

	private int message_id;
	private Date sendingtime;
	private int senderid;
	private int receiverid;
	private String content;

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(int message_id, Date sendingtime, int senderid, int receiverid, String content) {
		super();
		this.message_id = message_id;
		this.sendingtime = sendingtime;
		this.senderid = senderid;
		this.receiverid = receiverid;
		this.content = content;
	}

	public int getMessage_id() {
		return message_id;
	}

	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}

	public Date getSendingtime() {
		return sendingtime;
	}

	public void setSendingtime(Date sendingtime) {
		this.sendingtime = sendingtime;
	}

	public int getSenderid() {
		return senderid;
	}

	public void setSenderid(int senderid) {
		this.senderid = senderid;
	}

	public int getReceiverid() {
		return receiverid;
	}

	public void setReceiverid(int receiverid) {
		this.receiverid = receiverid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Message [message_id=" + message_id + ", sendingtime=" + sendingtime + ", senderid=" + senderid
				+ ", receiverid=" + receiverid + ", content=" + content + "]";
	}

}
