package com.experiment.dao;

import com.experiment.domain.StudentOfCourse;

public interface StudentOfCourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentOfCourse record);

    int insertSelective(StudentOfCourse record);

    StudentOfCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentOfCourse record);

    int updateByPrimaryKey(StudentOfCourse record);
}