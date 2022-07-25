CREATE TABLE IF NOT EXISTS Users(
  name  VARCHAR(150),
  email   VARCHAR(150),
  id       number ,
  
  CONSTRAINT email_name_unique UNIQUE (id)
);
