CREATE OR REPLACE PROCEDURE TransferFunds (
    sender_id IN INT,
    reciver_id IN INT,
    transfer_amount IN INT
) AS
    sender_balance INT; 
BEGIN
    SELECT Balance INTO sender_balance
    FROM Account_table
    WHERE Acc_id=sender_id; 

    IF sender_balance>=transfer_amount THEN

        UPDATE Account_table
        SET Balance = Balance + transfer_amount
        WHERE Acc_id=reciver_id;

        UPDATE Account_table
        SET Balance = Balance - transfer_amount
        WHERE Acc_id=sender_id;

    END IF;
    
    COMMIT;
END TransferFunds;
/

BEGIN
    TransferFunds(5003, 5002, 1000);
END;
/
