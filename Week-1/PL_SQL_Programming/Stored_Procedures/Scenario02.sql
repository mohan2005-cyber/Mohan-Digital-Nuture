CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_BonusPercent IN INT,
    p_Dept_id IN INT
) AS
BEGIN
    
    UPDATE Employee_table
    SET Salary = Salary + (Salary * (p_BonusPercent / 100))
    WHERE Dept_id = p_Dept_id;
    
    COMMIT;
END UpdateEmployeeBonus;
/

BEGIN
    UpdateEmployeeBonus(5, 10);
END;
/