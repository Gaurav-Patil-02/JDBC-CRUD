package com.jdbccrud.service;

import java.sql.ResultSet;

import com.jdbccrud.dao.StudentDAO;
import com.jdbccrud.model.*;

public class StudentService {
	StudentDAO sd = new StudentDAO();
	Student student = new Student();

	public void insertData(Student student) throws Exception {

		int result = sd.insertData(student);
		if (result > 0) {
			System.out.println("Student Data Inserted");
		} else {
			System.out.println("Something Went Wrong");
		}
	}

	public void updateData(Student student) throws Exception {
		int result = sd.updateData(student);
		if (result > 0) {
			System.out.println("Student Data Updated");
		} else {
			System.out.println("Something Went Wrong");
		}
	}

	public void deleteData(int rollNo) throws Exception {
		int result = sd.DeleteData(rollNo);
		if (result > 0) {
			System.out.println("Student Data Deleted");
		} else {
			System.out.println("Something Went Wrong");
		}
	}

	public void showData() throws Exception {
		ResultSet rs = sd.ShowData();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getString(4));
		}
		System.out.println();

	}
}
