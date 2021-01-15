package com.tgdd.fresher.webAPI.model;

import java.util.Date;

public class Phieu_nhap {
	private String Ma_pn;
	private Date Ngay_nhap;
	private String Ma_kho;
	private String Ten_kho;
	private String MST;
	private boolean Trang_thai;
	private Date cDate;
	private String cUser;
	private Date lDate;
	private String lUser;

	public String getMa_pn() {
		return Ma_pn;
	}

	public void setMa_pn(String ma_pn) {
		Ma_pn = ma_pn;
	}

	public Date getNgay_nhap() {
		return Ngay_nhap;
	}

	public void setNgay_nhap(Date ngay_nhap) {
		Ngay_nhap = ngay_nhap;
	}

	public String getMa_kho() {
		return Ma_kho;
	}

	public void setMa_kho(String ma_kho) {
		Ma_kho = ma_kho;
	}

	public String getTen_kho() {
		return Ten_kho;
	}

	public void setTen_kho(String ten_kho) {
		Ten_kho = ten_kho;
	}

	public String getMST() {
		return MST;
	}

	public void setMST(String mST) {
		MST = mST;
	}

	public boolean isTrang_thai() {
		return Trang_thai;
	}

	public void setTrang_thai(boolean trang_thai) {
		Trang_thai = trang_thai;
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
