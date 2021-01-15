package com.tgdd.fresher.webAPI.model;

import java.util.Date;

public class Kho {
	private String Ma_kho;
	private String Ten_kho;
	private String Dia_chi;
	private String Ma_cty;
	private Date cDate;
	private String cUser;
	private Date lDate;
	private String lUser;

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

	public String getDia_chi() {
		return Dia_chi;
	}

	public void setDia_chi(String dia_chi) {
		Dia_chi = dia_chi;
	}

	public String getMa_cty() {
		return Ma_cty;
	}

	public void setMa_cty(String ma_cty) {
		Ma_cty = ma_cty;
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
