# Write your MySQL query statement below

-- visit_id가 트랜잭션 테이블에 없으면서
-- visit_id의 개수

/*
SELECT v.customer_id as customer_id, t.visit_id
FROM Visits v
LEFT JOIN Transactions t ON v.visit_id = t.visit_id
WHERE t.visit_id IS NULL;
*/

SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t ON v.visit_id = t.visit_id
WHERE t.visit_id IS NULL
GROUP BY v.customer_id;