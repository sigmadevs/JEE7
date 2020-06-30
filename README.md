![Java Enterprice](https://avatars2.githubusercontent.com/u/23086798?s=200&v=4)

![build passing](https://travis-ci.org/sigmadevs/JEE7.svg?branch=master&status=passed)

> <h2> JEE7 - A Java Enterprice Edition 7 With Maven Support & junit Testing starter </h2>

> The JEE7 Available in 3 Editions `(Choose As Per Requirements)`

1. Web `(Basic profile Java EE 7 Web Application)` <a href="https://github.com/sigmadevs/JEE7/tree/web">start developement</a>
2. Rest `(Restfull Web Services)` *under developement*
3. Enterprice `(Full Enterprice Components supporting Application)` *under developement*

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

<hr>

> <h3> Universal Maven Based Directory Structure </h3>

- src/main/java `(Java Files)`
- src/main/webapp `(Static Assets & Jsp Pages)`
- src/test/java `(Java Test Files)`
- src/main/webapp/WEB-INF/web.xml `(Servlet Mapper / Deployment discriptor)`
- src/main/webapp/jsp/ `(jsp files)`
- src/main/java/com/sigma/servlets/ `(Servlets)`
- src/main/java/com/sigma/beans/ `(Java Beans)`
- pom.xml `(Maven Project Object Model)`
- mnvw `(Maven Wrapper)`

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

> Visit maven central For More Dependancy [https://mvnrepository.com/]()

> Java EE 7 API Docs from Oracle [https://docs.oracle.com/javaee/7/api/]()

> Junit 4 Docs [https://junit.org/junit4/]()

> Docs [https://github.com/sigmadevs/JEE7/blob/master/JEE7.pdf]()

<hr>

> <h2> Getting Started <h2>

1. Get any 1 Edition of JEE7 `(web, rest & enterprice as per requirement)`
2. Write some code or go with template
3. Build the deployable war file with  `mvnw clean package`
4. Get war file from folder /target/{project_name_version.war} 
5. deploy war to server
6. Open in browser [http://localhost:8080]()

> Gitpod Environment

<a href="https://gitpod.io/#https://github.com/sigmadevs/JEE7">Start</a>

<hr>

> Continuous Integration `(Travis & Jenkins )`

Check out <a href="https://travis-ci.org/github/sigmadevs/JEE7">Travis CI Status </a>

![build passing](https://travis-ci.org/sigmadevs/JEE7.svg?branch=master&status=passed)