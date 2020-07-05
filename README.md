# prac_OAproject
[BV17W411y7Mn]:https://www.bilibili.com/video/BV17W411y7Mn "【编程】java开发工程师项目实战 15套合集（毕业设计项目）"
* A OA project practice from [BV17W411y7Mn].I will try to complete it.The jbpm framework is included.Wish to improve my program capacity.
* 一个在B站[BV17W411y7Mn]上的OA（自动化办公系统）项目。我会尽力完成。其中包含JBPM框架。希望能够提升编程能力。
---
## 开发环境（develop environment）
* JDK 1.8_U221
* Eclipse 2018-09
* MySQL 5.0
* Tomcat 6.0
* 按本项目的笔记配置项目
## 注意（Attantion）
* 如果出现什么问题，先考察环境配置是否正确
* If it happened any accident,please check out the configuration.
## 技术规范（Technique Contract）
1) 分层————SSH（Struts、Spring、Hibernate）deliver with SSH
2) 技术（Technique）:

工具（toolkit）|版本（version）|说明（Instruction）
|:-----:|:-----:|---
Struts |2.3.37|
Hibernate|3.6.10|实现持久化操作（Realize Persistence Process）
Spring|3.2
JBPM|4.4|工作流支持（Work Stream Supports）
Junit|4|单元测试（Unity Test）
jQury|1.8
3) 编码方式（encode）：utf-8
## 框架（framework）
* JBPM:用于开发自动商业系统（辅助进行商业过程和商业决定的系统）的开发工具。
* JBPM: A toolkit for building business applications to help automate business process and decisions.
```
```
* * 商业过程
* * business process(BPMN2)
* * 案例管理
* * case management(BPMN2 and CMMN)
* * 决议管理
* * decision managment(DMN)
* * 行业规则
* * business rules(DRL)
* * 商务优化
* * business optimisation(Solver)
* Struts2
```
成熟的基于MVC设计模式的web应用程序框架,是以WebWork框架和Struts框架为基础，通过提供增强和改进的Struts框架，进而实现简化web技术人员开发工作的目标。但由于高位漏洞和未完全分离的前后端而淘汰。
```
* * 使用POJO来接收表单输入，即Action类。
* * 创建了功能非常类似于标准的Struts2 标签的AJAX标签，把AJAX支持整合进其结果中。
* * 在Struts2 中，可使用Freemarker的模板对标签标记进行调整，而修改标签不需要JSP或是Java知识，基本的HTML、XML和CSS知识就足够了。
* Spring
```
基于 POJO 编程模型,使用依赖注入和控制反转技术，通过轻量级的 IOC 容器实现开发和部署应用程序的框架。依赖注入（或者有时被称为配线）可以通过向构造函数传递参数的方式，或者通过使用 setter 方法 post-construction发生，有助于将这些类粘合在一起，并且在同一时间让它们保持独立。spring提供了一致的事务管理接口，具有良好的扩展性。目前仍在使用
```
* * 环境配置（config）
```
bean.xml:
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:aop="http://www.springframework.org/schema/aop"
	xmlns:tx="http://www.springframework.org/schema/tx"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
				http://www.springframework.org/schema/beans/spring-beans.xsd
				http://www.springframework.org/schema/context
				http://www.springframework.org/schema/context/spring-context.xsd
				http://www.springframework.org/schema/aop
				http://www.springframework.org/schema/aop/spring-aop.xsd
				http://www.springframework.org/schema/tx
				http://www.springframework.org/schema/tx/spring-tx.xsd">
<bean id="sessionFactory" class="<持久化工厂对应的类>">
<bean id="txManager" class="<持久化工厂对应的管理类>"><property <参数>/></bean>
```
* * 原理
```
IOC容器管理着所有的Bean对象，并对依赖注入提供支持
Bean是spring的元数据的实例对象，通过它来讲IOC与元数据解耦。Bean具有五个作用域，分别为singleton、prototype、request、session和global session

```
* hibernet
```
对JDBC进行了非常轻量级的对象封装，它将POJO与数据库表建立映射关系，是一个全自动的orm框架（利用描述对象和数据库表之间映射的元数据，自动把Java应用程序中的对象，持久化到关系型数据库的表中），hibernate可以自动生成SQL语句，自动执行;但是无法调优，最终被淘汰
```
* * 核心配置文件（core configure file）：
* * * xxx.hbm.xml
>用于将类中的各种属性转换成表中的各种表头，完成从数据类到数据表的映射

>Use to tranform the property in class to tables,finish the confect from data calss to data table.
* * * hibernate.cfg.xml(SSH中将它与bean.xml写在一起)(writing in bean.xml using SSH)
>输入固定文件头，并完成必要的配置，连接MySQL数据库的基本参数：用户名，密码，地址，驱动类；Hibernate的方言：org.hibernate.dialect.MySQLDialect，org.hibernate.dialect.MySQL5InnoDBDialect；应该加载的映射文件。不同的版本，会有不同的配置方法，但大体一致。