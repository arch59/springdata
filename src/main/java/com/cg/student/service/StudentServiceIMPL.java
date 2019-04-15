package com.cg.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.student.bean.StudentBean;
import com.cg.student.dao.IStudentDAO;

@Service
public class StudentServiceIMPL implements IStudentService {

	@Autowired
	IStudentDAO studentDAO;

	/*
	 * Author = Capgemini
	 * Date= 10/04/2019
	 * This Method inserts data to database  
	 *  
	 */
	@Override
	public StudentBean addDetails(StudentBean bean) {
		return studentDAO.addDetails(bean);
	}

	/*
	 * Author = Capgemini
	 * Date= 10/04/2019
	 * This Method reads all data in database  
	 *  
	 */
	@Override
	public List<StudentBean> readAll() {
		return studentDAO.readAll();
	}

	/*
	 * Author = Capgemini
	 * Date= 10/04/2019
	 * This Method inserts data by Id from database  
	 *  
	 */
	@Override
	public StudentBean readById(String studentId) {
		return studentDAO.readById(studentId);
	}

	/*
	 * Author = Capgemini
	 * Date= 10/04/2019
	 * This Method inserts updates to database  
	 *  
	 */
	@Override
	public StudentBean updateDetails(StudentBean student) {
		return studentDAO.updateDetails(student);
	}

	/*
	 * Author = Capgemini
	 * Date= 10/04/2019
	 * This Method deletes data to database  
	 *  
	 */
	@Override
	public StudentBean deleteById(String studentId) {
		return studentDAO.deleteById(studentId);
	}

}
