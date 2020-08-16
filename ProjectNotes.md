# 项目笔记（Project Notes）
## 一般项目开发流程
1) 调研————调研文档
2) 需求分析————需求分析文档
3) 设计（概要设计，详细设计）————设计文档
4) 编码————程序源代码、程序
5) 测试————测试计划、测试用例、测试报告
6) 运维
## 项目分层
* 表示层
* * 基于WEB
```
    JSP
    Servlet
    Struts
    Webwork
    Spring Web MVC
```
* * 基于客户端
```
    Swing
    SWT
```
* 业务逻辑层
```
    Pojo(Service,Manager)
    Domain
    Session EJB
    Spring
```
* 数据访问层
```
    JDBC
    IBatis
    Hibernate
    JDO
    Entity Bean
```
## 代码规范
* 命名：驼峰命名法
* * 类、接口：每个单词的首字母大写
* * 变量、方法：第一个单词的首字母小写，其他单词的首字母大写
* * 常量：全部使用大写字母，单词之间“_”隔开
* * 使用有意义的名称，慎用缩写
* * 注意可读性
* Java中包名的规范：
* * 为小写单词
* * 避免重复可添加唯一前缀
* 常用通用缩写
* 1) del ———— delete 删除
* 2) tmp ———— temporary 临时变量
* 注释要求：
* * 方法要加注释，简洁的说明操作
* * 关键地方加入注释，表达用处、步骤等
## 环境搭建
1) 创建WEB项目，要将框架的jar包放在，WEB-INF/lib中
2) 之后配置*.xml,*.properties等配置文件
3) 如果框架需要依赖，则需要将依赖也引入WEB-INF/lib中
* 本案例步骤：
```
Struts
将struts-2.3.37-all.zip中/lib/{asm-3.3.jar,asm-commons-3.3.jar,asm-tree-3.3.jar,commons-io-2.2.jar,commons-fileupload-1.4.jar,commons-lang3-3.2.jar,freemarker-2.3.28.jar,javassist-3.11.0.GA.jar,ognl-3.0.21.jar,struts2-core-2.3.37.jar,struts2-spring-plugin-2.3.37.jar,xwork-core-2.3.37.jar}放入项目WEBContent/WEB-INF/lib/中，并配置web.xml、struts.xml。
web.xml中主要配置struts的前端控制器，以及网络首页
struts.xml中主要配置常量，设置工厂类、Action等
Spring
将spring-framework-3.2.7.RELEASE-dist.zip中/libs/{spring-aop-3.2.7.RELEASE.jar,spring-aspects-3.2.7.RELEASE.jar,spring-beans-3.2.7.RELEASE.jar,spring-context-3.2.7.RELEASE.jar,spring-core-3.2.7.RELEASE.jar,spring-expression-3.2.7.RELEASE.jar,spring-jdbc-3.2.7.RELEASE.jar,spring-orm-3.2.7.RELEASE.jar,spring-tx-3.2.7.RELEASE.jar,spring-web-3.2.7.RELEASE.jar}放入项目WEBContent/WEB-INF/lib/中
还要配置依赖，将spring-framework-3.0.2.RELEASE-dependencies.zip中com.mchange.c3p0/com.springsource.com.mchange.v2.c3p0/0.9.1.2/com.springsource.com.mchange.v2.c3p0-0.9.1.2.jar,org.aopalliance/com.springsource.org.aopalliance/1.0.0/com.springsource.org.aopalliance-1.0.0.jar,org.apache.commons/com.springsource.org.apache.commons.logging/1.1.1/com.springsource.org.apache.commons.logging-1.1.1.jar,org.apache.log4j/com.springsource.org.apache.log4j/1.2.15/com.springsource.org.apache.log4j-1.2.15.jar,org.aspectj/com.springsource.org.aspectj.weaver/1.6.8.RELEASE/com.springsource.org.aspectj.weaver-1.6.8.RELEASE.jar放入WEBContent/WEB-INF/lib/中
之后要配置beans.xml和jdbc.properties,log4j.properties.
beans.xml中设置读取属性文件为jdbc.properties,将数据库的详细信息写入jdbc.properties，在beans.xml中建立新bean根据其中所写信息配置property
log4j.properties中配置stdout,logfile,log-level
最后，要在web.xml中配置spring的上下文参数和监听器
Hibernate
将hibernate-distribution-3.6.10.Final-dist.zip中hibernate3.jar,/lib/jpa/hibernate-jpa-2.0-api-1.0.1.Final,/lib/required/{antlr-2.7.6.jar,commons-collections-3.1.jar,dom4j-1.6.1.jar,jta-1.1.jar,ognl-3.0.21.jar,slf4j-api-1.6.1.jar}放入项目WEBContent/WEB-INF/lib/
由于hibernate使用slf4j进行记录，所以slf4j-log4j12-1.7.2.jar 也应该放在lib里
本来应该将/lib/required中的所有东西都要引入，但是有些已经在上面引入过了，所以不重复引入。
hibernate底层依赖jdbc还需要引入一个jdbc的jar
之后继续配置beans.xml，配置hibernate的设置，本地话工厂设置成springframework的，property中注入hibernate属性，并对注解进行支持。
```
## 项目树
* src
* * cn.itcast.oa.action
* * cn.itcast.oa.base
* * cn.itcast.oa.dao
* * * cn.itcast.oa.dao.impl
* * cn.itcast.oa.domain
* * cn.itcast.oa.service
* * * cn.itcast.oa.service.impl
* * cn.itcast.oa.util
```
action的搭建
    action在项目中会抽象出一个父类放入base，其父类要实现一个接口并继承action的超类，并将一切service接口对象安置在类中。
    在action中写入普通action类，完成与struts对接的功能
dao的搭建
    dao分为通用dao和其他dao，通用dao写在base里，其他dao要写进dao里。一般采用接口————实例的方式，每个dao都实现对应的接口，将类单独放在impl包中，由于base类有限，故不区分。
    basedao：主要在于泛型的识别，其次是增删改查的基本实现。
    dao中的实现类需要写上@Repository注解
domain的搭建
    一个类对应一个同名的.hbm.xml文件，其头标签可以从>>hibernate3.jar>org.hibernate>hibernate-mapping-3.0.dtd中摘录。
    其中id多是主键，要设置类型
    porperty为其他属性
service的搭建
    也是采用接口————实例的方式，每个service实现对应的接口。分包与dao相同。
    service的实现类需写入@Service注解和@Transactional注解
    service中要拿到对应的dao接口并写上@Resource注解
util的搭建
    主要用于存放项目中的几个通用方法类库，使得代码更少。
```
## UML 设计
* Role
* * id:Long
* * name:String
* * descripeion:String
* * users:Set::User
---
* Department
* * id:Long
* * name:String
* * descripeion:String
* * parent:Department
* * children:Set::Department
* * users:Set::User
---
* User
* * id:Long
* * loginName:String
* * name:String
* * gender:int
* * phone:String
* * email:String
* * description:String
* * password:String
* * department:Department
* * roles:Set::Role
## 框架学习
* Struts2
```
    基础原理：
    struts2使用MVC架构，控制器是通过Struts2 分派servlet过滤器以及拦截器进行实现，模型是通过Actions进行实现，而视图则是结果类型和结果的结合。
    配置：
    Struts2提供了两种配置的方式。一种是key=value的方式，即使用.properties文件。另一种是xml文件配置。我们推荐使用xml文件（它能描述层级关系）。
    关键类:
```
* Spring
```
```
* Hibernate
```
```