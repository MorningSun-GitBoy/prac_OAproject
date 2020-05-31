# Project Notes
## Generally Development Process
1) Market Analysis————Market Analysis Document
2) Demand Analysis————Demand Analysis Document
3) Design（Genal Design,Detials Design）————Design Document
4) Write code————Source code&Program
5) Test————Test Plan,Test Exemple,Test Report
6) CICD(Continue Integration Continue Delivery)
## Layer Divide
* Veiw Layer
* * For WEB
```
    JSP
    Servlet
    Struts
    Webwork
    Spring Web MVC
```
* * For Client
```
    Swing
    SWT
```
* Process Layer
```
    Pojo(Service,Manager)
    Domain
    Session EJB
    Spring
```
* Data Visit Layer
```
    JDBC
    IBatis
    Hibernate
    JDO
    Entity Bean
```
## Code Contact
* Name：Hump Naming
* * Class、Interface：Type up case of every word's capital 
* * Virable、Method：Type low case of first word's capital and up case of every next word's capital  
* * Constant：Type up case of all the letters and split every word by “_”
* * Use meaningful spell,and show abbreviation cautiously
* * make code readable
* Java Package Name Contact：
* * A word in low case
* * Could wirte only prefixion to avoid repetitions
* General Abbreviation
* 1) del ———— delete 
* 2) tmp ———— temporary 
* Comment：
* * You should write a comment when write a new method,to explain what you do
* * You should write a comment in a key process,to explain what the virable use for or how to do process
## Environment Config
1)  When build web project, you should put framwork .jar package into WEB-INF/lib/ .
2) Then,configrate *.xml and *.properties such configration files.
3) If your framework delay on some dependencies,please put them into WEB-INF/lib/ as well.
* This project:
```
Struts
put /lib/{asm-3.3.jar,asm-commons-3.3.jar,asm-tree-3.3.jar,commons-io-2.2.jar,commons-fileupload-1.4.jar,commons-lang3-3.2.jar,freemarker-2.3.28.jar,javassist-3.11.0.GA.jar,ognl-3.0.21.jar,struts2-core-2.3.37.jar,struts2-spring-plugin-2.3.37.jar,xwork-core-2.3.37.jar}from struts-2.3.37-all.zip into project diractory WEBContent/WEB-INF/lib/,then config the web.xml and struts.xml.
Spring
put /libs/{spring-aop-3.2.7.RELEASE.jar,spring-aspects-3.2.7.RELEASE.jar,spring-beans-3.2.7.RELEASE.jar,spring-context-3.2.7.RELEASE.jar,spring-core-3.2.7.RELEASE.jar,spring-expression-3.2.7.RELEASE.jar,spring-jdbc-3.2.7.RELEASE.jar,spring-orm-3.2.7.RELEASE.jar,spring-tx-3.2.7.RELEASE.jar,spring-web-3.2.7.RELEASE.jar} from spring-framework-3.2.7.RELEASE-dist.zip into WEBContent/WEB-INF/lib/,after that,you should include dependencies,put com.mchange.c3p0/com.springsource.com.mchange.v2.c3p0/0.9.1.2/com.springsource.com.mchange.v2.c3p0-0.9.1.2.jar,org.aopalliance/com.springsource.org.aopalliance/1.0.0/com.springsource.org.aopalliance-1.0.0.jar,org.apache.commons/com.springsource.org.apache.commons.logging/1.1.1/com.springsource.org.apache.commons.logging-1.1.1.jar,org.apache.log4j/com.springsource.org.apache.log4j/1.2.15/com.springsource.org.apache.log4j-1.2.15.jar,org.aspectj/com.springsource.org.aspectj.weaver/1.6.8.RELEASE/com.springsource.org.aspectj.weaver-1.6.8.RELEASE.jar spring-framework-3.0.2.RELEASE-dependencies.zip into WEBContent/WEB-INF/lib/ .
Then you should write beans.xml , jdbc.properties and log4j.properties.
set reading file jdbc.properties in beans.xml.Write database detial in jdbc.properties,build a new bean and according to the jdbc.properties write property in that bean in beans.xml .
Set stdout,logfile,log-level in log4j.properties.
Last,you should configure spring parameters and listener in web.xml .
Hibernate
Put hibernate3.jar,/lib/jpa/hibernate-jpa-2.0-api-1.0.1.Final,/lib/required/{antlr-2.7.6.jar,commons-collections-3.1.jar,dom4j-1.6.1.jar,jta-1.1.jar,ognl-3.0.21.jar,slf4j-api-1.6.1.jar} from hibernate-distribution-3.6.10.Final-dist.zip into WEBContent/WEB-INF/lib/ .
Due to hibernate use slf4j to log, we should put slf4j-log4j12-1.7.2.jar into it.
Generally we should put all the jars from hibernate-distribution-3.6.10.Final-dist.zip/lib/required,but some of them has been included before.
Then set beans.xml add hibernate settings in it,set local session factory bean as springframework's,in property inject hibernate's property , and support annonations suppoting.
Hibernate is denpendented with jdbc in basic so we should also include jdbc jar.
```
## Project tree
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
to build action
    there will be abstract a class from actions putting into base,which shuold implement a  interface and extends SupperAction but also  all the service interface object as the properties.
    write common action class in action to give project their functions.
to build dao
    dao are divided to generic dao and other dao，generic dao write in base and others write in dao.Ususally , we write at interface————implenments way,every dao has their own implement.You should put into package impl,due to base class has a littel number,so do not dispqch interface and implenments.
    basedao：first thing is to reconganize the gernerics class type,then you should realize the fundmatal database operation method.
to build domain
    one class has a same name .hbm.xml fiel,which head boday an copy from>>hibernate3.jar>org.hibernate>hibernate-mapping-3.0.dtd .
    label id mains key , should set the type;
    label porperty is other properties.
to build service
    also useinterface————implenments way,every dao has their own implement,which has a similar package way.
to build util
    we will abstract some generic class in project to make code forthright.
```