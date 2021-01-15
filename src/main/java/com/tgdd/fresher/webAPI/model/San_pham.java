package com.tgdd.fresher.webAPI.model;

import java.util.Date;

public class San_pham {
	private String Ma_sp;
	private String Ten_sp;
	private String barcode;
	private String NhomHang;
	private String Nganh_Hang;
	private boolean Trang_thai;
	private Date cDate;
	private String cUser;
	private Date lDate;
	private String lUser;

	public String getMa_sp() {
		return Ma_sp;
	}

	public void setMa_sp(String ma_sp) {
		Ma_sp = ma_sp;
	}

	public String getTen_sp() {
		return Ten_sp;
	}

	public void setTen_sp(String ten_sp) {
		Ten_sp = ten_sp;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getNhomHang() {
		return NhomHang;
	}

	public void setNhomHang(String nhomHang) {
		NhomHang = nhomHang;
	}

	public String getNganh_Hang() {
		return Nganh_Hang;
	}

	public void setNganh_Hang(String nganh_Hang) {
		Nganh_Hang = nganh_Hang;
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
