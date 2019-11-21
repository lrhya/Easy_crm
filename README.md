# Easy_crm

## 项目介绍

![M5qZB8.png](https://s2.ax1x.com/2019/11/21/M5qZB8.png)


![plateform](https://img.shields.io/badge/plateform-windows-lightgrey.svg) 
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-2019.1.3-8B0000.svg) 
![JDK](https://img.shields.io/badge/JDK-1.8.0_121-3A5FCD.svg) 
![Maven](https://img.shields.io/badge/Maven-3.6.0-ff69b4.svg) 
![MySQL](https://img.shields.io/badge/MySQL-5.7.21-20B2AA.svg) 
![SSM](https://img.shields.io/badge/SSM-framework-brightgreen.svg) 
![build](https://img.shields.io/badge/build-passing-brightgreen.svg) 

本项目是使用SSM框架开发的简易crm应用。

**项目功能介绍：**

+ 增添员工信息、删除员工信息、修改员工信息、显示员工信息。
+ 分页功能、页面跳转功能、批量删除功能。
+ 数据校验功能（检查输入员工姓名与邮箱格式是否合规）。

**项目整体结构图：**

![M5qeHS.png](https://s2.ax1x.com/2019/11/21/M5qeHS.png)



## 特性

+ 简易CRM应用。

+ 使用 SSM 框架开发后端业务，采用 RESTful 风格接口设计，并使用 JSON 交互数据。

+ 浏览器收到js字符串，使用js对json进行解析，使用js通过dom操作页面，实现客户端的无关性。

+ 使用JSR303对相关数据格式进行校验。

  

## 开发技术

- 前端技术 ：Bootstrap + jQuery +JavaScript+AJAX
- 后端技术 ：Spring + SpringMVC + MyBatis 
- 依赖管理：Maven
- 版本控制：Git
- 数据库： MySQL 
- 服务器： Tomcat

## 开发工具

IntelliJ IDEA + MySQL + Git + Chrome



## 使用方法

1. git clone `https://github.com/lrhya/Easy_crm.git`或者`Download Zip`
2. 打开IDEA --> File --> New --> Open
3. 项目导入后，打开 Project Settings -->Project 设置 Project SDK 
4. 打开File --> Settings --> Build,Execution,Deployment -->Maven 配置maven相关信息
5. 在 sql 包下，执行 depatrment.sql 与 employee.sql，建立数据库，然后找到 dbconfig.properties 文件修改username and password

**项目启动过程：**

- 启动 MySQL
- 为项目添加 tomacat 服务器，部署项目并运行
- 打开浏览器进入 `http://localhost:8080/easy_crm/`
- 成功

