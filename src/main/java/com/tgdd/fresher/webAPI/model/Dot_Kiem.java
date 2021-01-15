package com.tgdd.fresher.webAPI.model;

import java.util.Date;

public class Dot_Kiem {
	private String Ma_dk;
	private String Ma_po;
	private String Ma_pn;
	private Date Date_create;
	private int Trang_thai;
	private String ghi_chu;
	private Date cDate;
	private String cUser;
	private Date lDate;
	private String lUser;

	public String getMa_dk() {
		return Ma_dk;
	}

	public void setMa_dk(String ma_dk) {
		Ma_dk = ma_dk;
	}

	public String getMa_po() {
		return Ma_po;
	}

	public void setMa_po(String ma_po) {
		Ma_po = ma_po;
	}

	public String getMa_pn() {
		return Ma_pn;
	}

	public void setMa_pn(String ma_pn) {
		Ma_pn = ma_pn;
	}

	public Date getcDate() {
		return cDate;
	}

	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}

	public int getTrang_thai() {
		return Trang_thai;
	}

	public void setTrang_thai(int trang_thai) {
		Trang_thai = trang_thai;
	}

	public String getGhi_chu() {
		return ghi_chu;
	}

	public void setGhi_chu(String ghi_chu) {
		this.ghi_chu = ghi_chu;
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

	public Date getDate_create() {
		return Date_create;
	}

	public void setDate_create(Date date_create) {
		Date_create = date_create;
	}

}
