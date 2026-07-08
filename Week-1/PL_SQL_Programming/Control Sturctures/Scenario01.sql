BEGIN 
    FOR elders IN (
        SELECT CUSTOMER_ID
        FROM customer_details 
        WHERE AGE >= 60
    ) LOOP
        UPDATE loans
        SET INTEREST = 0.99 * INTEREST
        WHERE CUSTOMER_ID = elders.CUSTOMER_ID;
    END LOOP;
    COMMIT;
END;
/

