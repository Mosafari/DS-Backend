package com.fundamentals.practice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

}
