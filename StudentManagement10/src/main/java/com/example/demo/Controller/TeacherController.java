package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Teacher;
import com.example.demo.Repository.TeacherRepository;

@RestController
public class TeacherController {
	
	@Autowired
    TeacherRepository teacherRepository;	
	
      @PostMapping("teacher")
	  ResponseEntity getTeacher(@RequestBody Teacher teacher) {
		  teacherRepository.save(teacher);
		  return new ResponseEntity(HttpStatus.CREATED);
	  }
}
