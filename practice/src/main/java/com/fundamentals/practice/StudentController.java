package com.fundamentals.practice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springlesson.beans.Student;

@RestController
public class StudentController {
	public static List<Student> students = new ArrayList<Student>();
	
	public StudentController() {
		students.add(new Student("ali", "rezae"));
		students.add(new Student("reza", "rezae"));
		students.add(new Student("mmd", "karami"));
		students.add(new Student("majid", "yaser"));
		students.add(new Student("mohsen", "ahmadi"));
	}
	@GetMapping("/students")
	public List<Student> getStudents(){
		return students;
	}
	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPatthVariable(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name="firstName") String firstName, @RequestParam(name="lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	@PostMapping("/student")
	public void addStudent(@RequestBody Student student) {
		students.add(student);
	}
	
	@PutMapping("/student/{firstName}")
	public void updateStudent(@PathVariable("firstName") String firstName, @RequestBody Student student) {
		students.forEach(s -> {if(s.getFirstName().equals(firstName)) {
			s.setFirstName(student.getFirstName());
			s.setLastName(student.getLastName());
		}});
	}
	
	@DeleteMapping("/student/{firstName}")
	public void delStudent(@PathVariable(value ="firstName") String firstName) {
		for(Student stu : students) {
			if(stu.getFirstName().equals(firstName)) {
				students.remove(stu);
			}
		}
	}

}
