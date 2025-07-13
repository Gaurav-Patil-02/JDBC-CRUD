package com.student.controller;

import java.util.Scanner;

import com.student.entity.StudentEntity;
import com.student.service.StudentService;

public class StudentController {
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------------------------------");
			System.out.println(
					"1. Insert Student Details\n2. Update Student Details\n3. Delete Student Details\n4. Show All Students\n0. Quite");
			System.out.println("------------------------------------------------");
			int ch = scan.nextInt();

			switch (ch) {
			case 0:
				System.out.println("Exiting....");
				System.exit(0);
			case 1:
				StudentService insert = new StudentService();
				StudentEntity student = new StudentEntity();

				System.out.println("Enter Student Details");
				System.out.println("1. Roll Number");
				student.setRollNo(scan.nextInt());
				scan.nextLine();
				System.out.println("2. Student Name");
				student.setName(scan.nextLine());
				System.out.println("3. Student Address");
				student.setAddress(scan.nextLine());
				System.out.println("4. Student Degree");
				student.setDegree(scan.nextLine());
				System.out.println("5. Field of study");
				student.setFeild(scan.nextLine());
				System.out.println("6. Mobile Number");
				student.setMobNo(scan.nextLong());
				scan.nextLine();
				System.out.println("7. Student Email");
				student.setEmail(scan.nextLine());
				System.out.println("8. Grade");
				student.setGrade(scan.nextLine());
				
				
				insert.insertStudent(student);
				break;
			case 2:
				StudentService update = new StudentService();
//				StudentEntity updateStudent = new StudentEntity();
				
				System.out.println("Enter Roll No of Student to Update");
				int rollNO = scan.nextInt();
				scan.nextLine();
				System.out.println("What you want to update? (Roll No. Cannot be change)");
				String whatToUpdate = scan.nextLine();
				String whatToUpdate1 = whatToUpdate.toLowerCase();
				System.out.println(whatToUpdate1);
				if(whatToUpdate1.equals("mobno")) {
					System.out.println("Enter Mobile Number");
						long mobNo = scan.nextLong();
						update.updateStudent(rollNO, mobNo);
						break;
					}
				else {
					System.out.println("Enter Details");
					String toUpdate = scan.nextLine();
					update.updateStudent(rollNO, whatToUpdate1, toUpdate);
					break;
				}
				
			case 3:
				StudentService delete = new StudentService();
				System.out.println("Enter roll No to delete");
				int rollNo = scan.nextInt();
				delete.deleteStudent(rollNo);
				break;
			case 4:
				StudentService list = new StudentService();
				list.showStudents();
				break;
			default:
				System.out.println("Invalid Input");
			}
			
		}

	}
}
