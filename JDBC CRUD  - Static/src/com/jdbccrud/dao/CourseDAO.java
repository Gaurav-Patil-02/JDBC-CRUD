package com.jdbccrud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CourseDAO {

	// Connection made every time for practice purpose
	public int insertCourseDetails() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "root");
		Statement s = c.createStatement();

		int result = s.executeUpdate("INSERT INTO course (title, instuctor, price) values('Java Full Stack', 'Shubham Sir', 50000)");

		c.close();
		return result;
	}

	public int updateCourseDetails() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "root");

		Statement s = c.createStatement();

		int result  = s.executeUpdate("UPDATE course SET price = 25000 WHERE course_id = 1");

		c.close();
		return result;
	}

	public int deleteCourseDetails() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "root");

		Statement s = c.createStatement();

		int result =  s.executeUpdate("DELETE FROM course WHERE course_id = 2");
		
		c.close();
		return result;

	}

	public ResultSet getCourseDetails() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "root");

		Statement s = c.createStatement();
		
		ResultSet rs = s.executeQuery("SELECT * FROM course");
		
		return rs;
	}
}
