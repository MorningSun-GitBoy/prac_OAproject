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
put /lib/{asm-3.3.jar,asm-commons-3.3.jar,asm-tree-3.3.jar,commons-io-2.2.jar,commons-fileupload-1.4.jar,commons-lang3-3.2.jar,freemarker-2.3.28.jar,javassist-3.11.0.GA.jar,ognl-3.0.21.jar,struts2-core-2.3.37.jar,struts2-spring-plugin-2.3.37.jar,xwork-core-2.3.37.jar}from struts-2.3.37-all.zip into project diractory WEBContent/WEB-INF/lib/,then config the web.xml and struts.xml.
```