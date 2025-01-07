# Write your MySQL query statement below

-- 첫 문자(substring(1, 1))와 그 이후의 문자를 각각 반전시키면 되므로
-- 두 가지 경우를 나누어 처리한 뒤 concat()으로 합쳐준다.
select user_id, concat(upper(substring(name, 1, 1)), lower(substring(name, 2)))as name
from Users
order by user_id;