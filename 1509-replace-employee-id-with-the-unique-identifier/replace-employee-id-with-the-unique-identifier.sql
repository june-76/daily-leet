/* Write your PL/SQL query statement below */

-- 두 테이블을 id를 키로 하여 조인하여 unique_id와 name을 조회하되,
-- id 값이 없다면 unique_id는 null로 조회한다.
select uni.unique_id, emp.name
from Employees emp
left outer join EmployeeUNI uni
on emp.id = uni.id