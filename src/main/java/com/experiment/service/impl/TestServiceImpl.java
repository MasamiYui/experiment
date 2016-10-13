package com.experiment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experiment.dao.TeacherMapper;
import com.experiment.domain.Teacher;
import com.experiment.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	TeacherMapper teacherMapper;
	

	@Override
	public Teacher test1(Integer id) {
		Teacher teacher = teacherMapper.selectByPrimaryKey(id);
		return teacher;
	}

}
