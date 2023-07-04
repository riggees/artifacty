package comy.groupy.artifacty.entity.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import comy.groupy.artifacty.entity.Student;
import comy.groupy.artifacty.entity.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	public StudentRepository SR;

	public Student saveStudent(Student s) {
		
		return SR.save(s);
	}

	public Student getStudentbyReqParam(Long s) {
		// TODO Auto-generated method stub
		return SR.findById(s).get();
	}
	
	@Override
	public Student getStudentbyPathVariable(String pv) {
		// TODO Auto-generated method stub
		return SR.findStudentByStudName(pv);
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return SR.findAll();
	}

	public Student updateStudent(Student s) {
		
		Student stud = SR.findById(s.getStudId()).get();

	        if(Objects.nonNull(s.getDob()) &&
	        !"".equalsIgnoreCase(s.getDob())) {
	        	stud.setDob(s.getDob());
	        }

	        if(Objects.nonNull(s.getStudName()) &&
	    	        !"".equalsIgnoreCase(s.getStudName())) {
	    	        	stud.setStudName(s.getStudName());
	    	        }
	        if(Objects.nonNull(s.getEmail()) &&
	    	        !"".equalsIgnoreCase(s.getEmail())) {
	    	        	stud.setEmail(s.getEmail());
	    	        }

	        if(Objects.nonNull(s.getGender()) &&
	    	        !"".equalsIgnoreCase(s.getGender())) {
	    	        	stud.setGender(s.getGender());
	    	        }

	        if(Objects.nonNull(s.getPassword()) &&
	    	        !"".equalsIgnoreCase(s.getPassword())) {
	    	        	stud.setPassword(s.getPassword());
	    	        }

	        

	        

	        return SR.save(stud);// TODO Auto-generated method stub
		
		
	}

	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		 SR.deleteById(id);
	}

	

	
}
