package kang.demo.service;

import kang.demo.demo;
import kang.demo.domain.Employee;

public class EmployeeTestService {

     public static void main(String[] args) {
        /* 使用构造器创建两个对象 */
        Employee empOne = new Employee();
        Employee empTwo = new Employee();
        empOne.setName("shishaokang");
        empTwo.setName("shishaohui");
        demo emm = new demo("haha");

        // 调用这两个对象的成员方法
//        empOne.empAge(26);
//        empOne.empDesignation("高级程序员");
//        empOne.empSalary(1000);
//        emm.demoAge(19);
        empOne.setAge(26);
        empOne.setDesignation("高级程序员");
        empOne.setSalary(1000);
        empOne.printEmployee();
//        empTwo.empAge(21);
//        empTwo.empDesignation("菜鸟程序员")

//        empTwo.empSalary(500);
        empTwo.setAge(21);
        empTwo.setDesignation("菜鸟程序员");
        empTwo.setSalary(500);
        empTwo.printEmployee();
        System.out.println(empOne.toString());
    }
}