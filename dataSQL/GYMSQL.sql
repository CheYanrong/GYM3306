#项目类型表
#drop table projecttype;
CREATE TABLE projecttype
(
	pt_id INT(10) PRIMARY KEY,
	pt_name VARCHAR(30) NOT NULL,
	pt_icon VARCHAR(30) NOT NULL
);
SELECT * FROM projecttype;

#教练表
#drop table coach;
CREATE TABLE coach
(
	c_id INT(10) PRIMARY KEY,
	c_title VARCHAR(50) NOT NULL,
	c_sale INT(10),#会员价
	c_price INT(10),
	c_img VARCHAR(100),
	c_message VARCHAR(100),
	c_distance INT(10),
	d_id INT,
	FOREIGN KEY (d_id) REFERENCES detail(d_id) 
);

#教练详情表
CREATE TABLE detail
(
	d_id INT(10) PRIMARY KEY,
	d_name VARCHAR(50),
	d_age INT(10),
	d_img VARCHAR(100),
	d_phone  VARCHAR(20),
	d_message VARCHAR(100),
	d_image VARCHAR(100)
);

#项目表
#drop table project;
CREATE TABLE project(
	p_id INT(10) PRIMARY KEY,
	p_title VARCHAR(50)NOT NULL,
	p_sale INT(10),
	p_price INT(10),
	p_img VARCHAR(100),
	p_message VARCHAR(100),
	p_count INT(10),
	p_step VARCHAR(200),#介绍
	p_tip VARCHAR(300),#温馨提示
	pt_id INT,
	FOREIGN KEY (pt_id)REFERENCES projecttype(pt_id)
);
#用户表
#drop table users;
CREATE TABLE users(
	u_id INT(10) PRIMARY KEY,
	u_name VARCHAR(50) NOT NULL,
	u_img VARCHAR(100),
	u_age INT(10),
	u_phone VARCHAR(50),
	u_province VARCHAR(50),
	u_city VARCHAR(50),
	u_address VARCHAR(50)
);
#预约表d_
#drop table reservation;
CREATE TABLE reservation(
	r_id INT(10)PRIMARY KEY,
	r_time DATE,
	r_message VARCHAR(50),
	u_id INT,
	FOREIGN KEY(u_id) REFERENCES users(u_id),
	p_id INT,
	FOREIGN KEY(p_id) REFERENCES project(p_id),
	c_id INT,
        FOREIGN KEY(c_id) REFERENCES coach(c_id)

);
#订单表
#drop table orders;
/*CREATE TABLE orders(
	o_id INT(10) PRIMARY KEY ,
	r_id INT,
	FOREIGN KEY(r_id) REFERENCES project(r_id),
);*/


