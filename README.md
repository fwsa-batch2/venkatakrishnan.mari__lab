## Welcome to kfc DBMS

### Show databases


| Database           |
|:------------------:|
| College            |
| Lab_works          |
| constraints        |
| foreignKey         |
| information_schema |
| mysql              |
| performance_schema |
| school_mangagement |
| students           |
| sys                |
| welcome_to_kfc     |

### Use query to use database

      use `welcome_to_kfc`;
      
### show tables  
      
| Tables_in_welcome_to_kfc |
|:------------------------:|
| Category                 |
| Menu                     |
| Roles                    |
| orders                   |
| payments                 |
| price                    |
| users                    |

### Table: User

     create table `users`(
    `id` int primary key auto_increment,
    `first_name` varchar(50) not null,
    `last_name` varchar(50) not null,
    `email` varchar(100) not null,
    `password` varchar(50) not null,
    `Active` boolean not null default TRUE,
    `Created_date` timestamp not null default current_timestamp,
    `Modified_date` timestamp not null default current_timestamp on update current_timestamp,
    
    unique(email));
    
### desc `users`;
    
| Field         | Type         | Null | Key | Default           | Extra                                         |
|:--------------:|-------------:|-----:|----:|------------------:|----------------------------------------------:|
| id            | int          | NO   | PRI | NULL              | auto_increment                                |
| first_name    | varchar(50)  | NO   |     | NULL              |                                               |
| last_name     | varchar(50)  | NO   |     | NULL              |                                               |
| email         | varchar(100) | NO   | UNI | NULL              |                                               |
| password      | varchar(50)  | NO   |     | NULL              |                                               |
| Active        | tinyint(1)   | NO   |     | 1                 |                                               |
| Created_date  | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED                             |
| Modified_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED on update CURRENT_TIMESTAMP |

 ### Insert values into users
 
    insert into `users`(`first_name`,`last_name`,`email`,`password`) values("Venkata", "Krishnan", "venkatakrishnan434@gmail.com", "venkat434");
    select * from `users`;

### Select querey

    select * from users;
 
 
 
 
 
| id | first_name | last_name | email                        | password    | Active | Created_date        | Modified_date       |
|:--:|-----------:|----------:|-----------------------------:|------------:|-------:|--------------------:|--------------------:|
|  1 | Venkata    | Krishnan  | venkatakrishnan434@gmail.com | venkat434   |      1 | 2022-03-17 12:49:03 | 2022-03-17 12:49:03 |
|  2 | Suguram    | Krishna   | sugukrishna234@gmail.com     | sugu23@4    |      1 | 2022-03-21 14:16:57 | 2022-03-21 14:16:57 |
|  3 | Haiden     | Arulappan | hibyehaiden343@gmail.com     | hiby@hai343 |      1 | 2022-03-21 14:16:57 | 2022-03-21 14:16:57 |
|  4 | Aswath     | Kaja      | aswathbai34@gmail.com        | alone@tiger |      1 | 2022-03-21 14:16:57 | 2022-03-21 14:16:57 |
|  5 | Mohammed   | musaraf   | hasanmusaraf@gmail.com       | musaraf433  |      1 | 2022-03-21 14:16:57 | 2022-03-21 14:16:57 |

### Table: Roles

    create table `Roles`(`id`int primary key auto_increment, `user_id`int not null, `name`varchar(50) not null, foreign key(user_id)               references`users`(id));  
    
### desc Roles;

| Field   | Type        | Null | Key | Default | Extra          |
|:-------:|------------:|-----:|----:|--------:|---------------:|
| id      | int         | NO   | PRI | NULL    | auto_increment |
| user_id | int         | NO   | MUL | NULL    |                |
| name    | varchar(50) | NO   |     | NULL    |                |

### insert values into Roles
     
     insert into `Roles`(`user_id`, `name`) values(6, "Admin");
     
