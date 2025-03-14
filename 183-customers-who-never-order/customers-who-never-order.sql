# Write your MySQL query statement below

# 어떤 주문도 하지 않은 손님의 이름 찾기

SELECT c.name AS Customers
FROM Customers AS c
LEFT OUTER JOIN Orders AS o ON c.id = o.customerId
WHERE o.customerId IS NULL;