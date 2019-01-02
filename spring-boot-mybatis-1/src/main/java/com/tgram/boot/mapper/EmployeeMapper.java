package com.tgram.boot.mapper;

import com.tgram.boot.entity.Employee;

public interface EmployeeMapper {
    int insert(Employee record);

    int insertSelective(Employee record);
}