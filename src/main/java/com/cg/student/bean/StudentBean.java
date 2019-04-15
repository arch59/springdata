package com.cg.student.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class StudentBean {

	@Id
	private String studentId;
	private String studentName;
	private String studentCity;
	private String studentCollege;
	private String studentDomain;
	private String studentMobile;

	public StudentBean() {
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public String getStudentCollege() {
		return studentCollege;
	}

	public void setStudentCollege(String studentCollege) {
		this.studentCollege = studentCollege;
	}

	public String getStudentDomain() {
		return studentDomain;
	}

	public void setStudentDomain(String studentDomain) {
		this.studentDomain = studentDomain;
	}

	public String getstudentMobile() {
		return studentMobile;
	}

	public void setstudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	public StudentBean(String studentId, String studentName,
			String studentCity, String studentCollege, String studentDomain,
			String studentMobile) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentCollege = studentCollege;
		this.studentDomain = studentDomain;
		this.studentMobile = studentMobile;
	}

}
