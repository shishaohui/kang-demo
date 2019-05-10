package kang.demo;

public class DateTppe {
    /*
     * java八种数据类型
     * 1.byte:类型用在大型数组中节约空间，主要代替整数 byte变量占用的空间只有int的四分之一 数据类型8位
     *
     * 2.short：数据类型也可以像short节省空间 一个short变量是int型变量的二分之一 数据类型16位
     *
     * 3.int:一般整数类型默认int类型 数据类型32位
     *
     * 4.long:使用需要比较大整数类型上 数据类型64
     *
     * 5.float:数据类型位单精度，不能用来表示精确的值 数据类型32位
     *
     * 6。double：数据类型为双精度 数据类型为64 同样不能表示精确的值
     *
     * 7。boolean: boolean数据类型表示一位的信息 只有两个取值 ture和false情况 默认false
     *
     * 8。char：char类型是单一的64位unicode字符 char数据类型可以储存任何字符
     * */
    static int i;
    static float f;
    static double d;
    static boolean b;
    static long l;
    static byte by;
    static short s;
    byte aba = 60;

    public static void main(String[] args) {
        //bytp  长度：size 最小值： MIN_VALUE  最大值：MAX_VALUE
        System.out.println("基本类型byte 二进制位数" + Byte.SIZE);
        System.out.println("最小值" + Byte.MIN_VALUE);
        System.out.println("最大值" + Byte.MAX_VALUE);
        //short
        System.out.println("基本数据类型short 二进制位数" + Short.SIZE);
        //默认值
        System.out.println("int:" + i);
        System.out.println("double:" + d);
        System.out.println("boolean:" + b);
        System.out.println("long:" + l);
        System.out.println("byte:" + b);
        System.out.println("short:" + s);
        //强制转换
        int in = 130;// int赋值为130转换位-126？
        byte b = (byte) in;
        System.out.println("输出值" + b);
        //java局部变量
        DateTppe det = new DateTppe();
        det.dogaAge();
    }

    public void dogaAge() {
        int age = 0;
        age = age + 5;
        System.out.println("小狗的年龄是" + age);
        DateTppe max = new DateTppe();
        max.maxAgez();
    }

    public void maxAgez() {
        int age1 = 0;
        age1 = age1 + 8;
        System.out.println("小mao的年龄是" + age1);

    }

}
