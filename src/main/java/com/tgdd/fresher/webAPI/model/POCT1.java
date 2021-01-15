package com.tgdd.fresher.webAPI.model;

import java.util.Date;

public class POCT1 {
	private String Ma_po;
	private String stt;
	private String Ma_sp;
	private String Ten_sp;
	private String DVT;
	private Float Don_gia;
	private Date HSD;
	private int Sl_dat;
	private Date cDate;
	private String cUser;
	private Date lDate;
	private String lUser;

	public String getMa_po() {
		return Ma_po;
	}

	public void setMa_po(String ma_po) {
		Ma_po = ma_po;
	}

	public String getStt() {
		return stt;
	}

	public void setStt(String stt) {
		this.stt = stt;
	}

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

	public String getDVT() {
		return DVT;
	}

	public void setDVT(String dVT) {
		DVT = dVT;
	}

	public Float getDon_gia() {
		return Don_gia;
	}

	public void setDon_gia(Float don_gia) {
		Don_gia = don_gia;
	}

	public Date getHSD() {
		return HSD;
	}

	public void setHSD(Date hSD) {
		HSD = hSD;
	}

	public int getSl_dat() {
		return Sl_dat;
	}

	public void setSl_dat(int sl_dat) {
		Sl_dat = sl_dat;
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
