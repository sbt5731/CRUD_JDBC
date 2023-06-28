package com.studentmanagement;

import java.io.*;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App");
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to ADD students");
			System.out.println("Press 2 to DELETE students");
			System.out.println("Press 3 to DISPLAY students");
			System.out.println("Press 4 to EXIT app");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				// add students
				  System.out.println("Enter username: ");
				  String name = br.readLine();	
				  
				  System.out.println("Enter user phone number: ");
				  String phone = br.readLine();
				  
				  System.out.println("Enter user city: ");
				  String city = br.readLine();
				  
				  Student st = new Student(name,phone,city);
				  boolean answer = StudentDao.insertStudenttoDB(st);
				  if(answer) System.out.println("Successfully added the Student in the database");
				  else {
					  System.out.println("Something went wrong, try again");
				  }
				  System.out.println(st);
				
			}else if(c==2) {
				//delete students
				System.out.println("Enter userID to DELETE");
				int userId = Integer.parseInt(br.readLine());
				boolean answer = StudentDao.deleteStudent(userId);
				if(answer) System.out.println("Successfully deleted the sudent information from the database");
				else {
					System.out.println("Something went wrong please try again");
				}
			} else if(c==3) {
				//display students
				StudentDao.showAllStudents();
				
				
			} else if(c==4) {
				// exit
				break;
			}else {
				
			}
		}
		System.out.println("Thank you for using app \nSee you soon bye");
	}

}
