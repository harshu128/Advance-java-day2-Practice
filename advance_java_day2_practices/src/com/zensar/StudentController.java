package com.zensar;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.zensar.bean.Student;

public class StudentController extends HttpServlet{

	

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("I am inside doGet() method now...");
		StudentRepository studentRepository = new StudentRepository();
		List<Student> listOfAllStudent = studentRepository.getAllStudent();
		System.out.println("listOfAllStudent:"+listOfAllStudent);
		
		RequestDispatcher rd = request.getRequestDispatcher("viewAllStudents.jsp");
		request.setAttribute("listOfAllStudent", listOfAllStudent);
		try {
		rd.forward(request, response);
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
		}

	

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		int roll_number=Integer.parseInt(request.getParameter("roll_number"));
		String student_name=request.getParameter("student_name");
		String course=request.getParameter("course");
		int duration=Integer.parseInt(request.getParameter("duration"));
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		String hometown=request.getParameter("hometown");
		
		
		System.out.println("roll_number:"+roll_number);
		System.out.println("student_name:"+student_name);
		System.out.println("course:"+course);
		System.out.println("duration:"+duration);
		System.out.println("age:"+age);
		System.out.println("gender:"+gender);
		System.out.println("hometown:"+hometown);
		
		
		StudentRepository studentRepository=new StudentRepository();
		Student student=new Student(roll_number, student_name, course, duration, age,gender,hometown);
		studentRepository.addStudent(student);
		
		RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
		try {
		rd.forward(request, response);
	}catch(Exception e) {
		System.out.println("Exceprtion occured:"+e);
	}
	}
}
