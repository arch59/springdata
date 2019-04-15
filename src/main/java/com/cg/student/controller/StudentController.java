package com.cg.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.student.bean.StudentBean;
import com.cg.student.exception.StudentException;
import com.cg.student.service.IStudentService;

@Controller
public class StudentController {

	@Autowired
	IStudentService studentService;

	@RequestMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("home");
	}

	@RequestMapping("/addStudent")
	public ModelAndView addStudent() {
		return new ModelAndView("addStudent", "student", new StudentBean());
	}

	@RequestMapping("/addStudentSuccess")
	public ModelAndView addSuccess(@ModelAttribute StudentBean bean) {
		StudentBean bean2 = new StudentBean();
		ModelAndView view = null;
		bean2 = studentService.addDetails(bean);
		view = new ModelAndView("addSuccess", "student", bean2);
		return view;

	}

	@RequestMapping("/viewAllStudent")
	public ModelAndView viewAllStudentDetails() throws StudentException {
		List<StudentBean> list = studentService.readAll();
		ModelAndView view = new ModelAndView("readAll", "list", list);
		return view;
	}

	@RequestMapping("/viewStudentById")
	public ModelAndView viewStudentById() {
		return new ModelAndView("readById", "student", new StudentBean());
	}

	@RequestMapping("/viewStudent")
	public ModelAndView Student(@ModelAttribute StudentBean student) throws StudentException{
		StudentBean bean = new StudentBean();
		ModelAndView view = null;
		try{
			bean = studentService.readById(student.getStudentId());
			if(bean==null){
				throw new StudentException("Wrong Id");
			}
			view = new ModelAndView("readOne", "student", bean);
		}catch(Exception e){
			throw new StudentException("Wrong Id");
		}
		
		/*@ExceptionHandler(StudentException.class)
		public String showErrorMessage(StudentException exception, Model model) {
			model.addAttribute("message", exception.getMessage());
			return "error";
		}*/
		return view;
	}

	@RequestMapping("/updateStudent")
	public ModelAndView updateStudent() {
		return new ModelAndView("updateById", "student", new StudentBean());
	}

	@RequestMapping("/updateStudentDetails")
	public ModelAndView updateStudentDetails(
			@ModelAttribute("student") StudentBean student)
			throws StudentException {
		ModelAndView view = new ModelAndView();
		try{
			StudentBean student1 = studentService.readById(student.getStudentId());
			if(student1==null){
				throw new StudentException("Wrong Id");
			}view.setViewName("updateStudent");
			view.addObject("student", student1);
		}catch(Exception e){
			throw new StudentException("Wrong Id");
		}
		
		return view;
	}

	@RequestMapping("/updateStudentSuccess")
	public ModelAndView updateStudentSuccess(
			@ModelAttribute("student") StudentBean student)
			throws StudentException {
		StudentBean bean2 = studentService.updateDetails(student);
		ModelAndView view = new ModelAndView("updateStudentSuccess", "student",
				bean2);
		return view;
	}

	@RequestMapping("/deleteStudent")
	public ModelAndView deleteStudent() {
		return new ModelAndView("deleteById", "student", new StudentBean());
	}

	@RequestMapping("/deleteStudentDetails")
	public ModelAndView deleteStudentDetails(
			@ModelAttribute("student") StudentBean student)
			throws StudentException {
		ModelAndView view = new ModelAndView();
		try{
			StudentBean student1 = studentService
					.deleteById(student.getStudentId());
			if(student1==null){
				throw new StudentException("Wrong Id");
			}
			view.setViewName("deleteSuccess");
			view.addObject("student", student1);
		}catch(Exception e){
			throw new StudentException("Wrong Id");
		}
		
		return view;
	}
}
