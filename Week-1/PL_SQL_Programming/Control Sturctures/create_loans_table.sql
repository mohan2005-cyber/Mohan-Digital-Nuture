CREATE TABLE loans (
    loan_id INT PRIMARY KEY,
    customer_id INT NOT NULL,
    interest NUMBER(4, 2) NOT NULL,
    duedate DATE NOT NULL,
    CONSTRAINT fk_loans_customer FOREIGN KEY (customer_id) 
        REFERENCES customer_details(customer_id)
);
