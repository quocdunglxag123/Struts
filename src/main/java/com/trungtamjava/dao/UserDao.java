package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.trungtamjava.model.User;


public class UserDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public User getUserById(String id) {
		String query = "select * from users where id=?";
		try {
			conn = new com.trungtamjava.utils.JDBCConnection().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			rs.next();
			return new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
