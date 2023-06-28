package com.student.manage;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class StudentDao {
	public static boolean insertStudenttoDB(Student st) {
		//jdbc code
		boolean f = false;
		try {
			Connection con = CP.createC();
			String q = "insert into students(sname, sphone, scity) values(?,?,?)";
			//Prepared statement because of dynamic query (?)
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set the value of parameters
			
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2,st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			
			//execute
			
			pstmt.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = CP.createC();
			String q = "delete from students where sid = ?";
			//Prepared statement because of dynamic query (?)
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set the value of parameters
			
			pstmt.setInt(1, userId);

			
			//execute
			
			pstmt.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

	public static void showAllStudents() {
		// TODO Auto-generated method stub
		try {
			Connection con = CP.createC();
			String q = "select * from students";
			//statement because of no dynamic query (?)
			
			Statement stmt = con.createStatement();
			
			//execute
			ResultSet set = stmt.executeQuery(q);
			 
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");
				
				System.out.println("ID : "+ id +"\n"
						+ "Name : " + name+"\n"+
						"Phone : " + phone+"\n"+
						"City : " + city);
				System.out.println("++++++++++++++++++++++++");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
