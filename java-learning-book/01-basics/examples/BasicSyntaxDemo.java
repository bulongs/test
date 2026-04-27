// public class 表示定义一个公开的类，类名要和文件名 BasicSyntaxDemo.java 一致。
public class BasicSyntaxDemo {
    // main 方法是程序入口。点击运行时，Java 会从这里开始执行代码。
    public static void main(String[] args) {
        // 下面这些是变量：用一个名字保存一份数据。
        int age = 18;
        double height = 1.75;
        char level = 'A';
        boolean isStudent = true;
        String name = "小明";

        // System.out.println 用来把内容打印到控制台。
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("身高：" + height);
        System.out.println("等级：" + level);
        System.out.println("是否学生：" + isStudent);

        int a = 10;
        int b = 3;

        // 算术运算符：加、减、乘、除、取余。
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 比较运算符的结果是 boolean，也就是 true 或 false。
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }
}
