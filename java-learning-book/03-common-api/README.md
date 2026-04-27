# 第 3 章：Java 常用 API

本章目标：掌握 Java 日常开发中最常用的一批工具类和语法。

## 1. String

`String` 用来处理字符串。

```java
String name = "Java";
System.out.println(name.length());
System.out.println(name.contains("Ja"));
System.out.println(name.substring(0, 2));
```

常用方法：

- `length()`：长度
- `charAt(index)`：取某个字符
- `contains(text)`：是否包含
- `substring(start, end)`：截取
- `equals(text)`：比较内容
- `split(text)`：分割
- `trim()`：去掉前后空格

## 2. ArrayList

`ArrayList` 是可以变长的列表，比数组更灵活。

```java
ArrayList<String> names = new ArrayList<>();
names.add("小明");
names.add("小红");
System.out.println(names.get(0));
```

常用方法：

- `add(value)`：添加
- `get(index)`：获取
- `set(index, value)`：修改
- `remove(index)`：删除
- `size()`：数量

## 3. HashMap

`HashMap` 用来保存键值对。

```java
HashMap<String, Integer> scores = new HashMap<>();
scores.put("小明", 90);
scores.put("小红", 95);
System.out.println(scores.get("小明"));
```

适合保存“名字对应分数”“商品编号对应价格”这类数据。

## 4. HashSet

`HashSet` 用来保存不重复的数据。

```java
HashSet<String> names = new HashSet<>();
names.add("小明");
names.add("小明");
System.out.println(names.size());
```

输出是 `1`，因为重复数据只保留一份。

## 5. 时间日期

常用类：

- `LocalDate`：日期
- `LocalTime`：时间
- `LocalDateTime`：日期和时间
- `DateTimeFormatter`：格式化

```java
LocalDate today = LocalDate.now();
System.out.println(today);
```

## 6. 异常处理

异常是程序运行时出现的问题。

```java
try {
    int result = 10 / 0;
    System.out.println(result);
} catch (ArithmeticException e) {
    System.out.println("不能除以 0");
}
```

不要害怕异常。异常提示通常是在告诉你哪里出了问题。

## 7. 文件读写

Java 可以读写本地文件。

```java
Files.writeString(Path.of("note.txt"), "Hello Java");
String content = Files.readString(Path.of("note.txt"));
System.out.println(content);
```

## 本章示例

- [StringDemo.java](examples/StringDemo.java)
- [CollectionDemo.java](examples/CollectionDemo.java)
- [DateExceptionFileDemo.java](examples/DateExceptionFileDemo.java)

运行示例：

```bash
cd java-learning-book/03-common-api/examples
javac StringDemo.java
java StringDemo
```

## 本章练习

### 练习 1：字符串分割

定义字符串 `"小明,小红,小刚"`，使用 `split` 分割并逐个输出。

### 练习 2：学生列表

使用 `ArrayList` 保存 3 个学生姓名，然后添加、修改、删除一个学生。

### 练习 3：成绩表

使用 `HashMap` 保存学生姓名和分数，输出所有学生的成绩。

### 练习 4：去重

使用 `HashSet` 对一组重复姓名去重。

### 练习 5：日期格式化

输出当前时间，格式为 `yyyy-MM-dd HH:mm:ss`。

### 练习 6：异常处理

写一个除法方法，当除数为 0 时输出友好提示。

### 练习 7：文件练习

把一句学习笔记写入文件，再读取出来输出。

## 本章过关标准

- 能熟练使用 `String` 常见方法
- 能使用 `ArrayList` 保存列表数据
- 能使用 `HashMap` 保存键值对
- 能使用 `HashSet` 去重
- 能进行简单时间格式化
- 能写基本 `try-catch`
- 能读写简单文本文件
