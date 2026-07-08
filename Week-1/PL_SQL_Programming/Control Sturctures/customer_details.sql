BEGIN
    INSERT INTO customer_details (NAME, AGE, CUSTOMER_ID, BALANCE, ISVIP) 
    VALUES ('Alice Smith', 28, 101, 1500.50, 'N');
    
    INSERT INTO customer_details (NAME, AGE, CUSTOMER_ID, BALANCE, ISVIP) 
    VALUES ('Bob Jones', 34, 102, 2450.00, 'N');
    
    INSERT INTO customer_details (NAME, AGE, CUSTOMER_ID, BALANCE, ISVIP) 
    VALUES ('Charlie Brown', 22, 103, 320.75, 'N');
    
    INSERT INTO customer_details (NAME, AGE, CUSTOMER_ID, BALANCE, ISVIP) 
    VALUES ('Diana Prince', 31, 104, 5000.00, 'N');
    
    INSERT INTO customer_details (NAME, AGE, CUSTOMER_ID, BALANCE, ISVIP) 
    VALUES ('Evan Wright', 45, 105, 1250.25, 'N');
    
    INSERT INTO customer_details (NAME, AGE, CUSTOMER_ID, BALANCE, ISVIP) 
    VALUES ('Fiona Gallagher', 29, 106, 85.00, 'N');
    
    INSERT INTO customer_details (NAME, AGE, CUSTOMER_ID, BALANCE, ISVIP) 
    VALUES ('George Clark', 50, 107, 3100.40, 'N');

    -- Commit ensures the records are saved permanently
    COMMIT; 
END;
/
