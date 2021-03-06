--Creates DB
CREATE DATABASE cv_generator;

--Create DATABASE user
CREATE USER 'test'@'localhost' IDENTIFIED WITH mysql_native_password BY 'Zaq1Xsw2@';

--privileges for user
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, INDEX, DROP, ALTER, CREATE TEMPORARY TABLES, LOCK TABLES ON cv_generator.* TO 'test'@'localhost';

--Dummy Data
INSERT INTO `user` (`email`, `password`, `term`, `username`) VALUES ('test1@gmail.com', '1234', '1', 'test1');
INSERT INTO `user` (`email`, `password`, `term`, `username`) VALUES ('test2@gmail.com', '1234', '1', 'test2');