### select query
     
     select * from `Roles`;
     

| id | user_id | name  |
|:--:|--------:|------:|
|  1 |       6 | Admin |


### Table: Category

       create table `Category`(
      `id`int primary key auto_increment,
      `cat_name` varchar(100) not null,
      `Created_date` timestamp not null default current_timestamp,
       unique(cat_name)
       );
### desc Category

| Field        | Type         | Null | Key | Default           | Extra             |
|:------------:|-------------:|-----:|----:|------------------:|------------------:|
| id           | int          | NO   | PRI | NULL              | auto_increment    |
| cat_name     | varchar(100) | NO   | UNI | NULL              |                   |
| Created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |


### Insert values into Category

       insert into `Category`(`id`,`cat_name`) values(1, "Featured"),(2, "Buckets"),(3, "Trending"),(4, "Offer"),(5, "Burger"),(6, "Rice_bowls"),(7,     "Snacks"),(8, "Beverage");
       
### Select querey

       select * from `Category`;




      
| id | cat_name   | Created_date        |
|:--:|-----------:|--------------------:|
|  1 | Featured   | 2022-03-21 21:21:49 |
|  2 | Buckets    | 2022-03-21 21:21:49 |
|  3 | Trending   | 2022-03-21 21:21:49 |
|  4 | Offer      | 2022-03-21 21:21:49 |
|  5 | Burger     | 2022-03-21 21:21:49 |
|  6 | Rice_bowls | 2022-03-21 21:21:49 |
|  7 | Snacks     | 2022-03-21 21:21:49 |
|  8 | Beverage   | 2022-03-21 21:21:49 |



### Table: Menu

        create table `Menu`(
       `id`int primary key auto_increment,
       `food_name`varchar(100) not null,
       `cat_id`int not null,
       `Created_date` timestamp not null default current_timestamp,
       foreign key(cat_id) references `Category`(id),
       unique(`food_name`)
       );
### desc Menu

| Field        | Type         | Null | Key | Default           | Extra             |
|:-------------|:-------------|:----:|----:|------------------:|------------------:|
| id           | int          | NO   | PRI | NULL              | auto_increment    |
| food_name    | varchar(100) | NO   | UNI | NULL              |                   |
| cat_id       | int          | NO   | MUL | NULL              |                   |
| Created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

### Insert values into Menu

        insert into `Menu`(`id`,`food_name`,`cat_id`) values
         (1, "Side lover meal", 1),
         (2, "Fill up", 2),
         (3, "pot pie", 6),
         (4, "Diet pepsi", 8),
         (5, "8pc meal", 1),
         (6, "8pc feast", 2),
         (7, "Tender combo", 3),
         (8, "16pc tender", 3),
         (9, "Pepsi", 8),
         (10, "Mountain dew", 8),
         (11, "Choco chip", 7),
         (12, "Choco chip cake", 7),
         (13, "Famous bowl", 6),
         (14, "French fries", 7),
         (15, "Chicken combo", 5),
         (16, "Veg krisper combo", 5),
         (17, "Tandoori burger", 5),
         (18, "Large popcorn", 7) 
         ;
         
### Select querey

         select * from `Menu`;
 
 
 
        
