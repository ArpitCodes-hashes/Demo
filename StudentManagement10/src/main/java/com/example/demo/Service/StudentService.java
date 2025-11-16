package com.example.demo.Service;

import com.example.demo.Entity.Student;

public interface StudentService {

	void saveStudent(Student s);

	void assignTeacher(int tid, int sid);
}
