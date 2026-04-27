# 第 2 章：面向对象基础

本章目标：理解 Java 最重要的编程思想，能用类和对象组织代码。

## 1. 类和对象

类是一类事物的模板，对象是根据模板创建出来的具体东西。

例如：`Student` 是类，小明、小红是对象。

```java
public class Student {
    String name;
    int age;

    void study() {
        System.out.println(name + "正在学习");
    }
}
```

创建对象：

```java
Student student = new Student();
student.name = "小明";
student.age = 18;
student.study();
```

## 2. 构造方法

构造方法用于创建对象时初始化数据。

```java
public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

`this` 表示当前对象。

## 3. 封装

封装就是把属性藏起来，通过方法控制访问。

```java
private String name;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
```

封装的好处：

- 防止外部随便修改数据
- 可以在 setter 里加入校验
- 让类的使用方式更稳定

## 4. 继承

继承可以让子类复用父类的代码。

```java
public class Animal {
    public void eat() {
        System.out.println("吃东西");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("汪汪");
    }
}
```

`Dog` 继承了 `Animal`，所以 `Dog` 对象可以调用 `eat()`。

## 5. 多态

多态指同一个父类引用，可以指向不同子类对象。

```java
Animal animal = new Dog();
animal.eat();
```

多态常用于写更灵活的代码。

## 6. 接口

接口定义一种能力。

```java
public interface Flyable {
    void fly();
}
```

实现接口：

```java
public class Bird implements Flyable {
    public void fly() {
        System.out.println("鸟在飞");
    }
}
```

接口适合描述“能做什么”，比如会飞、会支付、会保存。

## 7. 抽象类

抽象类用于提取共同特征，但它本身通常不直接创建对象。

```java
public abstract class Shape {
    public abstract double area();
}
```

子类必须实现抽象方法：

```java
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}
```

## 8. static 和 final

`static` 属于类，不属于某个具体对象。

```java
public class MathUtil {
    public static int add(int a, int b) {
        return a + b;
    }
}
```

调用：

```java
MathUtil.add(1, 2);
```

`final` 表示最终的。

```java
final int maxAge = 120;
```

被 `final` 修饰的变量不能再被重新赋值。

## 本章示例

- [StudentDemo.java](examples/StudentDemo.java)
- [AnimalDemo.java](examples/AnimalDemo.java)
- [ShapeDemo.java](examples/ShapeDemo.java)

运行示例：

```bash
cd java-learning-book/02-oop/examples
javac StudentDemo.java
java StudentDemo
```

## 本章练习

### 练习 1：创建学生类

创建 `Student` 类，包含姓名、年龄、分数，并提供构造方法和 `showInfo()` 方法。

### 练习 2：封装账户类

创建 `BankAccount` 类，余额使用 `private` 修饰，提供存钱和取钱方法。取钱时余额不能小于 0。

### 练习 3：继承练习

创建父类 `Vehicle`，子类 `Car` 和 `Bike`，让它们都有 `run()` 方法。

### 练习 4：接口练习

创建接口 `Payable`，里面有 `pay(double money)` 方法。创建 `AliPay` 和 `WeChatPay` 两个实现类。

### 练习 5：抽象类练习

创建抽象类 `Shape`，定义抽象方法 `area()`。创建 `Rectangle` 和 `Circle` 子类计算面积。

## 本章过关标准

- 能解释类和对象的关系
- 能写构造方法
- 能使用 `private`、getter、setter
- 能写简单继承
- 能理解多态的基本用法
- 能写接口和实现类
- 能区分抽象类和接口的常见使用场景
