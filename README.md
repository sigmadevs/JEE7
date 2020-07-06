> To make war file `(mvnw clean package)`

> the war file will be generated in /target folder

> To deploy Project On Tomcat
1. set server path in pom.xml properties myserverpath
2. set project name in pom.xml properties myprojectname
2. ./mvnw integration-test
3. open localhost:8080/{myprojectname}