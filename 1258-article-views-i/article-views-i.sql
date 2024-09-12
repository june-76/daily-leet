# Write your MySQL query statement below

-- 저자가 자신의 아티클을 읽은 경우를 오름차순으로 조회
select distinct author_id as id
from Views
where author_id = viewer_id
order by id;