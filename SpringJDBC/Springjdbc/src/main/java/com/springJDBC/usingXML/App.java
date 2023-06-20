package com.springJDBC.usingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("This is main class @@");
       ApplicationContext AS=new ClassPathXmlApplicationContext("com/springJDBC/usingXML/NewFile.xml");
       JdbcTemplate An = AS.getBean("temp",JdbcTemplate.class);
       //inserting values query way 1st
//       String S1=("insert into student(id,name,city) values(?,?,?)");
//       int i=An.update(S1,2,"Amol","CKD");
//       System.out.println("the values are inserted into table using 1st way"+i);
       //inserting values query way 2nd
       String s2=("insert into student(id,name,city) values(3,'Santosh','Kharoshi')");
       int i=An.update(s2);
       System.out.println("the values are inserted into table!!"+i);
    }
}
