BEGIN
    INSERT INTO Employee_table (emp_id, name, Dept_id, Salary) VALUES (101, 'Alice Smith', 10, 75000.00);
    INSERT INTO Employee_table (emp_id, name, Dept_id, Salary) VALUES (102, 'Bob Jones', 20, 62000.50);
    INSERT INTO Employee_table (emp_id, name, Dept_id, Salary) VALUES (103, 'Charlie Brown', 10, 85000.00);
    INSERT INTO Employee_table (emp_id, name, Dept_id, Salary) VALUES (104, 'Diana Prince', 30, 95000.00);
    INSERT INTO Employee_table (emp_id, name, Dept_id, Salary) VALUES (105, 'Evan Wright', 20, 58000.00);
    INSERT INTO Employee_table (emp_id, name, Dept_id, Salary) VALUES (106, 'Fiona Gallagher', 10, 71000.00);
    INSERT INTO Employee_table (emp_id, name, Dept_id, Salary) VALUES (107, 'George Clark', 30, 67000.00);

    COMMIT;
END;
/