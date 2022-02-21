# DATABASE CHEAT CODE
### sudo -u root mysql

#### SHOW DATABASE command is used for see our default database in our system
mysql> show databases;

 | Database           |
 |:--:|
 | College            |
 | information_schema |
 | mysql              |
 | performance_schema |
 | students           |
 | sys                |

6 rows in set (0.00 sec)

## mysql> use College;
Database changed
## HowCREATE table 
mysql> create table student_1(id int primary key, name varchar(20) not null, age tinyint check(age>=1), gender varchar(10) not null);
ERROR 1050 (42S01): Table 'student_1' already exists
mysql> create table students_1(id int primary key, name varchar(20) not null, age tinyint check(age>=1), gender varchar(10) not null);
Query OK, 0 rows affected (0.04 sec)

mysql> desc students_1;

| Field  | Type        | Null | Key | Default | Extra |
|:------:|:-----------:|:----:|:---:|:-------:|:-----:|
| id     | int         | NO   | PRI | NULL    |       |
| name   | varchar(20) | NO   |     | NULL    |       |
| age    | tinyint     | YES  |     | NULL    |       |
| gender | varchar(10) | NO   |     | NULL    |       |

4 rows in set (0.01 sec)

mysql> insert into students_1 values
    -> (1, "Venkat", 18, "M")
    -> (2, "Suguram", 19, "M")
    -> (3, "Musaraf", 20, "M")
    -> (4, "Meenu", 19, "F")
    -> (5, "Deepak", 19, "M")
    -> (6, "Kasi", 19, "M")
    -> (6, "Keerthana", 19, "F")
    -> );
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(2, "Suguram", 19, "M")
(3, "Musaraf", 20, "M")
(4, "Meenu", 19, "F")
(5, "Deepa' at line 3
mysql> insert into students_1 values (1, "Venkat", 18, "M") (2, "Suguram", 19, "M") (3, "Musaraf", 20, "M") (4, "Meenu", 19, "F") (5, "Deepak", 19, "M") (6, "Kasi", 19, "M") (7, "Keerthana", 19, "F") );
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(2, "Suguram", 19, "M") (3, "Musaraf", 20, "M") (4, "Meenu", 19, "F") (5, "Deepa' at line 1
mysql> insert into students_1 values (1, "Venkat", 18, "M"),(2, "Suguram", 19, "M"),(3, "Musaraf", 20, "M"),(4, "Meenu", 19, "F"),(5, "Deepak", 19, "M"),(6, "Kasi", 19, "M"),(7, "Keerthana", 19, "F"));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ')' at line 1
mysql> insert into students_1 values(1, "Venkat", 18, "M");
Query OK, 1 row affected (0.01 sec)

mysql> insert into students_1 values (1, "Venkat", 18, "M"),(2, "Suguram", 19, "M"),(3, "Musaraf", 20, "M"),(4, "Meenu", 19, "F"),(5, "Deepak", 19, "M"),(6, "Kasi", 19, "M"),(7, "Keerthana", 19, "F");
ERROR 1062 (23000): Duplicate entry '1' for key 'students_1.PRIMARY'
mysql> insert into students_1 values (2, "Suguram", 19, "M"),(3, "Musaraf", 20, "M"),(4, "Meenu", 19, "F"),(5, "Deepak", 19, "M"),(6, "Kasi", 19, "M"),(7, "Keerthana", 19, "F");
Query OK, 6 rows affected (0.00 sec)
Records: 6  Duplicates: 0  Warnings: 0

mysql> select * from students_1;

| id | name      | age  | gender |
|:--:|:---------:|:----:|:------:|
|  1 | Venkat    |   18 | M      |
|  2 | Suguram   |   19 | M      |
|  3 | Musaraf   |   20 | M      |
|  4 | Meenu     |   19 | F      |
|  5 | Deepak    |   19 | M      |
|  6 | Kasi      |   19 | M      |
|  7 | Keerthana |   19 | F      |

7 rows in set (0.00 sec)

mysql> create table Hostellers(id int primary key, name varchar(20) not null);
Query OK, 0 rows affected (0.06 sec)

