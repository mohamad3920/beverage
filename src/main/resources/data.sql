-- Create Users
CREATE TABLE IF NOT EXISTS SHOP_USER
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    birthdate DATE
    );

INSERT INTO shop_user (id, username, password, birthdate)
VALUES (1, 'admin', 'admin', '1990-01-01');
--
CREATE TABLE IF NOT EXISTS ADDRESS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    city VARCHAR(255) NOT NULL,
    street VARCHAR(255) NOT NULL,
    number VARCHAR(50),
    POSTAL_CODE VARCHAR(20),
    FOREIGN KEY (user_id) REFERENCES SHOP_USER (id)
    );

-- Create Addresses
INSERT INTO address (id, city, street, number, POSTAL_CODE, user_id)
VALUES (1, 'CityA', 'Street1', '101', '11111', '1'),
       (2, 'CityB', 'Street2', '102', '22222', '1'),
       (3, 'CityC', 'Street3', '103', '33333', '1'),
       (4, 'CityD', 'Street4', '104', '44444', '1');

CREATE TABLE IF NOT EXISTS SHOP_ORDER (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    price DOUBLE NOT NULL,
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES SHOP_USER(id)
    );

-- Create Orders
INSERT INTO shop_order (id, price, user_id)
VALUES (1, 100.0, 1),
       (2, 200.0, 1);

CREATE TABLE IF NOT EXISTS ORDER_ITEM (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    position VARCHAR(255),
    price DOUBLE NOT NULL,
    order_id BIGINT,
    FOREIGN KEY (order_id) REFERENCES SHOP_ORDER (id)
    );

-- Create OrderItems and assign them to Orders
INSERT INTO order_item (id, position, price, order_id)
VALUES (1, 'Item 1', 10.0, 1),
       (2, 'Item 2', 20.0, 1),
       (3, 'Item 3', 15.0, 2),
       (4, 'Item 4', 25.0, 2);

CREATE TABLE IF NOT EXISTS BOTTLE (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    bottlePic VARCHAR(255),
    volume DOUBLE NOT NULL,
    isAlcoholic BOOLEAN,
    volumePercent DOUBLE,
    price DOUBLE NOT NULL,
    supplier VARCHAR(255),
    inStock INT NOT NULL
    );

-- Bottle Table
INSERT INTO bottle (id, name, bottle_pic, volume, is_alcoholic, volume_percent, price, supplier, in_stock)
VALUES (1, 'Beer', 'beer.jpg', 0.5, true, 5.0, 3.5, 'Local Brewery', 50),
       (2, 'Water', 'water.jpg', 1.0, false, 0.0, 1.0, 'Spring Co.', 200),
       (3, 'Wine', 'wine.jpg', 0.75, true, 12.5, 15.0, 'Vineyard', 30),
       (4, 'Whiskey', 'whiskey.jpg', 0.7, true, 40.0, 40.0, 'Distillery', 15),
       (5, 'Soda', 'soda.jpg', 0.33, false, 0.0, 1.5, 'Soda Co.', 100),
       (6, 'Juice', 'juice.jpg', 1.0, false, 0.0, 3.0, 'Orchard Co.', 75),
       (7, 'Champagne', 'champagne.jpg', 0.75, true, 11.5, 50.0, 'Winery', 10),
       (8, 'Tequila', 'tequila.jpg', 0.7, true, 38.0, 25.0, 'Distillery', 20),
       (9, 'Cider', 'cider.jpg', 0.5, true, 4.5, 3.0, 'Cider Co.', 60),
       (10, 'Milk', 'milk.jpg', 1.0, false, 0.0, 1.2, 'Dairy Co.', 120);

CREATE TABLE IF NOT EXISTS CRATE (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    cratePic VARCHAR(255),
    noOfBottles INT NOT NULL,
    price DOUBLE NOT NULL,
    cratesInStock INT NOT NULL
    );

-- Crate Table
INSERT INTO crate (id, name, crate_pic, no_of_bottles, price, crates_in_stock)
VALUES (1, 'Beer Crate', 'beer_crate.jpg', 24, 75.0, 20),
       (2, 'Water Crate', 'water_crate.jpg', 12, 12.0, 50),
       (3, 'Wine Crate', 'wine_crate.jpg', 6, 90.0, 10),
       (4, 'Soda Crate', 'soda_crate.jpg', 12, 18.0, 30),
       (5, 'Juice Crate', 'juice_crate.jpg', 6, 15.0, 25),
       (6, 'Milk Crate', 'milk_crate.jpg', 12, 14.4, 40),
       (7, 'Whiskey Crate', 'whiskey_crate.jpg', 6, 240.0, 5),
       (8, 'Cider Crate', 'cider_crate.jpg', 12, 35.0, 15),
       (9, 'Champagne Crate', 'champagne_crate.jpg', 6, 300.0, 2),
       (10,'Tequila Crate', 'tequila_crate.jpg', 6, 150.0, 8);