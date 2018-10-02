package com.tgram.dao;

import com.tgram.entity.Employee;

import java.util.List;

/**
 *<p> Description: 雇员数据访问接口 </p>
 *<p> Copyright: Copyright(c) 2018/9/30 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2018/9/30 23:56
 */
public interface EmployeeDao {

    /**
     * 查询所有的雇员
     * @return
     */
    List<Employee> queryAllEmps();

    /**
     * 通过id查询雇员的对象
     * @param empid
     * @return
     */
    Employee queryEmployeeById(Integer empid);
}
