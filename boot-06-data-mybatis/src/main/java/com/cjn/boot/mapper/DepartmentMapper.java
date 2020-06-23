package com.cjn.boot.mapper;

import com.cjn.boot.entity.Department;
import org.apache.ibatis.annotations.*;

// @Mapper  // 制定这是一个操作数据库的mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    Department getDeptById(Integer id);

    @Delete("delete from department where id = #{id}")
    int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id") // id自增，再写入Department
    @Insert("insert into department(departmentName) values(#{departmentName})")
    int insertDept(Department department);

    @Update("update department set departmentName = #{departmentName} where id = #{id}")
    int updateDept(Department department);
}
