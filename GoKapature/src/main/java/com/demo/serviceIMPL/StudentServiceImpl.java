package com.demo.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao sDao;
}
