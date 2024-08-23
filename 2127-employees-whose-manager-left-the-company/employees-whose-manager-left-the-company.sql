# Write your MySQL query statement below

# 1. 봉급이 3000 이하
# 2. 매니저가 퇴사한
# 사원의 id를 조회하기

# 매니저가 퇴사했다는 건, manager_id가 employee_id에 없다는 뜻(NOT IN)

SELECT employee_id
FROM Employees
WHERE salary < 30000
    AND manager_id IS NOT NULL
    AND manager_id NOT IN (SELECT employee_id FROM Employees)
ORDER BY employee_id;