| id | food_name         | cat_id | Created_date        |
|:--:|------------------:|-------:|--------------------:|
|  1 | Side lover meal   |      1 | 2022-03-21 21:52:16 |
|  2 | Fill up           |      2 | 2022-03-21 21:52:16 |
|  3 | pot pie           |      6 | 2022-03-21 21:52:16 |
|  4 | Diet pepsi        |      8 | 2022-03-21 21:52:16 |
|  5 | 8pc meal          |      1 | 2022-03-21 21:52:16 |
|  6 | 8pc feast         |      2 | 2022-03-21 21:52:16 |
|  7 | Tender combo      |      3 | 2022-03-21 21:52:16 |
|  8 | 16pc tender       |      3 | 2022-03-21 21:52:16 |
|  9 | Pepsi             |      8 | 2022-03-21 21:52:16 |
| 10 | Mountain dew      |      8 | 2022-03-21 21:52:16 |
| 11 | Choco chip        |      7 | 2022-03-21 21:52:16 |
| 12 | Choco chip cake   |      7 | 2022-03-21 21:52:16 |
| 13 | Famous bowl       |      6 | 2022-03-21 21:52:16 |
| 14 | French fries      |      7 | 2022-03-21 21:52:16 |
| 15 | Chicken combo     |      5 | 2022-03-21 21:52:16 |
| 16 | Veg krisper combo |      5 | 2022-03-21 21:52:16 |
| 17 | Tandoori burger   |      5 | 2022-03-21 21:52:16 |
| 18 | Large popcorn     |      7 | 2022-03-21 21:52:16 |



 ### Table: Orders
 
       create table `orders`(
      `order_id`int primary key auto_increment,
      `user_id`int not null,foreign key (user_id) references `users`(id),
      `cat_id`int not null, foreign key (cat_id) references `Category`(id),
      `food_id`int not null,foreign key (food_id) references `Menu`(id),
      `food_name` varchar(100) not null,
      `price_id`int not null,foreign key (price_id) references `price`(id),
      `food_price`decimal(10,2) not null,
      `Quantity`int not null,
      `ordered_date` timestamp not null default current_timestamp 
       ); 
       
 ### desc Orders
 

| Field        | Type          | Null | Key | Default           | Extra             |
|:------------:|--------------:|-----:|----:|------------------:|------------------:|
| order_id     | int           | NO   | PRI | NULL              | auto_increment    |
| user_id      | int           | NO   | MUL | NULL              |                   |
| cat_id       | int           | NO   | MUL | NULL              |                   |
| food_id      | int           | NO   | MUL | NULL              |                   |
| food_name    | varchar(100)  | NO   |     | NULL              |                   |
| price_id     | int           | NO   | MUL | NULL              |                   |
| food_price   | decimal(10,2) | NO   |     | NULL              |                   |
| Quantity     | int           | NO   |     | NULL              |                   |
| ordered_date | timestamp     | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

 ### Insert values into orders
 
       insert into `orders`(`order_id`,`user_id`,`cat_id`,`food_id`,`food_name`,`price_id`,`food_price`,`Quantity`) values(1, 1, 1, 1, "Side lover meal", 1, 140.00, 2);
       
### Select querey

      select * from orders;
  
  
  
  
     
| order_id | user_id | cat_id | food_id | food_name       | price_id | food_price | Quantity | ordered_date        |
|:--------:|--------:|-------:|--------:|----------------:|---------:|-----------:|---------:|--------------------:|
|        1 |       1 |      1 |       1 | Side lover meal |        1 |     140.00 |        2 | 2022-03-22 11:47:25 |
|        2 |       1 |      6 |       3 | Pot pie         |        3 |     100.00 |        1 | 2022-03-22 15:01:26 |


### Table: price

        create table `price`(
       `id`int primary key auto_increment,
       `food_id`int not null,
       `food_price`decimal(10,2) not null,
       `created_date` timestamp not null default current_timestamp ,
       foreign key (food_id) references `Menu`(id)

       );
       
### desc price


| Field        | Type          | Null | Key | Default           | Extra             |
|:------------:|--------------:|-----:|----:|------------------:|------------------:|
| id           | int           | NO   | PRI | NULL              | auto_increment    |
| food_id      | int           | NO   | MUL | NULL              |                   |
| food_price   | decimal(10,2) | NO   |     | NULL              |                   |
| created_date | timestamp     | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

