BEGIN
    INSERT INTO Account_table (Acc_id, emp_id, Acc_type, Balance) VALUES (5001, 101, 'Savings', 2500.50);
    INSERT INTO Account_table (Acc_id, emp_id, Acc_type, Balance) VALUES (5002, 102, 'Checking', 450.00);
    INSERT INTO Account_table (Acc_id, emp_id, Acc_type, Balance) VALUES (5003, 103, 'Savings', 12800.75);
    INSERT INTO Account_table (Acc_id, emp_id, Acc_type, Balance) VALUES (5004, 104, 'Checking', 35000.00);
    INSERT INTO Account_table (Acc_id, emp_id, Acc_type, Balance) VALUES (5005, 105, 'Savings', 120.00);
    INSERT INTO Account_table (Acc_id, emp_id, Acc_type, Balance) VALUES (5006, 106, 'Savings', 5400.00);
    INSERT INTO Account_table (Acc_id, emp_id, Acc_type, Balance) VALUES (5007, 107, 'Checking', 2100.25);

    COMMIT;
END;
/