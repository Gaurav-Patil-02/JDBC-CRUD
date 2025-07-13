package com.student.service;

import java.sql.ResultSet;

import com.student.dao.StudentDAO;
import com.student.entity.StudentEntity;

public class StudentService {
	public void insertStudent(StudentEntity student) throws Exception {
		StudentDAO dao = new StudentDAO();
		int rowsAffected = dao.insertStudent(student);

		if (rowsAffected > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Something went wrong");
		}
	}

	public void updateStudent(int rollNo, String whatToUpdate, String toUpdate) throws Exception {
		StudentDAO dao = new StudentDAO();

		int rowsAffected = dao.updateStudent(rollNo, whatToUpdate, toUpdate);
		if (rowsAffected > 0) {
			System.out.println("Data Updated");
		} else {
			System.out.println("Something went wrong");
		}
	}

	public void updateStudent(int rollNo, Long toUpdate) throws Exception {
		StudentDAO dao = new StudentDAO();

		int rowsAffected = dao.updateStudent(rollNo, toUpdate);
		if (rowsAffected > 0) {
			System.out.println("Data Updated");
		} else {
			System.out.println("Something went wrong");
		}
	}

	public void deleteStudent(int rollNo) throws Exception {
		StudentDAO dao = new StudentDAO();
		int rowsAffected = dao.deleteStudent(rollNo);
		if (rowsAffected > 0) {
			System.out.println("Student Details deleted");
		} else {
			System.out.println("Something went wrong");
		}
	}

	public void showStudents() throws Exception {
		StudentDAO dao = new StudentDAO();
		ResultSet rs = dao.showStudents();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4)
					+ "\t" + rs.getString(5) + "\t" + rs.getLong(6) + "\t" + rs.getString(7) + "\t" + rs.getString(8)+"\t");
		}
	}
}
