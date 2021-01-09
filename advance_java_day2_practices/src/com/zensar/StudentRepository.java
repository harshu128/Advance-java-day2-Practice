package com.zensar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zensar.bean.Student;
import com.zensar.utility.DBUtil;

public class StudentRepository {
	
	public void addStudent(Student student)
	{
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "insert into student values(?,?,?,?,?,?,?)";
		try {
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, student.getRoll_number());
		pst.setString(2, student.getStudent_name());
		pst.setString(3, student.getCourse());
		pst.setInt(4, student.getDuration());
		pst.setInt(5, student.getAge());
		pst.setString(6, student.getGender());
		pst.setString(7, student.getHometown());
		
		int result=pst.executeUpdate();
		if(result==0) {
			System.out.println("database opeartion failed");
		}
		else
		{
			System.out.println("database operation successful");
		}
		}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
	}
}

	public List<Student> getAllStudent(){
		List<Student> listOfAllStudent = new ArrayList<Student>();
		// jdbc code to fetch all employees from db and add them to this list
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from student";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int roll_number = rs.getInt("roll_number");
				String student_name = rs.getString("student_name");
				String course = rs.getString("course");
				int duration = rs.getInt("duration");
				int age = rs.getInt("age");
				String gender=rs.getString("gender");
				String hometown=rs.getString("hometown");
				Student student = new Student(roll_number, student_name, course, duration, age,gender,hometown);
				listOfAllStudent.add(student);
			}
		}catch(Exception e) {
	System.out.println("Exception Occured:"+e);
}
System.out.println("listOfAllStudent:"+listOfAllStudent);
return listOfAllStudent;
}
}


