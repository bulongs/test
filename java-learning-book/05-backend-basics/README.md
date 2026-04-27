# 第 5 章：数据库和后端入门

本章目标：知道 Java 后端开发需要哪些基础，并能理解每个工具解决什么问题。

## 1. MySQL

MySQL 是常见的关系型数据库。后端程序通常把用户、订单、商品等数据保存到数据库里。

### 常用 SQL

```sql
CREATE TABLE student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    score INT
);

INSERT INTO student(name, age, score) VALUES ('小明', 18, 90);

SELECT * FROM student;

UPDATE student SET score = 95 WHERE id = 1;

DELETE FROM student WHERE id = 1;
```

学习重点：

- 数据库、表、字段
- 主键
- 增删改查
- `where`
- `order by`
- `limit`

## 2. JDBC

JDBC 是 Java 连接数据库的标准方式。

基本步骤：

1. 加载数据库驱动
2. 获取数据库连接
3. 创建 SQL
4. 执行 SQL
5. 处理结果
6. 关闭资源

示例骨架在：

- [examples/JdbcSkeleton.java](examples/JdbcSkeleton.java)

这个示例不直接运行数据库连接，只用于理解 JDBC 的基本写法。

## 3. Maven

Maven 是 Java 项目管理工具。

它主要解决：

- 管理第三方依赖
- 统一项目结构
- 编译项目
- 运行测试
- 打包项目

常见目录：

```text
src/main/java
src/main/resources
src/test/java
pom.xml
```

常用命令：

```bash
mvn compile
mvn test
mvn package
```

## 4. Git

Git 用来管理代码版本。

常用命令：

```bash
git status
git add .
git commit -m "add java learning notes"
git log --oneline
```

学习重点：

- 工作区
- 暂存区
- 提交
- 分支
- 合并

## 5. Redis

Redis 是常见的内存数据库，常用于缓存。

你现在只需要先知道：

- MySQL 适合长期保存数据
- Redis 适合快速读取临时数据
- 后端项目里经常用 Redis 存验证码、登录状态、热点数据

## 6. Linux

Java 后端项目通常部署在 Linux 服务器上。

常用命令：

```bash
pwd
ls
cd
mkdir
cat
tail
ps
kill
```

## 7. 部署

部署就是把你的项目放到服务器上运行。

常见流程：

1. 本地写代码
2. 打包成 jar
3. 上传到服务器
4. 使用 `java -jar` 启动
5. 查看日志确认是否正常

## 本章练习

### 练习 1：写 SQL

创建一张 `book` 表，字段包含 `id`、`name`、`author`、`price`。

### 练习 2：练习增删改查

对 `book` 表写 4 条 SQL：添加、查询、修改、删除。

### 练习 3：理解 Maven

创建一个 Maven 项目，找到 `pom.xml`，观察项目目录结构。

### 练习 4：练习 Git

初始化一个 Git 仓库，提交一次代码，然后查看提交历史。

### 练习 5：部署思考

写下一个 Java 项目从代码到服务器运行需要经历哪些步骤。

## 本章过关标准

- 能写基本 SQL
- 知道 JDBC 是 Java 连接数据库的方式
- 知道 Maven 负责依赖和构建
- 会使用 Git 保存代码版本
- 知道 Redis、Linux、部署分别解决什么问题
