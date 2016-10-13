package com.experiment.dao;

import com.experiment.domain.TeacherOfCourse;

public interface TeacherOfCourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacherOfCourse record);

    int insertSelective(TeacherOfCourse record);

    TeacherOfCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeacherOfCourse record);

    int updateByPrimaryKey(TeacherOfCourse record);
}