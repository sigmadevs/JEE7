> JEE7 - A Java Enterprice Edition 7 With Maven Support & junit Testing starter

- Servlet : 3.1.0
- jsp 2.3
- junit Test : 4.0
- Java Beans

> Universal Maven Based Directory Structure
- src/main/java `Java File`
- src/main/webapp `Static Assets & Jsp Pages`
- src/test/java `Java Test Files`
- src/main/webapp/WEB-INF/web.xml `Servlet Mapper / Deployement discriptor`
- src/main/webapp/jsp/ `jsp files`
- src/main/java/com/sigma/servlets/ `Servlets`
- src/main/java/com/sigma/beans/ `Java Beans`
- pom.xml `Maven Project Object Model`
- mnvw `Maven Wrapper`

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

> Java EE 7 Docs from Oracle [https://docs.oracle.com/javaee/7/api/]()

> Junit 4 Docs [https://junit.org/junit4/]()