mysql> insert into Hostellers values
    -> (1, "H"),
    -> (2, "D"),
    -> (3, "D"),
    -> (4, "H"),
    -> (5, "D"),
    -> (6, "H"),
    -> (7, "H"),
    -> );
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ')' at line 9
mysql> insert into Hostellers values (1, "H"), (2, "D"), (3, "D"), (4, "H"), (5, "D"), (6, "H"), (7, "H");
Query OK, 7 rows affected (0.01 sec)
Records: 7  Duplicates: 0  Warnings: 0

mysql> select * from Hostellers;
+----+------+
| id | name |
+----+------+
|  1 | H    |
|  2 | D    |
|  3 | D    |
|  4 | H    |
|  5 | D    |
|  6 | H    |
|  7 | H    |
+----+------+
7 rows in set (0.00 sec)

mysql> select * from students_1 as a inner join Hostellers as b on a.id = b.id;
+----+-----------+------+--------+----+------+
| id | name      | age  | gender | id | name |
+----+-----------+------+--------+----+------+
|  1 | Venkat    |   18 | M      |  1 | H    |
|  2 | Suguram   |   19 | M      |  2 | D    |
|  3 | Musaraf   |   20 | M      |  3 | D    |
|  4 | Meenu     |   19 | F      |  4 | H    |
|  5 | Deepak    |   19 | M      |  5 | D    |
|  6 | Kasi      |   19 | M      |  6 | H    |
|  7 | Keerthana |   19 | F      |  7 | H    |
+----+-----------+------+--------+----+------+
7 rows in set (0.00 sec)

mysql> select * from Hostellers as a inner join students_1 as b on a.id = b.id;
+----+------+----+-----------+------+--------+
| id | name | id | name      | age  | gender |
+----+------+----+-----------+------+--------+
|  1 | H    |  1 | Venkat    |   18 | M      |
|  2 | D    |  2 | Suguram   |   19 | M      |
|  3 | D    |  3 | Musaraf   |   20 | M      |
|  4 | H    |  4 | Meenu     |   19 | F      |
|  5 | D    |  5 | Deepak    |   19 | M      |
|  6 | H    |  6 | Kasi      |   19 | M      |
|  7 | H    |  7 | Keerthana |   19 | F      |
+----+------+----+-----------+------+--------+
7 rows in set (0.01 sec)

mysql> select * from Hostellers right join students_1 ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 1
+----+------+------+-----------+------+--------+ts_1 on Hostellers.id = students_1.id;
| id | name | id   | name      | age  | gender |
+----+------+------+-----------+------+--------+
|  1 | H    |    1 | Venkat    |   18 | M      |
|  2 | D    |    2 | Suguram   |   19 | M      |
|  3 | D    |    3 | Musaraf   |   20 | M      |
|  4 | H    |    4 | Meenu     |   19 | F      |
|  5 | D    |    5 | Deepak    |   19 | M      |
|  6 | H    |    6 | Kasi      |   19 | M      |
|  7 | H    |    7 | Keerthana |   19 | F      |
+----+------+------+-----------+------+--------+
7 rows in set (0.00 sec)

mysql> select * from Hostellers left join students_1 on Hostellers.id = students_1.id;
+----+------+------+-----------+------+--------+
| id | name | id   | name      | age  | gender |
+----+------+------+-----------+------+--------+
|  1 | H    |    1 | Venkat    |   18 | M      |
|  2 | D    |    2 | Suguram   |   19 | M      |
|  3 | D    |    3 | Musaraf   |   20 | M      |
|  4 | H    |    4 | Meenu     |   19 | F      |
|  5 | D    |    5 | Deepak    |   19 | M      |
|  6 | H    |    6 | Kasi      |   19 | M      |
|  7 | H    |    7 | Keerthana |   19 | F      |
+----+------+------+-----------+------+--------+
7 rows in set (0.00 sec)

