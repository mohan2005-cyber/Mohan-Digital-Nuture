CREATE TABLE customer_details (
    customer_id INT PRIMARY KEY,
    name VARCHAR2(100) NOT NULL,
    age INT NOT NULL,
    balance NUMBER(10, 2) NOT NULL,
    isvip CHAR(1) DEFAULT 'N' CHECK (isvip IN ('Y', 'N'))
);
