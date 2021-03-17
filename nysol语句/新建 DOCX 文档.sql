//食堂系统
create table restaurant(id int primary key auto_increment,`desc` varchar(30));//餐厅表
create table windows(windowsid int primary key auto_increment,restaurant_id int,food char(10),price decimal(6,2),
foreign key (restaurant_id) references restaurant(id));
create table record(record_id int primary key auto_increment,windows_id int,money_record decimal(6,2),
foreign key(windows_id) references windows(windowsid));
insert into restaurant (`desc`) values ('本餐厅主营米面饺子');
insert into windows(restaurant_id,food,price) values (1,'盖浇饭',7.5);
insert into windows(restaurant_id,food,price) values (1,'饺子',7.5);
drop table if exists windows;
insert into record(windows_id,money_record) values (1,7.5),(1,7.5),(2,7.5),(2,7.5);
//车辆违章系统
create table user(name char(10) primary key,carcard varchar(10));
create table  cars(carid char(10) primary key,model varchar(10),cartype varchar(10),
foreign key (carid) references user (name));
insert  into user(name,carcard) values ('张三','12345');
create table information(information_id char(10),`describe` varchar(30),
foreign key (information_id) references cars(carid));
insert  into user(name,carcard) values ('李四','56789');
insert into cars (carid,model,cartype) values ('张三','大众','suv'),('李四','大众','轿车');
insert into information(information_id,`describe`) values ('张三','不礼让行人'),('李四','闯红灯');
