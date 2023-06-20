package usingDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springJDBC.usingXML.Student;
@Component("Anan")
public class StudentDAOIMPL implements StudentDAO{
	@Autowired
	private JdbcTemplate jdbcTemplet;	
	public JdbcTemplate getJdbcTemplet() {
		return jdbcTemplet;
	}
	public void setJdbcTemplet(JdbcTemplate jdbcTemplet) {
		this.jdbcTemplet = jdbcTemplet;
	}
	public int insert(Student student) {
		//inserting data
			String s1=("insert into student(id,name,city) values(?,?,?)")	;
			int i=this.jdbcTemplet.update(s1,student.getId(),student.getName(),student.getCity());
		return i;
	}
	public int alter(Student student) {
		// update data
		String S2="update student set name=?, city=? where id=?";
		int r = this.jdbcTemplet.update(S2,student.getName(),student.getCity(),student.getId());
		return r;
	}
	public int delete(int id) {
		// Delete
		String S3="delete from student where id=?";
		int U = this.jdbcTemplet.update(S3,id);
		return U;
	}
	public Student getStudentID(int studentid) {
		// selecting single object
		String Qu="select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplet.queryForObject(Qu, rowMapper,studentid);
		return student;
	}
	public List<Student> getAll() {
		// selecting multiple objects
		String S1="select * from student";
		List<Student> students = this.jdbcTemplet.query(S1, new RowMapperImpl());
		return students;
	}
	public List<Student> deleteAll() {
		//delete all from table
		String D="delete ";
		return null;
	}
	
	

}
