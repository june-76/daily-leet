/* Write your PL/SQL query statement below */

-- managerId가 null이라면, 해당 직원은 매니저가 없다. 자기 자신은 매니저가 될 수 없다.

-- 부하 직원이 최소 5명인 직원의 이름을 찾기
-- direct reports: 부하직원

SELECT name
FROM Employee
WHERE id IN (
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(managerId) >= 5;
);