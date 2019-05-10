package kang.demo;

import java.io.*;

public class EmployeeTestService {
     String name;
     public  Employee(String name){
         System.out.println("jjjjj"+name);

}
     public static void main(String[] args) {
        /* 使用构造器创建两个对象 */
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");
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
        empOne.setDesignation("菜鸟程序员");
        empTwo.setSalary(500);
        empTwo.printEmployee();
        System.out.println(empOne.toString());
    }
}