package kang.demo;

import java.io.*;

public class Employee {
    private int demoage1;
    private String name;
    private int age;
    private String designation;
    private double salary;

    // Employee 类的构造器
    public Employee(String name) {
        this.name = name;
    }

    public Employee() {
    }

//    // 设置age的值
//    private void empAge(int empAge) {
//        age = empAge;
//    }
//
//    /* 设置designation的值*/
//    private void empDesignation(String empDesig) {
//        designation = empDesig;
//    }
//
//    /* 设置salary的值*/
//    private void empSalary(double empSalary) {
//        salary = empSalary;
//    }
//
//    public int getDemoage1() {
//        return demoage1;
//    }

    public void setDemoage1(int demoage1) {
        this.demoage1 = demoage1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "demoage1=" + demoage1 +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    /* 打印信息 */
    public void printEmployee() {
        System.out.println("名字:" + name);
        System.out.println("年龄:" + age);
        System.out.println("职位:" + designation);
        System.out.println("薪水:" + salary);
    }
}
