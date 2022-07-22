package com.training.dao;

import java.util.List;

import com.training.bean.Student;

public interface StudentDao {
	public void create(Student s);
	public List<Student> read(int total) ;
	public void update(int regno);
	public void delete(int regno);

}
