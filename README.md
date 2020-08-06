![Java Enterprice](https://avatars2.githubusercontent.com/u/23086798?s=200&v=4)

![build passing](https://travis-ci.org/sigmadevs/JEE7.svg?branch=master&status=passed)

> <h2> JEE7 - A Java Enterprice Edition 7 With Maven Support & junit Testing starter </h2>

<hr>

> <h3> JEE 7 Enterprice components specification </h3>

- Servlet : 3.1.0
- jsp 2.3
- EJB Lite 3.2
- JSF 2.2
- jax rs 2.0
- web socket 1.0
- EL 3.0
- JSTL 1.2
- JPA 2.1
- JSonp 1.0
- Jdbc 4.1
- Jndi 1.0
- junit Test : 4.0
- Hibernate 5

<hr>

> <h3> Universal Maven Based Directory Structure </h3>

- src/main/java `(Java Files)`
- src/main/webapp `(Static Assets & Jsp Pages)`
- src/test/java `(Java Test Files)`
- src/main/webapp/WEB-INF/web.xml `(Servlet Mapper / Deployment discriptor)`
- src/main/webapp/ `(jsp views)`
- src/main/java/com/sigma/jee7/controller `(Java Restfull api)`
- src/main/java/com/sigma/model/ `(Models Classes)`
- pom.xml `(Maven Project Object Model)`
- mnvw `(Maven Wrapper)`
- run `(To Start build war, Start server & Deploy war file to server)` Note `(Configure your server in pom.xml & Run file)`

<hr>

> Maven Cheat Sheet  `(mvnw recommanded instead mvn)`

| commands | task |
| ------- | ----------- |
| mvn clean | clear the compiled & build files .|
| mvn clean package | build new deployable war file for web server. |
| mvn clean install | install the war file to local repository. |
| mvn compile | Compile java files to class files. |
| mvn deploy | deploy the war to configured server |
| mvn test | For Testing fire|

> Visit maven central For More Dependancy <a href="https://mvnrepository.com/" target="_blank">mvn central</a>

> Java EE 7 API Docs from Oracle <a href="https://docs.oracle.com/javaee/7/api/" target="_blank">Java EE 7 Docs</a>

> Junit 4 Docs <a href="https://junit.org/junit4/">Junit 4 Docs</a>

> Docs <a href="https://github.com/sigmadevs/JEE7/blob/master/JEE7.pdf" target="_blank">Manual Java EE 7</a>

> Jersey <a href="https://eclipse-ee4j.github.io/jersey.github.io/documentation/latest/index.html">jax-rs</a>

> Hibernate <a href="https://docs.jboss.org/hibernate/orm/5.0/javadocs/">Hibernate 5 javadocs</a>

<hr>

> <h2> To Run Standalone </h2>
 1. ```java -jar /target/standalone.jar -httpPort=8080 ```
 2. Open Web Browser http://localhost:8080/standalone/

> <h2> Getting Started </h2>

1. git clone https://github.com/sigmadevs/JEE7
3. Build the deployable war file with  `mvnw clean package`
4. Get war file from folder /target/{myprojectname.war} 
5. deploy war to server
6. Open in browser <a href="http://localhost:8080" target="_blank">http://localhost:8080</a>

> Gitpod Environment

<a href="https://gitpod.io/#https://github.com/sigmadevs/JEE7" target="_blank">START DEVELOPEMENT</a>

<hr>

> Continuous Integration `(Travis & Jenkins )`

Check out <a href="https://travis-ci.org/github/sigmadevs/JEE7" target="_blank">Travis CI Status </a>

![build passing](https://travis-ci.org/sigmadevs/JEE7.svg?branch=master&status=passed)

> Note *
Its recommendation to Use Web Server to Run & Deploy ```(Standalone Server Tomcat 7 is under developement)```
