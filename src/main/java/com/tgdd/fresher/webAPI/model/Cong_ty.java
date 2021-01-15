package com.tgdd.fresher.webAPI.model;

import java.util.Date;

public class Cong_ty {
	private String Ma_cty;
	private String Ten_cty;
	private String Chi_nhanh;
	private Date cDate;
	private String cUser;
	private Date lDate;
	private String lUser;

	public String getMa_cty() {
		return Ma_cty;
	}

	public void setMa_cty(String ma_cty) {
		Ma_cty = ma_cty;
	}

	public String getTen_cty() {
		return Ten_cty;
	}

	public void setTen_cty(String ten_cty) {
		Ten_cty = ten_cty;
	}

	public String getChi_nhanh() {
		return Chi_nhanh;
	}

	public void setChi_nhanh(String chi_nhanh) {
		Chi_nhanh = chi_nhanh;
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
