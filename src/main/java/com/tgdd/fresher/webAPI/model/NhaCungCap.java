package com.tgdd.fresher.webAPI.model;

import java.util.Date;

public class NhaCungCap {
	private String Ma_Ncc;
	private String Ten_Ncc;
	private String Dia_chi;
	private Date cDate;
	private String cUser;
	private Date lDate;
	private String lUser;

	public String getMa_Ncc() {
		return Ma_Ncc;
	}

	public void setMa_Ncc(String ma_Ncc) {
		Ma_Ncc = ma_Ncc;
	}

	public String getTen_Ncc() {
		return Ten_Ncc;
	}

	public void setTen_Ncc(String ten_Ncc) {
		Ten_Ncc = ten_Ncc;
	}

	public String getDia_chi() {
		return Dia_chi;
	}

	public void setDia_chi(String dia_chi) {
		Dia_chi = dia_chi;
	}

	public Date getcDate() {
		return cDate;
	}

	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}

	public Date getlDate() {
		return lDate;
	}

	public void setlDate(Date lDate) {
		this.lDate = lDate;
	}

	public String getcUser() {
		return cUser;
	}

	public void setcUser(String cUser) {
		this.cUser = cUser;
	}

	public String getlUser() {
		return lUser;
	}

	public void setlUser(String lUser) {
		this.lUser = lUser;
	}

}
