package com.tgdd.fresher.webAPI.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.tgdd.fresher.webAPI.config.DBConnPool;
import com.tgdd.fresher.webAPI.interfaces.IPOPH1Service;
import com.tgdd.fresher.webAPI.model.POPH1;

@Service
public class POPH1Service implements IPOPH1Service{

	@Override
	public List<POPH1> POGetPH1(String poid, int limit) {
		List<POPH1> respone = new ArrayList<POPH1>();
		String store = "call fresher.POGetPH1(?)";
		try {
			Connection conn = DBConnPool.getConnection();
			CallableStatement pStmt = conn.prepareCall(store);
			pStmt.setString(1, poid);
			ResultSet rs = pStmt.executeQuery();
			while(rs.next()) {
				POPH1 po = new POPH1();
					po.setMa_PO(rs.getString("ppoid"));
				respone.add(po);
			}
			if (!rs.isClosed()) {
				rs.close();
				rs = null;
			}
			if(!pStmt.isClosed()) {
				pStmt.close();
				pStmt = null;
			}
			if (!conn.isClosed()) {
				conn.close();
				conn = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return respone;
	}

	@Override
	public POPH1 getPOPH1(String poid, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public POPH1 createPOPH1(POPH1 poph1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public POPH1 UpdatePOPH1(POPH1 poph1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deletePOPH1(String poid) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
