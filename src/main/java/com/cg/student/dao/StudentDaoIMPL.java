package com.cg.student.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.student.bean.StudentBean;

@Repository
public class StudentDaoIMPL implements IStudentDAO {

	@Autowired
	UserRepository userRepository;
	/*
	 * Author = Capgemini
	 * Date= 10/04/2019
	 * This Method inserts data to database  
	 *  
	 */
	@Override
	public StudentBean addDetails(StudentBean bean) {
		return userRepository.save(bean);
	}

	/*
	 * Author = Capgemini
	 * Date= 10/04/2019
	 * This Method reads all data in database  
	 *  
	 */
	@Override
	public List<StudentBean> readAll() {
		List<StudentBean> list = new ArrayList<StudentBean>();
		userRepository.findAll().forEach(list::add);
		return list;
	}

	/*
	 * Author = Capgemini
	 * Date= 10/04/2019
	 * This Method inserts data by Id from database  
	 *  
	 */
	@Override
	public StudentBean readById(String studentId) {
		StudentBean bean = userRepository.findOne(studentId);
		return bean;
	}

	/*
	 * Author = Capgemini
	 * Date= 10/04/2019
	 * This Method inserts updates to database  
	 *  
	 */
	@Override
	public StudentBean updateDetails(StudentBean student) {
		 userRepository.findOne(student.getStudentId());
		return userRepository.save(student);
	}

	/*
	 * Author = Capgemini
	 * Date= 10/04/2019
	 * This Method deletes data to database  
	 *  
	 */
	@Override
	public StudentBean deleteById(String studentId) {
		StudentBean bean = userRepository.findOne(studentId);
		userRepository.delete(bean);
		return bean;
	}

}
