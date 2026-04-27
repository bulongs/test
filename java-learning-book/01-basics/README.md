# 第 1 章：Java 基础入门

本章目标：让你能安装环境、创建 Java 程序、理解基础语法，并写出简单的控制台小程序。

## 1. JDK 安装

JDK 是 Java Development Kit，也就是 Java 开发工具包。写 Java 程序必须先安装 JDK。

### 你需要知道的几个词

- JDK：写 Java 程序需要的工具包
- JRE：运行 Java 程序需要的环境
- JVM：Java 虚拟机，负责真正执行 Java 程序
- `javac`：Java 编译命令，把 `.java` 文件编译成 `.class` 文件
- `java`：Java 运行命令，运行编译后的程序

### 检查是否安装成功

打开终端，输入：

```bash
java -version
javac -version
```

如果能看到版本号，说明安装成功。

### 第一个 Java 程序

创建文件 `HelloWorld.java`：

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

运行：

```bash
javac HelloWorld.java
java HelloWorld
```

你应该看到：

```text
Hello, Java!
```

注意：`public class HelloWorld` 的类名必须和文件名 `HelloWorld.java` 一样。

## 2. IDEA 使用

IDEA 全名 IntelliJ IDEA，是常用的 Java 开发工具。

### 新手常用操作

- New Project：创建新项目
- New Java Class：创建 Java 类
- Run：运行当前程序
- Debug：调试程序
- Project：查看项目文件
- Terminal：打开内置终端

### 建议设置

- 开启自动导包：Auto Import
- 设置字体大小到自己舒服的程度
- 运行程序时先确认当前类里有 `main` 方法

### 一个 Java 文件的基本结构

```java
public class Demo {
    public static void main(String[] args) {
        System.out.println("开始学习 Java");
    }
}
```

先不用急着完全理解 `public static void main(String[] args)`。现在只要记住：它是 Java 程序的入口。

## 3. 变量

变量就是用来存数据的名字。

```java
int age = 18;
String name = "小明";
double score = 95.5;
```

这三行的意思是：

- `age` 存一个整数
- `name` 存一段文字
- `score` 存一个小数

### 变量的基本格式

```java
数据类型 变量名 = 值;
```

例如：

```java
int count = 10;
```

### 变量可以被修改

```java
int age = 18;
age = 19;
System.out.println(age);
```

输出：

```text
19
```

## 4. 数据类型

Java 是强类型语言。变量在声明时必须说明它存什么类型的数据。

### 常见基本类型

| 类型 | 说明 | 示例 |
| --- | --- | --- |
| `byte` | 小整数 | `byte a = 10;` |
| `short` | 较小整数 | `short b = 100;` |
| `int` | 常用整数 | `int age = 18;` |
| `long` | 大整数 | `long money = 100000L;` |
| `float` | 单精度小数 | `float price = 9.9f;` |
| `double` | 常用小数 | `double score = 95.5;` |
| `char` | 单个字符 | `char level = 'A';` |
| `boolean` | 布尔值 | `boolean passed = true;` |

### 字符串类型

`String` 用来表示一段文字：

```java
String message = "你好，Java";
```

`String` 不是基本类型，但新手阶段非常常用。

## 5. 运算符

运算符就是用来计算、比较、判断的符号。

### 算术运算符

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

注意：两个整数相除，结果还是整数。`10 / 3` 得到 `3`，不是 `3.333`。

### 比较运算符

```java
System.out.println(10 > 3);  // true
System.out.println(10 == 3); // false
System.out.println(10 != 3); // true
```

常见比较运算符：

- `>` 大于
- `<` 小于
- `>=` 大于等于
- `<=` 小于等于
- `==` 等于
- `!=` 不等于

### 逻辑运算符

```java
int age = 20;
boolean hasTicket = true;

System.out.println(age >= 18 && hasTicket);
System.out.println(age < 18 || hasTicket);
System.out.println(!hasTicket);
```

常见逻辑运算符：

- `&&` 并且
- `||` 或者
- `!` 取反

## 6. if / switch

程序默认从上往下执行。`if` 和 `switch` 可以让程序根据条件选择不同路线。

