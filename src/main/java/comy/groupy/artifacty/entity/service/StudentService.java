package comy.groupy.artifacty.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comy.groupy.artifacty.entity.Student;
import comy.groupy.artifacty.entity.repository.StudentRepository;


public interface StudentService {

	public Student saveStudent(Student s);

	public Student getStudentbyReqParam(Long s);

	public Student getStudentbyPathVariable(String pv);

	public List<Student> getAllStudents();

	public Student updateStudent(Student s);

	public void deleteStudent(Long s);

	
	
	
}
