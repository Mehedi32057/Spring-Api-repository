package com.example;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	StudentDA da;
	@GetMapping("givedata")
	public Student findStudent() {
		da=new StudentDA();
		List<Student> stList=da.findStudent();
		Student s = stList.get(0);
		return s;}
	
		
		@GetMapping("all")
		public List<Student> allFindStudent() {
			da=new StudentDA();
			List<Student> stList=da.allFindStudent();			
			return stList;
		}
		
		@GetMapping("student/{id}")
		public List<Student> findStudentById(@PathVariable int id) {
			da=new StudentDA();
			List<Student> stList=da.findStudentById(id);			
			return stList;
		}
		
		@GetMapping("students/{round}")
		public List<Student> findStudentround(@PathVariable String round) {
			da=new StudentDA();
			List<Student> stList=da.findStudentround(round);			
			return stList;
		}
		
		
	}


