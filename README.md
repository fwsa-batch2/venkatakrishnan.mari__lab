## Welcome to kfc

### Database


### Use query to use database

      use `welcome_to_kfc`;
      
### show tables  
      
      show tables; 
      
### drop tables

      drop table `orders`;
      drop table `price`;  
      drop table `Menu`;
      drop table `Category`;
      drop table `users`;

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
    desc `users`;
    


    insert into `users`(`first_name`,`last_name`,`email`,`password`) values("Venkata", "Krishnan", "venkatakrishnan434@gmail.com", "venkat434");

    select * from `users`;


### Table: Category

       create table `Category`(
      `id`int primary key auto_increment,
      `cat_name` varchar(100) not null,
      `Created_date` timestamp not null default current_timestamp,
       unique(cat_name)
       );
       insert into `Category`(`id`,`cat_name`) values(1, "Featured"),(2, "Buckets"),(3, "Trending"),(4, "Offer"),(5, "Burger"),(6, "Rice_bowls"),(7, "Snacks"),(8, "Beverage");
       select * from `Category`;

### Table: Menu

        create table `Menu`(
       `id`int primary key auto_increment,
       `food_name`varchar(100) not null,
       `cat_id`int not null,
       `Created_date` timestamp not null default current_timestamp,
       foreign key(cat_id) references `Category`(id),
       unique(`food_name`)
       );

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
         select * from `Menu`;
         truncate table `Menu`;


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
       insert into `orders`(`order_id`,`user_id`,`cat_id`,`food_id`,`food_name`,`price_id`,`food_price`,`Quantity`) values(1, 1, 1, 1, "Side lover meal", 1, 140.00, 2);


### Table: Price

        create table `price`(
       `id`int primary key auto_increment,
       `food_id`int not null,
       `food_price`decimal(10,2) not null,
       `created_date` timestamp not null default current_timestamp ,
       foreign key (food_id) references `Menu`(id)

       );
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


### Table: Payments

       create table `payments`(
       `order_id`int not null, foreign key (order_id) references `orders`(order_id),
       `amount`bigint not null,
       `payment_id`int primary key auto_increment,
       `payment_type`enum('cash on delivery','online payment') not null,
       `payment_status`enum('recieved','not recieved') not null,
       `created_date` timestamp not null default current_timestamp 
        );

       insert into `payments`(`order_id`,`amount`,`payment_id`,`payment_type`,`payment_status`) values(1, 280, 1, "online payment", "recieved");

### select query

       select * from `payments`;
       select * from `orders`;
       select * from `price`;
       select * from `Menu`;
       select * from `users`;
       select * from `Menu`;
       
### desc query

       desc `users`;
       desc `Category`;
       desc `Menu`;
       desc `orders`;
       desc `price`;
       desc `payments`;
