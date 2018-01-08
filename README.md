# Spring MVC

## Environment

* Eclipse IDE for Java EE Developers, Oxygen Packages
* Apache Tomcat 8.0.26
* jdk1.8.0_151
* Maven 4.0.0

## Project Directory Structure

![img](https://raw.githubusercontent.com/bobtai/springmvc/master/images/structure.png)

### pom.xml

```xml
<dependencies>
  <!-- Spring MVC Support -->
  <dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-web</artifactId>
    <version>4.3.12.RELEASE</version>
  </dependency>
  <dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>4.3.12.RELEASE</version>
  </dependency>
  <!-- JSP Views Support -->
  <dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
    <version>1.2</version>
  </dependency>
</dependencies>
```

### spring.config

使用 AbstractAnnotationConfigDispatcherServletInitializer 來配置    
DispatcherServlet，用來取代傳統的 web.xml 配置方式。

### spring.controller

Controller 負責接收 Client 端的 Request，調用 Service 層的商業邏輯方法，並返回特定的 View 給使用者。

### spring.model

Model 通常是一個 POJO 類別，該類別包含屬性和操作屬性的 getter 和 setter 方法。  
用來封裝應用程式的數據資料，以進行存入資料庫或顯示視圖等操作。

### spring.dao

DAO 僅僅負責資料庫的查詢、新增、刪除和修改等操作，不能涵蓋其他的商業邏輯。

### spring.service

Service 為商業邏輯層，再使用 DAO 對資料庫進行操作的前後，將資料進行額外處理的地方。

### WEB-INF/views/

View 只負責將 Service 層操作完畢的資料，呈現給使用者。
