CREATE TABLE Account_table (
    Acc_id INT PRIMARY KEY,
    emp_id INT,
    Acc_type VARCHAR2(50),
    Balance NUMBER(15, 2),
    CONSTRAINT fk_employee FOREIGN KEY (emp_id) REFERENCES Employee_table(emp_id)
);