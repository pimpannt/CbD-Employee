# CbD-Employee
Get employee list /Post new employee/Update employee profile

Learn from https://github.com/spring-guides/gs-accessing-data-mysql.git

Required

Mysql server : 
- pull docker image and set up
   
   docker run -p 3306:3306 -d --name mysql -e MYSQL_ROOT_PASSWORD=password mysql/mysql-server
   docker exec -it mysql bash
- login as root
   mysql -uroot -ppassword 
- https://dzone.com/articles/docker-for-mac-mysql-setup
- create new user and identify password
  mysql> create user 'pimpannt'@'%' identified by 'ThePassword';
- check user host 
  mysql> SELECT host, user FROM mysql.user;
  note: expect to get %(host) : pimpannt
- mysql> create database cbdMember;
- mysql> grant all on cbdMember.* to 'pimpannt'@'%';

Dbeaver :
- connect to mysql cbd database
- set up with  username and password like sqlserver

IntelliJ :
Springboot Configuration
- docker-compose.yml
- application.properties

Testing :

Scenario 1 
- Get list of example employees for example
- Create new employee with every feild.
- Get list of employee again.
- Create new employee with only employee id
- Update other field with that ID
- Get list of employee.
   

