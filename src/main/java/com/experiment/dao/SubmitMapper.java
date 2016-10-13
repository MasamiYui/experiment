package com.experiment.dao;

import com.experiment.domain.Submit;

public interface SubmitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Submit record);

    int insertSelective(Submit record);

    Submit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Submit record);

    int updateByPrimaryKey(Submit record);
}