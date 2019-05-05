package kang.demo;

public class demo {
    public  demo(String name){
//            这个构造器仅有一个参数：name
        System.out.println("我的名字是：" + name);

    }
    public static void main(String[] args){
        demo myPuppy= new demo("石少康");
    }
}
