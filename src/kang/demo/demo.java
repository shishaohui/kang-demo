package kang.demo;

import java.io.*;

public class demo {
    int demoAge;
    public  demo(String name){
//            这个构造器仅有一个参数：name
        System.out.println("我的名字是：" + name);
    }
    public  void setAge(int age){
        demoAge = age;
    }
    public   int getAge(){
        System.out.println("年龄为："+ demoAge);
        return  demoAge;
    }
    public static void main(String[] args){

        /*1.创建对象
        *2.通过方法设定age
        * 3.调用get方法获取age
        */
        demo myDemo= new demo("石少康");
        myDemo.setAge(18);
        myDemo.getAge();

        System.out.println("年龄：" + myDemo.demoAge);

    }



}
