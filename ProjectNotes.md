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
将struts-2.3.37-all.zip中/lib/{asm-3.3.jar,asm-commons-3.3.jar,asm-tree-3.3.jar,commons-io-2.2.jar,commons-fileupload-1.4.jar,commons-lang3-3.2.jar,freemarker-2.3.28.jar,javassist-3.11.0.GA.jar,ognl-3.0.21.jar,struts2-core-2.3.37.jar,struts2-spring-plugin-2.3.37.jar,xwork-core-2.3.37.jar}放入项目WEBContent/WEB-INF/lib/中，并配置web.xml、struts.xml。
```