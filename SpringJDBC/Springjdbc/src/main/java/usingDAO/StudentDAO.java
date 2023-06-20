package usingDAO;

import java.util.List;

import com.springJDBC.usingXML.Student;

public interface StudentDAO {
public int insert(Student student);
public int alter(Student student);
public int delete(int id);
public Student getStudentID(int studentid);
public List<Student> getAll();
public List<Student> deleteAll();

}
