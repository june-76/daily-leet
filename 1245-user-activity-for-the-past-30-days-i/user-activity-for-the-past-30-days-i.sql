/* Write your PL/SQL query statement below */

-- 2019-07-27을 마지막 날로 한 이전 30일 간의 일일 활성 유저 수 찾기

SELECT TO_CHAR(activity_date, 'YYYY-MM-DD') day, COUNT(DISTINCT user_id) active_users
FROM Activity
WHERE activity_date BETWEEN TO_DATE('2019-07-27', 'YYYY-MM-DD') - INTERVAL '29' DAY AND TO_DATE('2019-07-27', 'YYYY-MM-DD')
GROUP BY activity_date;