package com.cg.student.dao;


import org.springframework.data.repository.CrudRepository;

import com.cg.student.bean.StudentBean;

public interface UserRepository extends CrudRepository<StudentBean, String>{

}
