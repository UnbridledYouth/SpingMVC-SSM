package com.tgram.entity;

import java.util.Date;

/**
 *<p> Description: 雇员实体类 </p>
 *<p> Copyright: Copyright(c) 2018/9/30 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2018/9/30 17:16
 */
public class Employee {

    private Integer empid;  //雇员编号
    private String empname; //雇员姓名
    private double empsalary; //雇员薪资
    private Date empbirth; // 雇员

    public Employee() {
    }

    public Employee(Integer empid, String empname, double empsalary, Date empbirth) {
        this.empid = empid;
        this.empname = empname;
        this.empsalary = empsalary;
        this.empbirth = empbirth;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(double empsalary) {
        this.empsalary = empsalary;
    }

    public Date getEmpbirth() {
        return empbirth;
    }

    public void setEmpbirth(Date empbirth) {
        this.empbirth = empbirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", empsalary=" + empsalary +
                ", empbirth=" + empbirth +
                '}';
    }
}
