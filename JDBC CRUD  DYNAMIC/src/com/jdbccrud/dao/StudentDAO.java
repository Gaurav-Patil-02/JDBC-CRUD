package com.jdbccrud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jdbccrud.model.Student;

public class StudentDAO {
	public Connection dbConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "root");
		return c;
	}

	public int insertData(Student student) throws Exception {
		Connection c = dbConnection();
		PreparedStatement st = c.prepareStatement("INSERT INTO student (rollNo, name, std, division) values (?,?,?,?)");
		st.setInt(1, student.getRollNo());
		st.setString(2, student.getName());
		st.setString(3, student.getStd());
		st.setString(4, student.getDivision());

		return st.executeUpdate();
	}

	public int updateData(Student student) throws Exception {
		Connection c = dbConnection();
		PreparedStatement st = c.prepareStatement("UPDATE student SET name = ?, std = ?, division = ? WHERE rollNo = ?");
		st.setString(1, student.getName());
		st.setString(2, student.getStd());
		st.setString(3, student.getDivision());
		st.setInt(4, student.getRollNo());
		
		return st.executeUpdate();
	}
	
	public int DeleteData(int rollNo) throws Exception {
		Connection c = dbConnection();
		PreparedStatement st = c.prepareStatement("Delete FROM student where rollNo = ?");
		st.setInt(1, rollNo);
		
		return st.executeUpdate();
	}
	
	public ResultSet ShowData() throws Exception {
		Connection c = dbConnection();
		 PreparedStatement st = c.prepareStatement("SELECT * FROM student");
		 return st.executeQuery();
				
	}
}
