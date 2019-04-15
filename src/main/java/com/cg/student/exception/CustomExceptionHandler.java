package com.cg.student.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(value = { Exception.class })
	public String handleConflict(Model model, Exception ex, HttpServletRequest req) {
		String bodyOfResponse = ex.getMessage();
		String uri = req.getRequestURL().toString();

		ErrorDetails errorInfo = new ErrorDetails(uri, bodyOfResponse);
		model.addAttribute("errorInfo", errorInfo);
		return "error";
	}
}
