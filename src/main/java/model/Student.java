package model;

public class Student {

	private int studentId;
	private String studentName;
	private String degree;
	private String course;
	private String university;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", degree=" + degree + ", course="
				+ course + ", university=" + university + "]";
	}

	public Student(int studentId, String studentName, String degree, String course, String university) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.degree = degree;
		this.course = course;
		this.university = university;
	}
	
	public Student(String studentName, String degree, String course, String university) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.degree = degree;
		this.course = course;
		this.university = university;
	}
	
	public Student()
	{
		
	}
	
	

}
