package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDao {
	
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource jdbc)
	{
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	
	//Get all students
	public List<Student> getAllStudents()
	{
		return jdbc.query("select * from student", new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Student student = new Student();
				
				student.setStudentId(rs.getInt("student_id"));
				student.setStudentName(rs.getString("student_name"));
				student.setDegree(rs.getString("degree"));
				student.setCourse(rs.getString("course"));
				student.setUniversity(rs.getString("university"));
				return student;
			}
		});
	}
	
	//Get student by id
	public Student getStudentById(int id)
	{
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);
		
		return jdbc.queryForObject("select * from student where student_id = :id", params, new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Student student = new Student();
				
				student.setStudentId(rs.getInt("student_id"));
				student.setStudentName(rs.getString("student_name"));
				student.setDegree(rs.getString("degree"));
				student.setCourse(rs.getString("course"));
				student.setUniversity(rs.getString("university"));
				
				return student;
			}
		});
	}

}
