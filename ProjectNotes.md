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
* Java中包名的规范：
* * 为小写单词
* * 避免重复可添加唯一前缀