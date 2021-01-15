package com.tgdd.fresher.webAPI.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgdd.fresher.webAPI.config.DBConnPool;
import com.tgdd.fresher.webAPI.interfaces.IPOCTService;
import com.tgdd.fresher.webAPI.model.POCT;

@Service
public class POCTService implements IPOCTService{

	
	@Override
	public List<POCT> getPOCTTOPH(String sttRec) {
		String store = "";
		try {
			Connection conn = DBConnPool.getConnection();
			PreparedStatement ps = conn.prepareStatement(store);
			ps.setString(1, sttRec);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