mysql> select * from Hostellers right join students_1 on Hostellers.id = students_1.id;
+------+------+----+-----------+------+--------+
| id   | name | id | name      | age  | gender |
+------+------+----+-----------+------+--------+
|    1 | H    |  1 | Venkat    |   18 | M      |
|    2 | D    |  2 | Suguram   |   19 | M      |
|    3 | D    |  3 | Musaraf   |   20 | M      |
|    4 | H    |  4 | Meenu     |   19 | F      |
|    5 | D    |  5 | Deepak    |   19 | M      |
|    6 | H    |  6 | Kasi      |   19 | M      |
|    7 | H    |  7 | Keerthana |   19 | F      |
+------+------+----+-----------+------+--------+
7 rows in set (0.00 sec)

mysql> select * from Hostellers cross join students_1;
+----+------+----+-----------+------+--------+
| id | name | id | name      | age  | gender |
+----+------+----+-----------+------+--------+
|  7 | H    |  1 | Venkat    |   18 | M      |
|  6 | H    |  1 | Venkat    |   18 | M      |
|  5 | D    |  1 | Venkat    |   18 | M      |
|  4 | H    |  1 | Venkat    |   18 | M      |
|  3 | D    |  1 | Venkat    |   18 | M      |
|  2 | D    |  1 | Venkat    |   18 | M      |
|  1 | H    |  1 | Venkat    |   18 | M      |
|  7 | H    |  2 | Suguram   |   19 | M      |
|  6 | H    |  2 | Suguram   |   19 | M      |
|  5 | D    |  2 | Suguram   |   19 | M      |
|  4 | H    |  2 | Suguram   |   19 | M      |
|  3 | D    |  2 | Suguram   |   19 | M      |
|  2 | D    |  2 | Suguram   |   19 | M      |
|  1 | H    |  2 | Suguram   |   19 | M      |
|  7 | H    |  3 | Musaraf   |   20 | M      |
|  6 | H    |  3 | Musaraf   |   20 | M      |
|  5 | D    |  3 | Musaraf   |   20 | M      |
|  4 | H    |  3 | Musaraf   |   20 | M      |
|  3 | D    |  3 | Musaraf   |   20 | M      |
|  2 | D    |  3 | Musaraf   |   20 | M      |
|  1 | H    |  3 | Musaraf   |   20 | M      |
|  7 | H    |  4 | Meenu     |   19 | F      |
|  6 | H    |  4 | Meenu     |   19 | F      |
|  5 | D    |  4 | Meenu     |   19 | F      |
|  4 | H    |  4 | Meenu     |   19 | F      |
|  3 | D    |  4 | Meenu     |   19 | F      |
|  2 | D    |  4 | Meenu     |   19 | F      |
|  1 | H    |  4 | Meenu     |   19 | F      |
|  7 | H    |  5 | Deepak    |   19 | M      |
|  6 | H    |  5 | Deepak    |   19 | M      |
|  5 | D    |  5 | Deepak    |   19 | M      |
|  4 | H    |  5 | Deepak    |   19 | M      |
|  3 | D    |  5 | Deepak    |   19 | M      |
|  2 | D    |  5 | Deepak    |   19 | M      |
|  1 | H    |  5 | Deepak    |   19 | M      |
|  7 | H    |  6 | Kasi      |   19 | M      |
|  6 | H    |  6 | Kasi      |   19 | M      |
|  5 | D    |  6 | Kasi      |   19 | M      |
|  4 | H    |  6 | Kasi      |   19 | M      |
|  3 | D    |  6 | Kasi      |   19 | M      |
|  2 | D    |  6 | Kasi      |   19 | M      |
|  1 | H    |  6 | Kasi      |   19 | M      |
|  7 | H    |  7 | Keerthana |   19 | F      |
|  6 | H    |  7 | Keerthana |   19 | F      |
|  5 | D    |  7 | Keerthana |   19 | F      |
|  4 | H    |  7 | Keerthana |   19 | F      |
|  3 | D    |  7 | Keerthana |   19 | F      |
|  2 | D    |  7 | Keerthana |   19 | F      |
|  1 | H    |  7 | Keerthana |   19 | F      |
+----+------+----+-----------+------+--------+
49 rows in set (0.00 sec)

