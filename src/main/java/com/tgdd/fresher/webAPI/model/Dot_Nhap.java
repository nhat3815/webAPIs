package com.tgdd.fresher.webAPI.model;

import java.util.Date;

public class Dot_Nhap {
	private String Ma_Dot_Nhap;
	private String Ma_po;
	private Date Date_Create;
	private int Trang_Thai;
	private String Ghi_chu;
	private Date cDate;
	private String cUser;
	private Date lDate;
	private String lUser;

	public String getMa_Dot_Nhap() {
		return Ma_Dot_Nhap;
	}

	public void setMa_Dot_Nhap(String ma_Dot_Nhap) {
		Ma_Dot_Nhap = ma_Dot_Nhap;
	}

	public String getMa_po() {
		return Ma_po;
	}

	public void setMa_po(String ma_po) {
		Ma_po = ma_po;
	}

	public Date getDate_Create() {
		return Date_Create;
	}

	public void setDate_Create(Date date_Create) {
		Date_Create = date_Create;
	}

	public int getTrang_Thai() {
		return Trang_Thai;
	}

	public void setTrang_Thai(int trang_Thai) {
		Trang_Thai = trang_Thai;
	}

	public String getGhi_chu() {
		return Ghi_chu;
	}

	public void setGhi_chu(String ghi_chu) {
		Ghi_chu = ghi_chu;
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
