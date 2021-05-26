# Getting Started

Prequisites, you need a JDK, probably some kind of IDE (i.e. Eclipse, IntelliJ) if you want to open the code and have a 
look, Maven and  all of thjs should be set up in your $PATH veriable so that you can type these commands in.  You are 
a dev manager so you know this but first rule of software development, never assume things.  Forgive me if this is 
too basic.  Okay well it isn't the first rule but it is a rule somewhere I think.  :)

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.0/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.0/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Database configuration parameters for MySQL

Open this file and set your user and password for your database:

./src/main/resources/application.properties

spring.datasource.username=
spring.datasource.password=

Also edit the load-schema script and set your database password or just go in and manually create this database 
in whatever database tool you use to edit your database.  This script should do it given you have the mysql 
CLI in your path. 

Data name should be called `pilot_fish`

### Installation

mvn install

### Executing command line

mvn spring-boot:run

### If you want to load the project in your Eclipse (STS or whatever) IDE

mvn eclipse:eclipse

### If you want to package and build a jar file to run

mvn package

And you can run that jar by typing

jar -jar PATH_TO_JAR_FILE  (you can find it in the "target" directory after running the above command).

### You may test this code by using the following URL

http://localhost:8080/load_fish_data?inputFile=./fish-data.xml
