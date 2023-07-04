package comy.groupy.artifacty.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import comy.groupy.artifacty.entity.Student;
import comy.groupy.artifacty.entity.service.StudentService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

	@Autowired
	public StudentService SS;
	
	private static final Logger log= LoggerFactory.getLogger(StudentController.class);

	 @RequestMapping("/")
	    public ModelAndView welcome() {
	        ModelAndView modelAndView = new ModelAndView();
	        modelAndView.setViewName("index.html");
	        return modelAndView;
	    }  
	

	
		@RequestMapping(path = "/register", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")//localhost:8081/saveS{ 
    //"studName": "cd",
    //"studDesc": "Description" }
	public ModelAndView saveStudent(Student s,Model m) {
		System.out.println(s.toString());
		//log.error(s.getStudDesc()+s.getStudName());
			Student s2 =SS.saveStudent(s);
			m.addAttribute("firstname", s2.getStudName());
			m.addAttribute("lastname", s2.getStudId());
			ModelAndView modelAndView = new ModelAndView();
	        modelAndView.setViewName("welcome.html");
	        return modelAndView;
	}
	@GetMapping("/getSbyR") //localhost:8081/getSbyR?s=1
	public Student getStudentbyReqParam(@RequestParam Long s) {
		System.out.println(s);
		Student ss = SS.getStudentbyReqParam(s);
		System.out.println(ss);
		return ss;
	}
	@GetMapping("/getSbyNbyP/{pv}") //localhost:8081/getSbyNbyP/ab
	public Student getStudentbyNamebyPathVariable(@PathVariable String pv) {
		System.out.println(pv+"pv");
		Student s = SS.getStudentbyPathVariable(pv);
		System.out.println(s);
		return s;
	}
	@GetMapping("/getAll")
	public List<Student> getAllStudents() {
		return SS.getAllStudents();
	}
	@PutMapping("/updateS")
	public Student updateStudent(@RequestBody Student s) {
		//System.out.println(s.getStudDesc()+s.getStudName());
		return SS.updateStudent(s);
	}
	@DeleteMapping("/deleteS/{s}")
	public void deleteStudent(@PathVariable Long s) {
		 SS.deleteStudent(s);
	}
	
}
