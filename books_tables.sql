CREATE TABLE books (
   Title TEXT NOT NULL,
   Author TEXT NOT NULL,
   ISBN TEXT UNIQUE NOT NULL,
   Genre TEXT,
   Publication_Year INTEGER,
   Price DECIMAL(10,2),
   Stock_Quantity INTEGER
);