### Insert values into price

       insert into `price`(`id`,`food_id`,`food_price`) values
       (1, 1, 140.00),
       (2, 2, 110.00),
       (3, 3, 100.00),
       (4, 4, 50.00),
       (5, 5, 100.00),
       (6, 6, 140.00),
       (7, 7, 160.00),
       (8, 8, 120.00),
       (9, 9, 170.00),
       (10, 10, 200.00),
       (11, 11, 170.00),
       (12, 12, 140.00),
       (13, 13, 150.00),
       (14, 14, 120.00),
       (15, 15, 100.00),
       (16, 16, 120.00),
       (17, 17, 150.00),  
       (18, 18, 130.00) 
       ;
       
### Select querey

       select * from price;
       
   
   
   
| id | food_id | food_price | created_date        |
|:--:|--------:|-----------:|--------------------:|
|  1 |       1 |     140.00 | 2022-03-22 11:24:30 |
|  2 |       2 |     110.00 | 2022-03-22 11:24:30 |
|  3 |       3 |     100.00 | 2022-03-22 11:24:30 |
|  4 |       4 |      50.00 | 2022-03-22 11:24:30 |
|  5 |       5 |     100.00 | 2022-03-22 11:24:30 |
|  6 |       6 |     140.00 | 2022-03-22 11:24:30 |
|  7 |       7 |     160.00 | 2022-03-22 11:24:30 |
|  8 |       8 |     120.00 | 2022-03-22 11:24:30 |
|  9 |       9 |     170.00 | 2022-03-22 11:24:30 |
| 10 |      10 |     200.00 | 2022-03-22 11:24:30 |
| 11 |      11 |     170.00 | 2022-03-22 11:24:30 |
| 12 |      12 |     140.00 | 2022-03-22 11:24:30 |
| 13 |      13 |     150.00 | 2022-03-22 11:24:30 |
| 14 |      14 |     120.00 | 2022-03-22 11:24:30 |
| 15 |      15 |     100.00 | 2022-03-22 11:24:30 |
| 16 |      16 |     120.00 | 2022-03-22 11:24:30 |
| 17 |      17 |     150.00 | 2022-03-22 11:24:30 |
| 18 |      18 |     130.00 | 2022-03-22 11:24:30 |




### Table: payments

       create table `payments`(
       `order_id`int not null, foreign key (order_id) references `orders`(order_id),
       `amount`bigint not null,
       `payment_id`int primary key auto_increment,
       `payment_type`enum('cash on delivery','online payment') not null,
       `payment_status`enum('recieved','not recieved') not null,
       `created_date` timestamp not null default current_timestamp 
        );
        
### desc Payments

| Field          | Type                                      | Null | Key | Default           | Extra             |
|:--------------:|------------------------------------------:|-----:|----:|------------------:|------------------:|
| order_id       | int                                       | NO   | MUL | NULL              |                   |
| amount         | bigint                                    | NO   |     | NULL              |                   |
| payment_id     | int                                       | NO   | PRI | NULL              | auto_increment    |
| payment_type   | enum('cash on delivery','online payment') | NO   |     | NULL              |                   |
| payment_status | enum('recieved','not recieved')           | NO   |     | NULL              |                   |
| created_date   | timestamp                                 | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

### Insert values into payments

       insert into `payments`(`order_id`,`amount`,`payment_id`,`payment_type`,`payment_status`) values(1, 280, 1, "online payment", "recieved");

### Select query

       select * from `payments`;
       
       
       
       
| order_id | amount | payment_id | payment_type   | payment_status | created_date        |
|:--------:|-------:|-----------:|---------------:|---------------:|--------------------:|
|        1 |    280 |          1 | online payment | recieved       | 2022-03-22 11:59:04 |



    
 ### ER diagram of welcome_to_kfc
 
![Drawing (3)](https://user-images.githubusercontent.com/93571040/159661524-83566c76-765f-4391-b725-e1d8d756abe3.png)


### EER diagram

![EER 1](https://user-images.githubusercontent.com/93571040/160343046-88fef71a-154a-406b-a243-859cbd47cc50.png)
