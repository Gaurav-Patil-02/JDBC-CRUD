package com.jdbccrud.controller;

import java.util.Scanner;

import com.jdbccrud.model.Student;
import com.jdbccrud.service.StudentService;

public class StudentController {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		StudentService service = new StudentService();

		while (true) {
			System.out.println("------CRUD MENU-------");
			System.out.println(
					"1. Insert Student Data\n2. Update Student Data\n3. Delete Student Data\n4. Show Students\n0. exit");
			int ch = scan.nextInt();

			switch (ch) {
			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.println("-------Enter Student Details--------");

				System.out.println("Enter Roll No");
				student.setRollNo(scan.nextInt());
				scan.nextLine();

				System.out.println("Enter Name");
				student.setName(scan.nextLine());

				System.out.println("Enter Standerd");
				student.setStd(scan.nextLine());

				System.out.println("Enter Division");
				student.setDivision(scan.nextLine());

				service.insertData(student);
				break;
			case 2:
				System.out.println("Enter Roll No of student to update Data");
				student.setRollNo(scan.nextInt());
				scan.nextLine();

				System.out.println("Enter name to update");
				student.setName(scan.nextLine());

				System.out.println("Enter standard to update");
				student.setStd(scan.nextLine());

				System.out.println("Enter division to update");
				student.setDivision(scan.nextLine());

				service.updateData(student);
				break;
			case 3:
				System.out.println("Enter Roll NO to delete data");
				int rollNo = scan.nextInt();

				service.deleteData(rollNo);
				break;
			case 4:
				service.showData();
				break;
			default:
				System.out.println("Invalid Input");
			}
		}

	}

}
