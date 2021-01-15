package com.tgdd.fresher.webAPI.model;

import java.io.Serializable;
import java.util.Date;

public class POPH{
	private String stt_rec;
	private Date cDate;
	private String cUser;
	private Date lDate;
	private String lUser;
	public String getStt_rec() {
		return stt_rec;
	}
	public void setStt_rec(String stt_rec) {
		this.stt_rec = stt_rec;
	}
	public Date getcDate() {
		return cDate;
	}
	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
	public String getcUser() {
		return cUser;
	}
	public void setcUser(String cUser) {
		this.cUser = cUser;
	}
	public Date getlDate() {
		return lDate;
	}
	public void setlDate(Date lDate) {
		this.lDate = lDate;
	}
	public String getlUser() {
		return lUser;
	}
	public void setlUser(String lUser) {
		this.lUser = lUser;
	}
	
	
	
}
