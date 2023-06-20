package com.spring.orm.springorm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.springorm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	//Save/Create/Insert data into dataBase
	@Transactional 
	public int insert(Student student) {
		Integer save = (Integer)this.hibernateTemplate.save(student);
		return save;
	}
	//get a sing object from database
	@Transactional
	public Student getstudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	//get All objects from DataBase
	@Transactional
	public List<Student> getAll(){
		List<Student> loadAll = this.hibernateTemplate.loadAll(Student.class);
		return loadAll;
		}
	//Delete data from DataBase
	@Transactional
		public void deleteStudent(int studentId){
			Student student = this.hibernateTemplate.get(Student.class, studentId);
			this.hibernateTemplate.delete(student);
		}
	//Updating dataBase Data
	@Transactional
		public Student Update(Student student) {
			this.hibernateTemplate.update(student);
			return student;
		}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
