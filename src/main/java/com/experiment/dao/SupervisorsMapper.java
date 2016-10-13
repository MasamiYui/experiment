package com.experiment.dao;

import com.experiment.domain.Supervisors;

public interface SupervisorsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Supervisors record);

    int insertSelective(Supervisors record);

    Supervisors selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Supervisors record);

    int updateByPrimaryKey(Supervisors record);
}