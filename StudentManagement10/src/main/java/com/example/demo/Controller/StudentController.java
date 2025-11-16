package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	@PostMapping("getstudent")
	ResponseEntity addStudent(@RequestBody Student s) {
		ss.saveStudent(s);
		return new ResponseEntity(HttpStatus.CREATED);
		
	}
	@GetMapping("teacher/{tid}/{sid}")
	ResponseEntity getTeacher(@PathVariable int tid,@PathVariable int sid) {
		ss.assignTeacher(tid, sid);
		return new ResponseEntity(HttpStatus.CREATED);
	}
}
