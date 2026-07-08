BEGIN
    FOR VIPS IN (
        SELECT CUSTOMER_ID
        FROM customer_details
        WHERE BALANCE >= 10000
    ) LOOP
        UPDATE customer_details
        SET ISVIP = 'Y'
        WHERE CUSTOMER_ID = VIPS.CUSTOMER_ID;
    END LOOP;
    COMMIT;
END;
/
