# spring-boot-web-api

# search: spring boot starter
=============================
* https://start.spring.io/ . create your own project.
* download. extract. build with `mvn clean install -DskipTests`. open in IDEA.
* spring boot uses embeded server called tomcat.
* in production you should not use embeded tomcat. it must be external tomcat.

# HTTP REQUEST
=============================================
* SEND SOME DATA TO SERVER 
* SERVER WILL PROCESS THAT DATA 
* RETURN THE RESPONSE

# 9 HTTP METHODS for GETTING RESPONSE from SERVER
=================================================
* GET: used to get data from server. It doesnt have any body. It can send data ((resource identifier)) as part of URL only. 
   * http://localhost:8080/employees/ : Getting all employees as List of JSON
   * http://localhost:8080/employees/uid-123456 : Getting employee whose uid is uid-123456 
   * http scheme
   * localhost machine identifier or IP address 
   * 8080: port of the server. can be changed.
   * /employees : that means each object is of employee type in the response.
   * /products : each object is product type in the response.
   
* POST: used to create data on server side. It has body. IT can also send data as part of URL.
http://localhost:8080/employees/
{
  JSON DATA
}
* PUT: used to update the data with a resource identifier. It has body.It must send data (resource identifier) as part of URL.
http://localhost:8080/employees/uuid
{
  JSON DATA
}
* DELETE: used to delete the data from the server. IT may have body. It must send data (resource identifier) as part of URL.
http://localhost:8080/employees/uuid



# SWAGGER
```xml
<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.6.1</version>
		</dependency>

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.6.1</version>
		</dependency>

```
* run `mvn clean install -DskipTests`
* reimport the project from maven.

# DEBUGGING 
 mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=9999"
 
# PORT CHANGE FOR embeded tomcat server
* server.port=8989 

