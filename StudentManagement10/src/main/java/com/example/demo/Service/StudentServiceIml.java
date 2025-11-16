package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Entity.Teacher;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Repository.TeacherRepository;
@Service
public class StudentServiceIml implements StudentService {
@Autowired
StudentRepository studentRepository;
@Autowired
TeacherRepository teacherRepository;
	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		studentRepository.save(s);
	}

	@Override
	public void assignTeacher(int tid, int sid) {
	  Student student=  studentRepository.findById(sid).get();
	Teacher teacher=	teacherRepository.findById(tid).get();
	teacher.getStudent().add(student);
	teacherRepository.save(teacher);
	}

}
