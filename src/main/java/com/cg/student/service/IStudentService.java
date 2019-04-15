package com.cg.student.service;

import java.util.List;

import com.cg.student.bean.StudentBean;

public interface IStudentService {

	StudentBean addDetails(StudentBean bean);

	List<StudentBean> readAll();

	StudentBean readById(String studentId);

	StudentBean updateDetails(StudentBean student);

	StudentBean deleteById(String studentId);

}