mysql> select * from Hostellers cross join students_1 on Hostellers.id = students_1.id;
+----+------+----+-----------+------+--------+
| id | name | id | name      | age  | gender |
+----+------+----+-----------+------+--------+
|  1 | H    |  1 | Venkat    |   18 | M      |
|  2 | D    |  2 | Suguram   |   19 | M      |
|  3 | D    |  3 | Musaraf   |   20 | M      |
|  4 | H    |  4 | Meenu     |   19 | F      |
|  5 | D    |  5 | Deepak    |   19 | M      |
|  6 | H    |  6 | Kasi      |   19 | M      |
|  7 | H    |  7 | Keerthana |   19 | F      |
+----+------+----+-----------+------+--------+
7 rows in set (0.00 sec)

mysql> use College;
Database changed
mysql> create table join_1(id int, name varchar(20) not null);
Query OK, 0 rows affected (0.05 sec)

mysql> create table join_2(id int, name varchar(20) not null);
Query OK, 0 rows affected (0.04 sec)

mysql> insert into join_1 values(1, "Venkat");
Query OK, 1 row affected (0.01 sec)

mysql> insert into join_2 values(2, "Annamalai");
Query OK, 1 row affected (0.00 sec)

mysql> select * from join_1 inner join join_2 on join_1.id = join_2.id;
Empty set (0.01 sec)

mysql> select * from join_1;
+------+--------+
| id   | name   |
+------+--------+
|    1 | Venkat |
+------+--------+
1 row in set (0.00 sec)

mysql> select * from join_2;
+------+-----------+
| id   | name      |
+------+-----------+
|    2 | Annamalai |
+------+-----------+
1 row in set (0.00 sec)

mysql> update join_2 set id = 1 where id = 2;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from join_2;
+------+-----------+
| id   | name      |
+------+-----------+
|    1 | Annamalai |
+------+-----------+
1 row in set (0.00 sec)

mysql> select * from join_1 inner join join_2 on join_1.id = join_2.id;
+------+--------+------+-----------+
| id   | name   | id   | name      |
+------+--------+------+-----------+
|    1 | Venkat |    1 | Annamalai |
+------+--------+------+-----------+
1 row in set (0.00 sec)

mysql> select * from join_1 cross join join_2;
+------+--------+------+-----------+
| id   | name   | id   | name      |
+------+--------+------+-----------+
|    1 | Venkat |    1 | Annamalai |
+------+--------+------+-----------+
1 row in set (0.00 sec)

mysql> insert into join_2 values(2, "Ulga paithiyam");
Query OK, 1 row affected (0.01 sec)

mysql> insert into join_1 values(2, "Maady");
Query OK, 1 row affected (0.01 sec)

mysql> select * from join_1 cross join join_2;
+------+--------+------+----------------+
| id   | name   | id   | name           |
+------+--------+------+----------------+
|    2 | Maady  |    1 | Annamalai      |
|    1 | Venkat |    1 | Annamalai      |
|    2 | Maady  |    2 | Ulga paithiyam |
|    1 | Venkat |    2 | Ulga paithiyam |
+------+--------+------+----------------+
4 rows in set (0.00 sec)

mysql> select * from join_1;
+------+--------+
| id   | name   |
+------+--------+
|    1 | Venkat |
|    2 | Maady  |
+------+--------+
2 rows in set (0.00 sec)

mysql> select * from join_2;
+------+----------------+
| id   | name           |
+------+----------------+
|    1 | Annamalai      |
|    2 | Ulga paithiyam |
+------+----------------+
2 rows in set (0.00 sec)

mysql> select * from join_1 cross join join_2;
+------+--------+------+----------------+
| id   | name   | id   | name           |
+------+--------+------+----------------+
|    2 | Maady  |    1 | Annamalai      |
|    1 | Venkat |    1 | Annamalai      |
|    2 | Maady  |    2 | Ulga paithiyam |
|    1 | Venkat |    2 | Ulga paithiyam |
+------+--------+------+----------------+
4 rows in set (0.00 sec)

