package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDA {

	List<Student> stList;
	Student st;
	Connection con;

	public List<Student> findStudent() {
		stList = new ArrayList<>();
//		st = new Student(100, "Jamal", "jamal@gmail.com", "45");

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
			PreparedStatement pst = con.prepareStatement("Select * from student where id=102");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				st = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				stList.add(st);
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return stList;

	}
	
	public List<Student> allFindStudent() {
		stList = new ArrayList<>();
//		st = new Student(100, "Jamal", "jamal@gmail.com", "45");

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
			PreparedStatement pst = con.prepareStatement("Select * from student ");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				st = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				stList.add(st);
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return stList;

	}
	
	public List<Student> findStudentById(int id) {
		stList = new ArrayList<>();
//		st = new Student(100, "Jamal", "jamal@gmail.com", "45");

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
			PreparedStatement pst = con.prepareStatement("Select * from student where ="+id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				st = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				stList.add(st);
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return stList;

	}
	
	public List<Student> findStudentround(String round) {
		stList = new ArrayList<>();
//		st = new Student(100, "Jamal", "jamal@gmail.com", "45");

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
			PreparedStatement pst = con.prepareStatement("Select * from student where round ="+round);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				st = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				stList.add(st);
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return stList;

	}
	


}
