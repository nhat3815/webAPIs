package com.tgdd.fresher.webAPI.model;

import java.util.Date;

public class POCT {
		
	private String stt_rec ;
	private String stt_rec0;
	private String Ma_vt;
	private int so_luong;
	private int so_luong1;
	private String userCheck;
	private boolean statusCheck;
	private Date dateCheck;
	public String getStt_rec() {
		return stt_rec;
	}
	public void setStt_rec(String stt_rec) {
		this.stt_rec = stt_rec;
	}
	public String getStt_rec0() {
		return stt_rec0;
	}
	public void setStt_rec0(String stt_rec0) {
		this.stt_rec0 = stt_rec0;
	}
	public String getMa_vt() {
		return Ma_vt;
	}
	public void setMa_vt(String ma_vt) {
		Ma_vt = ma_vt;
	}
	public int getSo_luong() {
		return so_luong;
	}
	public void setSo_luong(int so_luong) {
		this.so_luong = so_luong;
	}
	public int getSo_luong1() {
		return so_luong1;
	}
	public void setSo_luong1(int so_luong1) {
		this.so_luong1 = so_luong1;
	}
	public String getUserCheck() {
		return userCheck;
	}
	public void setUserCheck(String userCheck) {
		this.userCheck = userCheck;
	}
	public boolean isStatusCheck() {
		return statusCheck;
	}
	public void setStatusCheck(boolean statusCheck) {
		this.statusCheck = statusCheck;
	}
	public Date getDateCheck() {
		return dateCheck;
	}
	public void setDateCheck(Date dateCheck) {
		this.dateCheck = dateCheck;
	}
	
	

}
