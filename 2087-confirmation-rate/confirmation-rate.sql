/* Write your PL/SQL query statement below */

-- 유저ID 별로 action 컬럼이 확인된(confirmed) 비율을 출력하기

SELECT s.user_id,
    CASE 
        WHEN COUNT(c.action) = 0 THEN 0
        ELSE ROUND(SUM(CASE WHEN c.action = 'confirmed' THEN 1 ELSE 0 END) / COUNT(c.action), 2)
    END AS confirmation_rate
FROM Signups s
LEFT OUTER JOIN Confirmations c ON s.user_id = c.user_id
GROUP BY s.user_id;