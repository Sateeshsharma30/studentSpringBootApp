CREATE TABLE IF NOT EXISTS Users(
  name  VARCHAR(150),
  email   VARCHAR(150),
  id       number ,
  
  CONSTRAINT id_users_unique UNIQUE (id)
);