package com.tgdd.fresher.webAPI.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tgdd.fresher.webAPI.config.DBConnPool;
import com.tgdd.fresher.webAPI.interfaces.IPOPHService;
import com.tgdd.fresher.webAPI.model.POPH;

@Service
public class POPHService implements IPOPHService {

	@Override
	public List<POPH> getAll() {
		List<POPH> response = new ArrayList<POPH>();
		String store = "select * from fresher.POPH";
//		{call fresher.POPH.POGetPOPH(?)}
		try {
			Connection conn = DBConnPool.getConnection();
//			CallableStatement pStmt = conn.prepareCall(store);
			ResultSet rs = conn.createStatement().executeQuery(store);

			while (rs.next()) {
				POPH po = new POPH();
				po.setStt_rec(rs.getString("stt_rec"));
				po.setcDate(rs.getTimestamp("cDate"));
				po.setcUser(rs.getString("cUser"));
				po.setlDate(rs.getTimestamp("lDate"));
				po.setlUser(rs.getString("lUser"));
				response.add(po);
			}

			if (rs.isClosed()) {
				rs.close();
				rs = null;
			}
			if (conn.isClosed()) {
				conn.close();
				conn = null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

}
