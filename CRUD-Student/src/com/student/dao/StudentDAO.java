package com.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.student.entity.StudentEntity;

public class StudentDAO {
	private static Connection connectToDb() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "root");
		return c;
	}

	public int insertStudent(StudentEntity student) throws Exception {
		Connection c = connectToDb();
		PreparedStatement s = c.prepareStatement(
				"insert into students(rollNo, name, address, degree, field, mobNo, email, grade) values ( ?, ? , ?, ?, ?, ? , ?, ?);");
		s.setInt(1, student.getRollNo());
		s.setString(2, student.getName());
		s.setString(3, student.getAddress());
		s.setString(4, student.getDegree());
		s.setString(5, student.getFeild());
		s.setLong(6, student.getMobNo());
		s.setString(7, student.getEmail());
		s.setString(8, student.getGrade());
		int rowsAffected = s.executeUpdate();
		return rowsAffected;

	}

	public int updateStudent(int rollNo, String whatToUpdate, String toUpdate) throws Exception {
		Connection c = connectToDb();

		whatToUpdate.toLowerCase();
		if (whatToUpdate.equals("name")) {
			PreparedStatement s = c.prepareStatement("update students set name = ? where rollNo = ?");
			s.setString(1, toUpdate);
			s.setInt(2, rollNo);
			return s.executeUpdate();
		} else if (whatToUpdate.equals("address")) {
			PreparedStatement s = c.prepareStatement("update students set address = ? where rollNo = ?");
			s.setString(1, toUpdate);
			s.setInt(2, rollNo);
			return s.executeUpdate();
		} else if (whatToUpdate.equals("degree")) {
			PreparedStatement s = c.prepareStatement("update students set degree = ? where rollNo = ?");
			s.setString(1, toUpdate);
			s.setInt(2, rollNo);
			return s.executeUpdate();
		} else if (whatToUpdate.equals("field")) {
			PreparedStatement s = c.prepareStatement("update students set field = ? where rollNo = ?");
			s.setString(1, toUpdate);
			s.setInt(2, rollNo);
			return s.executeUpdate();

		} else if (whatToUpdate.equals("email")) {
			PreparedStatement s = c.prepareStatement("update students set email = ? where rollNo = ?");
			s.setString(1, toUpdate);
			s.setInt(2, rollNo);
			return s.executeUpdate();
		} else if (whatToUpdate.equals("grade")) {
			PreparedStatement s = c.prepareStatement("update students set grade = ? where rollNo = ?");
			s.setString(1, toUpdate);
			s.setInt(2, rollNo);
			return s.executeUpdate();
		}
		

		return 0;
	}
	public int updateStudent(int rollNo, Long mobNo) throws Exception {
		Connection c = connectToDb();
		PreparedStatement s = c.prepareStatement("update students set mobNo = ? where rollNo = ?");
		s.setLong(1, mobNo);
		s.setInt(2, rollNo);
		return s.executeUpdate();
	}
	
	
	public int deleteStudent(int rollNo) throws Exception {
		Connection c = connectToDb();
		PreparedStatement s = c.prepareStatement("delete from students where rollNo = ?");
		s.setInt(1, rollNo);
		return s.executeUpdate();
	}
	
	public ResultSet showStudents() throws Exception {
		Connection c = connectToDb();
		PreparedStatement s = c.prepareStatement("select * from students");
		return s.executeQuery();
	}


}
