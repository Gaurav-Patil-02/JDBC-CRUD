package com.jdbccrud.services;

import java.sql.ResultSet;

import com.jdbccrud.dao.CourseDAO;

public class CourseService {
	
	
	
	public void insertCourseDetails() throws Exception {
		CourseDAO cd = new CourseDAO();
		int result = cd.insertCourseDetails();
		
		if(result > 0) {
			System.out.println("Data Inserted Successfully");
		}else {
			System.out.println("Something went wrong");
		}
	}
	
	public void updateCourseDetails() throws Exception {
		CourseDAO cd = new CourseDAO();
		int result = cd.updateCourseDetails();
		
		if(result > 0) {
			System.out.println("Data Updated Successfully");
		}else {
			System.out.println("Something went wrong");
		}
	}
	
	public void deleteCourseDetails() throws Exception{
		CourseDAO cd = new CourseDAO();
		int result = cd.deleteCourseDetails();
		if(result > 0) {
			System.out.println("Data Deleted Successfully");
		}else {
			System.out.println("Something went wrong");
		}
	}
	
	public void getCourseDetails() throws Exception{
		CourseDAO cd = new CourseDAO();
		ResultSet result = cd.getCourseDetails();
		
		while(result.next()) {
			System.out.println(result.getInt(1)+ "  " + result.getString(2) + "  " + result.getString(3));
		}
	}
	
}
