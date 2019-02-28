CREATE TABLE ObjectType
(
  id   INT PRIMARY KEY AUTO_INCREMENT,
  type VARCHAR(255) NOT NULL
);

CREATE TABLE Location
(
  id  INT PRIMARY KEY AUTO_INCREMENT,
  lat DECIMAL(10,6) NOT NULL,
  lng DECIMAL(10,6) NOT NULL
);

CREATE TABLE Object
(
  id            INT PRIMARY KEY AUTO_INCREMENT,
  title          VARCHAR(255) NOT NULL,
  type          INT          NOT NULL,
  location      INT          NOT NULL,
  description   VARCHAR(255) NOT NULL,
  FOREIGN KEY (type) REFERENCES ObjectType(id),
  FOREIGN KEY (location) REFERENCES Location(id)
);