mysql> select * from join_1 inner join join_2;
+------+--------+------+----------------+
| id   | name   | id   | name           |
+------+--------+------+----------------+
|    2 | Maady  |    1 | Annamalai      |
|    1 | Venkat |    1 | Annamalai      |
|    2 | Maady  |    2 | Ulga paithiyam |
|    1 | Venkat |    2 | Ulga paithiyam |
+------+--------+------+----------------+
4 rows in set (0.00 sec)

mysql> select * from join_1 cross join join_2 on join_1.id = join_2.id;
+------+--------+------+----------------+
| id   | name   | id   | name           |
+------+--------+------+----------------+
|    1 | Venkat |    1 | Annamalai      |
|    2 | Maady  |    2 | Ulga paithiyam |
+------+--------+------+----------------+
2 rows in set (0.00 sec)

mysql> select * from join_1 cross join join_2 on join_1.name = join_2.name;
Empty set (0.00 sec)

mysql> update join_2 set name = "Maady" where id = 2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from join_2;
+------+-----------+
| id   | name      |
+------+-----------+
|    1 | Annamalai |
|    2 | Maady     |
+------+-----------+
2 rows in set (0.00 sec)

mysql> select * from join_1 cross join join_2 on join_1.name = join_2.name;
+------+-------+------+-------+
| id   | name  | id   | name  |
+------+-------+------+-------+
|    2 | Maady |    2 | Maady |
+------+-------+------+-------+
1 row in set (0.00 sec)

mysql> select * from join_1 inner join join_2;
+------+--------+------+-----------+
| id   | name   | id   | name      |
+------+--------+------+-----------+
|    2 | Maady  |    1 | Annamalai |
|    1 | Venkat |    1 | Annamalai |
|    2 | Maady  |    2 | Maady     |
|    1 | Venkat |    2 | Maady     |
+------+--------+------+-----------+
4 rows in set (0.00 sec)

mysql> select * from join_1 inner join join_2 on join_1.id = join_2.id;
+------+--------+------+-----------+
| id   | name   | id   | name      |
+------+--------+------+-----------+
|    1 | Venkat |    1 | Annamalai |
|    2 | Maady  |    2 | Maady     |
+------+--------+------+-----------+
2 rows in set (0.00 sec)

mysql> select * from join_1;
+------+--------+
| id   | name   |
+------+--------+
|    1 | Venkat |
|    2 | Maady  |
+------+--------+
2 rows in set (0.00 sec)

mysql> select * from join_2;
+------+-----------+
| id   | name      |
+------+-----------+
|    1 | Annamalai |
|    2 | Maady     |
+------+-----------+
2 rows in set (0.00 sec)

mysql> update join_2 set name = "Ulga paithiyam" where id = 2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from join_2;
+------+----------------+
| id   | name           |
+------+----------------+
|    1 | Annamalai      |
|    2 | Ulga paithiyam |
+------+----------------+
2 rows in set (0.00 sec)

mysql> select * from join_1 inner join join_2;
+------+--------+------+----------------+
| id   | name   | id   | name           |
+------+--------+------+----------------+
|    2 | Maady  |    1 | Annamalai      |
|    1 | Venkat |    1 | Annamalai      |
|    2 | Maady  |    2 | Ulga paithiyam |
|    1 | Venkat |    2 | Ulga paithiyam |
+------+--------+------+----------------+
4 rows in set (0.00 sec)

mysql> truncate join_1;
Query OK, 0 rows affected (0.06 sec)

mysql> insert into join_1 values(1, "Venkat"),(2, "Maddy");
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> select * from join_1;
+------+--------+
| id   | name   |
+------+--------+
|    1 | Venkat |
|    2 | Maddy  |
+------+--------+
2 rows in set (0.00 sec)

mysql> select * from join_1 inner join join_2;
+------+--------+------+----------------+
| id   | name   | id   | name           |
+------+--------+------+----------------+
|    2 | Maddy  |    1 | Annamalai      |
|    1 | Venkat |    1 | Annamalai      |
|    2 | Maddy  |    2 | Ulga paithiyam |
|    1 | Venkat |    2 | Ulga paithiyam |
+------+--------+------+----------------+
4 rows in set (0.00 sec)

mysql> insert into join_1 values(3, "Suguram"),(4, "Haiden"),(5, "Aswath");
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0