### if

```java
int score = 85;

if (score >= 90) {
    System.out.println("优秀");
} else if (score >= 60) {
    System.out.println("及格");
} else {
    System.out.println("不及格");
}
```

### switch

`switch` 适合处理固定选项。

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("星期一");
        break;
    case 2:
        System.out.println("星期二");
        break;
    case 3:
        System.out.println("星期三");
        break;
    default:
        System.out.println("未知日期");
}
```

`break` 的作用是结束当前分支。如果漏写，程序可能继续执行后面的 `case`。

## 7. for / while

循环用来重复执行代码。

### for 循环

适合知道循环次数的情况。

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("第 " + i + " 次学习 Java");
}
```

### while 循环

适合不确定循环次数，但知道结束条件的情况。

```java
int count = 1;

while (count <= 5) {
    System.out.println("count = " + count);
    count++;
}
```

### break 和 continue

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

- `continue`：跳过本次循环
- `break`：结束整个循环

## 8. 数组

数组用来保存多个相同类型的数据。

```java
int[] scores = {90, 85, 70, 100};
```

### 访问数组元素

```java
System.out.println(scores[0]); // 90
System.out.println(scores[1]); // 85
```

数组下标从 `0` 开始。

### 遍历数组

```java
for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}
```

### 增强 for 循环

```java
for (int score : scores) {
    System.out.println(score);
}
```

增强 for 循环更简洁，但拿不到当前下标。

## 9. 字符串

字符串用 `String` 表示。

```java
String name = "Java";
System.out.println(name.length());
System.out.println(name.charAt(0));
System.out.println(name.toUpperCase());
```

### 字符串拼接

```java
String name = "小明";
int age = 18;

System.out.println(name + "今年" + age + "岁");
```

### 字符串比较

比较字符串内容时，用 `equals`：

```java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b));
```

新手要记住：字符串内容比较不要用 `==`。

## 10. 方法

方法就是一段可以重复使用的代码。

### 方法的基本格式

```java
返回值类型 方法名(参数列表) {
    方法体
}
```

### 无返回值方法

```java
public static void sayHello() {
    System.out.println("你好，Java");
}
```

调用：

```java
sayHello();
```

### 有返回值方法

```java
public static int add(int a, int b) {
    return a + b;
}
```

调用：

```java
int result = add(10, 20);
System.out.println(result);
```

### 方法的好处

- 减少重复代码
- 让程序结构更清楚
- 方便以后修改和维护

## 本章综合示例

代码在：

- [BasicSyntaxDemo.java](examples/BasicSyntaxDemo.java)
- [ControlFlowDemo.java](examples/ControlFlowDemo.java)
- [ArrayStringMethodDemo.java](examples/ArrayStringMethodDemo.java)

你可以进入 `java-learning-book/01-basics/examples` 目录运行：

```bash
javac BasicSyntaxDemo.java
java BasicSyntaxDemo
```

其他示例同理。

## 本章练习

### 练习 1：个人信息输出

定义变量保存你的姓名、年龄、身高、是否学生，然后输出一段自我介绍。

### 练习 2：成绩判断

定义一个分数：

- `90` 分及以上输出 `优秀`
- `60` 到 `89` 输出 `及格`
- `60` 以下输出 `继续努力`

### 练习 3：星期判断

使用 `switch`，根据数字 `1` 到 `7` 输出星期几。

### 练习 4：求和

使用 `for` 循环计算 `1` 到 `100` 的和。

### 练习 5：数组最大值

定义一个整数数组，找出里面最大的数字。

### 练习 6：字符串判断

定义一个字符串，判断它是否等于 `"Java"`。

### 练习 7：方法练习

写一个方法 `max(int a, int b)`，返回两个整数中更大的那个。

## 本章过关标准

学完这一章后，你应该能做到：

- 知道 JDK、JRE、JVM 的区别
- 能运行一个 Java 文件
- 能声明变量并使用常见数据类型
- 能使用基本运算符
- 能写 `if` 和 `switch`
- 能写 `for` 和 `while`
- 能创建和遍历数组
- 能使用 `String` 的常见方法
- 能自己定义和调用方法
