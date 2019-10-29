DROP TABLE IF EXISTS USERS;
CREATE TABLE users (
  id INT(11) NOT NULL,
  name VARCHAR(25),
  PRIMARY KEY (id)
);

INSERT INTO users
   VALUES (1, 'Nick'),
   (2, 'Ed') ,
   (3, 'Igor'),
   (4,'Yarik');

DROP TABLE IF EXISTS TRAVELS;
CREATE TABLE travels (
  travel_id INT(11) NOT NULL,
  user_id INT(11) NOT NULL,
  name VARCHAR(25),
  PRIMARY KEY (travel_id)
  FOREIGN KEY (user_id) REFERENCES
);

INSERT INTO travels
   VALUES (1, 1, 'Travel 1'),
   (2, 1, 'Travel 2') ,
   (3, 2, 'Travel 3'),
   (4, 3, 'Travel 4');