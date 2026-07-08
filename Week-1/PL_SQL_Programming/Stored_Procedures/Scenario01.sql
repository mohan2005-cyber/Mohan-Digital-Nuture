CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Account_table
    SET Balance = Balance * 1.01
    WHERE Acc_type = 'Savings';
    
    COMMIT;
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/