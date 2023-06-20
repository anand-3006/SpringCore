package usingDAO.Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springJDBC.usingXML.Student;

import usingDAO.StudentDAO;

public class Main {

	public static void main(String[] args) {
		System.out.println("this is main class~!");
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		StudentDAO AS = context.getBean("Anan",StudentDAO.class);
//		INSERT
//		Student student= new Student();
//		student.setId(3);
//		student.setName("AnandS");
//		student.setCity("Shiraguppi");
//		int result = AS.insert(student);
//		System.out.println("the values inserted into student table using DAO class"+result);
		
		
		
		//UPDATE
//		Student student=new Student();
//		student.setId(1);
//		student.setName("Dinesh");
//		student.setCity("Nippani");
//		int result = AS.alter(student);
//		System.out.println("Updated values of id 1 : "+result);
	
		//DELETE
//		Student student=new Student();
//		int s = AS.delete(9);
//		int s1 = AS.delete(4);
//		System.out.println("the row is deleted : "+s);
//		System.out.println("The row is deleted : "+s1);
		
		//SELECT single object
//		Student student1 = AS.getStudentID(2);
//		 System.out.println("single object"+student1);
////		
		List<Student> all = AS.getAll();
		System.out.println("multiple objects");
		for(Student A:all) {
			System.out.println(A);
		}
	}

}
