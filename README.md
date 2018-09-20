# CBd-Employee
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

Springboot Configuration :
- docker-compose.yml
- application.properties
   
   
   
