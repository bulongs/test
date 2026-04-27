// 这个示例演示抽象类、接口和多态。
public class ShapeDemo {
    public static void main(String[] args) {
        // 父类引用指向子类对象：这是多态。
        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(3);

        printArea(rectangle);
        printArea(circle);

        Payable payTool = new AliPay();
        payTool.pay(88.5);
    }

    /**
     * 打印图形面积。
     *
     * @param shape 任意一种 Shape 子类对象
     */
    public static void printArea(Shape shape) {
        // 这里调用 area 时，实际执行的是具体子类的 area 方法。
        System.out.println("面积：" + shape.area());
    }
}

// abstract class 表示抽象类。抽象类通常用来定义共同规则。
abstract class Shape {
    // abstract 方法没有方法体，要求子类必须自己实现。
    public abstract double area();
}

// Rectangle 继承 Shape，并实现 area 方法。
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 计算矩形面积。
    public double area() {
        return width * height;
    }
}

// Circle 继承 Shape，并实现 area 方法。
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // 计算圆形面积。
    public double area() {
        return 3.14 * radius * radius;
    }
}

// interface 表示接口。接口常用来定义一种能力。
interface Payable {
    // 实现 Payable 的类，都必须提供 pay 方法。
    void pay(double money);
}

// AliPay 实现 Payable 接口，表示它拥有支付能力。
class AliPay implements Payable {
    public void pay(double money) {
        System.out.println("支付宝支付：" + money + "元");
    }
}
