package com.cjn.boot.mapper;

import com.cjn.boot.entity.Employee;

// @Mapper | @MapperScan 将接口扫描到容器中
public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    void insertEmp(Employee employee);
}
