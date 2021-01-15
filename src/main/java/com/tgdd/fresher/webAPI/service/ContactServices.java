package com.tgdd.fresher.webAPI.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.tgdd.fresher.webAPI.config.DBConnPool;
import com.tgdd.fresher.webAPI.interfaces.ContactInterface;
import com.tgdd.fresher.webAPI.model.Contact;

@Service
public class ContactServices implements ContactInterface {

	@Override
	public List<Contact> getAll() {
		List<Contact> response = new ArrayList<Contact>();
//		try {
//			Connection conn = DBConnPool.getConnection();
//			String sql = "select * from fresher.POPH";
//			ResultSet rs = conn.createStatement().executeQuery(sql);
//			while (rs.next()) {
//				Contact con = new Contact();
//				con.setAge(rs.getInt(""));
//				con.setEmail(rs.getString(""));
//				con.setId(rs.getLong(""));
//				con.setName(rs.getString(""));
//				response.add(con);
//			}
//			if (!rs.isClosed()) {
//				rs.close();
//				rs = null;
//			}
//			if (!conn.isClosed()) {
//				conn.close();
//				conn = null;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		Contact con = new Contact();
		con.setAge(18);
		con.setEmail("nhatnhm@gmail.com");
		con.setId(1);
		con.setName("NHATNHM");
		response.add(con);

		return response;
	}

}
