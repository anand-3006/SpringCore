package com.spring.orm.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.springorm.dao.StudentDao;
import com.spring.orm.springorm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/orm/springorm/config.xml");
    	StudentDao bean = context.getBean("studentDao",StudentDao.class);
    	//to save data into database
//    	Student student=new Student(28,"Anand Shiraganve","SRP");
//    	int insert = bean.insert(student);
//    	System.out.println("the insertion is done!! : "+insert);
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	boolean go=true;
    	while(go) {
    		System.out.println("Press 1 for add new Student!!");
    		System.out.println("Press 2 for display a single Student!!");
    		System.out.println("Press 3 for display All Students!!");
    		System.out.println("Press 4 for delete Student!!");
    		System.out.println("Press 5 for Update Student!!");
    		System.out.println("Press 6 for Exit");
    	try {
    		int in = Integer.parseInt(br.readLine());
    		
			switch (in) {
			case 1:
				//add new Student
				 System.out.println("enter user id : ");
				 int Uid = Integer.parseInt(br.readLine());
				 System.out.println("enter user name : ");
				 String Uname = br.readLine();
				 System.out.println("eneter city : ");
				 String Ucity = br.readLine();
				//creating object and setting values
				 Student s1=new Student();
				s1.setStudentId(Uid);
				s1.setStudentName(Uname);
				s1.setStudentCity(Ucity);
		    	int insert = bean.insert(s1);
		    	//Saving data into database using user Inputs
		    	System.out.println("the insertion is done!!"+"studentId : "
		    			+s1.getStudentId()+" studentName : "+s1.getStudentName()+" studentCity : "+s1.getStudentCity());
				System.out.println("here we added new Student ID : "+insert);
				break;
			case 2:
				//display single Student
				System.out.println("here we are displaying a sing Student using creadentials");
				System.out.println("enter user id : ");
				int userid = Integer.parseInt(br.readLine());
				Student A = bean.getstudent(userid);
				System.out.println("studentId : "+A.getStudentId());
				System.out.println("studentName : "+A.getStudentName());
				System.out.println("studentCity : "+A.getStudentCity());
				System.out.println("_______________________________________________");
				break;
			case 3:
				//Display All Student
				System.out.println("here we are displaying all Students");
				List<Student> all = bean.getAll();
				all.forEach(e->{System.out.println(e.getStudentId());
								System.out.println(e.getStudentName());
								System.out.println(e.getStudentCity());
								System.out.println("------------------------------------");});
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				break;
			case 4:
				//delete Students
				System.out.println("here we are deleting Student Details");
				System.out.println("enter user id : ");
				int usid = Integer.parseInt(br.readLine());
				bean.deleteStudent(usid);
				System.out.println("Deleted!!");
				break;
			case 5:
				//update Studentinsertinsert
				System.out.println("here we are updating existing data of Student");
//				System.out.println("enter studentid : ");
//				int udid = Integer.parseInt(br.readLine());
				Student s2=bean.getstudent(6);
				System.out.println("studentId : "+s2.getStudentId());
				System.out.println("studentName : "+s2.getStudentName());
				System.out.println("studentCity : "+s2.getStudentCity());
				System.out.println("+++++++++++++++++enter values for update++++++++++++++++++++");
				System.out.println("enter studentname : ");
				String name = br.readLine();
				s2.setStudentName(name);
				System.out.println("enter studentcity : ");
				String city = br.readLine();
				s2.setStudentCity(city);
				Student update = bean.Update(s2);
				System.out.println("Student details are updated!!");
				System.out.println("studentID : "+update.getStudentId());
				System.out.println("studentName : "+update.getStudentName());
				System.out.println("studentCity : "+update.getStudentCity());
				System.out.println("___________________________________________");
		
				
				break;
			case 6:
				//Exit
				go=false;
				break;
			}
			
		} catch (Exception e) {
			System.out.println("Invalid Input");
			System.out.println(e.getMessage());
		}
    }
    	System.out.println("Thank u for using my application!!");
    }
}
