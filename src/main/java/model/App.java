package model;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/beans.xml");
		
		StudentDao stud_dao = (StudentDao)context.getBean("studentDao");
		
		try
		{
			List<Student> student = stud_dao.getAllStudents();
			
			System.out.println("=============================================================================================================");
			System.out.println("Id \t\t Name \t\t Degree \t\t Course \t\t University");
			System.out.println("=============================================================================================================");
			for(Student stud : student)
			{
				System.out.print(stud.getStudentId()+"\t\t"+stud.getStudentName()+"\t\t"+stud.getDegree()+"\t\t"+stud.getCourse()+"\t\t"+stud.getUniversity());
				System.out.println();
			}
			
			System.out.println("Student with Id 3 is : ");
			Student stud = stud_dao.getStudentById(3);
			
			System.out.println("Id : "+stud.getStudentId());
			System.out.println("Name : "+stud.getStudentName());
			System.out.println("Degree : "+stud.getDegree());
			System.out.println("Course : "+stud.getCourse());
			System.out.println("University : "+stud.getUniversity());
		}
		catch(DataAccessException ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
