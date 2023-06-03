# 🍿 cinema-app 🍿
This is new cinema application.

## In this app you can:
- log in and log out from app to change user with different user-role;
- create users, movies, cinema halls and movie sessions with POST request;
- get list of all cinema halls, movies, orders, shopping carts and users with GET http-methods;
- delete movie sessions by id.

### Project structure
**My project has:**
- Model-level, where I store classes which describes entities; 
- Dao-level, where logic how I access to DB is stored; 
- Service-levels consist of CRUD methods and some specific methods;
- Dto-level responsible for requests to DB and response from DB;
- Controllers show how we can get app on web-site with different end-points;
- Config package is responsible for Spring configurations and permission for different users' roles to access different and-points;
- Lib check if requests are filled correctly;

### Project technologies
- Java: Java Core, Java 8, OOP, Collections, JDBC, Hibernate, Spring;
- Database: MySQL;
- Tools: Maven, IntelliJ IDEA;

### How to start this app?
For start up the application fork this project.

Install IntelliJ IDEA and Tomcat version 9.0.71, MySQL Workbench.

In util resources, in db.properties file you have to fill your data to connect DB.

To fill your DB with first users you have DataInitializer.Class, which will fill first two users with ADMIN and USER roles.

After you have installed tomcat you should edit configurations in Idea. Please, add new configuration: TomcatServer -> Local.
In application server choose Tomcat that you have installed. Fill URL with http://localhost:8080/, HTTP port 8080.
In deployment select cinema-app:war exploded. In application context leave one slash "/". Apply changes.

Now you can run tomcat.

To log in to cinema-app, please, click here [here](http://localhost:8080/login).

To log in with ADMIN role use **username** admin@i.ua and **password** Admin123

To log in with USER role use **username** user@i.ua and **password** User123

To log out from cinema-app, please, click here [here](http://localhost:8080/logout).

To create, delete or get entities, please, use [postman](https://www.postman.com/) or other service with POST/DELETE/GET requests and right end-points.
