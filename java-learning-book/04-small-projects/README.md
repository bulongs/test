# 第 4 章：控制台小项目

本章目标：把前面学到的语法组合起来，做出能运行、能交互的小程序。

## 为什么要做小项目

只看语法很容易懂，但写项目时你会遇到真实问题：

- 数据放在哪里
- 方法怎么拆
- 输入错误怎么办
- 循环什么时候结束
- 如何让代码更容易修改

这些问题都要靠练习解决。

## 项目 1：学生管理系统

功能目标：

- 添加学生
- 查看学生列表
- 按姓名查找学生
- 删除学生
- 退出系统

示例代码在：

- [student-manager/src/StudentManagerApp.java](student-manager/src/StudentManagerApp.java)

运行：

```bash
cd java-learning-book/04-small-projects/student-manager/src
javac StudentManagerApp.java
java StudentManagerApp
```

## 项目 2：图书管理系统

功能目标：

- 添加图书
- 查看所有图书
- 按书名搜索
- 借出图书
- 归还图书

建议类：

- `Book`
- `BookManager`
- `BookManagerApp`

练习重点：

- 使用类封装图书信息
- 使用 `ArrayList` 保存多本书
- 使用方法拆分功能

## 项目 3：记账本

功能目标：

- 添加收入
- 添加支出
- 查看明细
- 统计余额

建议类：

- `Record`
- `AccountBook`
- `AccountBookApp`

练习重点：

- 使用 `double` 保存金额
- 使用字符串保存备注
- 使用循环菜单处理用户输入

## 项目 4：文件版通讯录

功能目标：

- 添加联系人
- 查看联系人
- 按姓名搜索
- 保存到文件
- 从文件读取

建议类：

- `Contact`
- `ContactService`
- `ContactApp`

练习重点：

- 使用 `ArrayList`
- 使用 `Files.writeString`
- 使用 `Files.readString`
- 处理文件不存在的情况

## 做项目的顺序

1. 先写菜单
2. 再写数据类
3. 再写添加和查看
4. 最后补查找、删除、保存等功能

不要一开始就追求完美。先让程序跑起来，再慢慢优化。

## 本章练习

### 练习 1：改学生管理系统

给学生增加分数字段，并支持按分数从高到低输出。

### 练习 2：完成图书管理系统

根据上面的功能目标，独立写出完整控制台程序。

### 练习 3：完成记账本

增加“按收入或支出类型筛选”的功能。

### 练习 4：通讯录保存文件

程序退出前保存联系人，下次启动时自动读取。

## 本章过关标准

- 能写控制台菜单
- 能使用 `Scanner` 接收输入
- 能使用 `ArrayList` 管理数据
- 能把功能拆成多个方法
- 能独立完成一个 100 行以上的小程序
