# 第 6 章：Spring Boot 学习路线

本章目标：知道 Spring Boot 应该怎么学，避免一上来就迷失在大量注解里。

## 1. Spring Boot 是什么

Spring Boot 是 Java 后端开发中非常常用的框架。

它主要帮你解决：

- 快速创建 Web 项目
- 接收浏览器或前端发来的请求
- 调用业务代码
- 连接数据库
- 返回 JSON 数据

## 2. 先理解一个后端请求流程

一次常见请求大概是这样：

```text
浏览器 / 前端
    -> Controller
    -> Service
    -> Mapper / Repository
    -> 数据库
```

对应职责：

- Controller：接收请求，返回结果
- Service：写业务逻辑
- Mapper：操作数据库
- Entity：表示数据库里的数据
- DTO：表示接口传入或返回的数据

## 3. Controller

Controller 负责接收请求。

```java
@RestController
@RequestMapping("/students")
public class StudentController {
    @GetMapping
    public String list() {
        return "学生列表";
    }
}
```

新手先掌握：

- `@RestController`
- `@RequestMapping`
- `@GetMapping`
- `@PostMapping`
- `@PathVariable`
- `@RequestBody`

## 4. Service

Service 负责业务逻辑。

```java
@Service
public class StudentService {
    public String findAll() {
        return "查询所有学生";
    }
}
```

不要把所有代码都写在 Controller 里。Controller 只负责接请求，业务逻辑尽量放 Service。

## 5. Mapper

Mapper 负责访问数据库。

如果使用 MyBatis，常见写法类似：

```java
@Mapper
public interface StudentMapper {
    List<Student> findAll();
}
```

学习顺序建议：

1. 先会写 SQL
2. 再学 JDBC
3. 再学 MyBatis
4. 最后学 MyBatis-Plus

## 6. 配置文件

Spring Boot 常用 `application.yml` 或 `application.properties` 配置项目。

```yaml
server:
  port: 8080

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/java_learning
    username: root
    password: your_password
```

## 7. 常见项目结构

```text
src/main/java/com/example/demo
  controller
  service
  mapper
  entity
  dto
  DemoApplication.java

src/main/resources
  application.yml
```

## 8. 推荐项目练习路线

### 项目 1：学生管理 API

功能：

- 查询学生列表
- 添加学生
- 修改学生
- 删除学生

先用内存 `ArrayList` 保存数据，不急着连数据库。

### 项目 2：数据库版学生管理 API

把项目 1 的数据保存到 MySQL。

你会练到：

- MySQL
- MyBatis
- Controller
- Service
- Mapper

### 项目 3：登录注册系统

功能：

- 注册
- 登录
- 修改密码
- 查询当前用户信息

你会练到：

- 参数校验
- 密码加密
- 登录状态
- 错误返回

### 项目 4：简单博客系统

功能：

- 发布文章
- 查询文章
- 修改文章
- 删除文章
- 按标题搜索

这是一个非常适合新手的后端综合项目。

## 9. 学 Spring Boot 时不要急

建议顺序：

1. 先写控制台小项目
2. 再学 MySQL
3. 再学 JDBC
4. 再学 Maven
5. 再开始 Spring Boot
6. 最后做完整后端项目

如果你跳过前面基础，Spring Boot 很容易变成“代码能跑，但不知道为什么”。

## 本章练习

### 练习 1：画请求流程

用文字写出一次“查询学生列表”的请求从前端到数据库的过程。

### 练习 2：设计接口

设计学生管理 API：

- 查询所有学生
- 根据 ID 查询学生
- 添加学生
- 修改学生
- 删除学生

写出每个接口的请求方法和路径。

### 练习 3：设计项目结构

给学生管理系统设计包结构，至少包含 `controller`、`service`、`mapper`、`entity`。

### 练习 4：写伪代码

写出“添加学生”的 Controller、Service、Mapper 调用过程。

## 本章过关标准

- 知道 Spring Boot 解决什么问题
- 能说出 Controller、Service、Mapper 的职责
- 能理解请求从接口到数据库的大致流程
- 能设计简单 REST API
- 知道新手学习 Spring Boot 的正确顺序
