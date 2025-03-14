# Write your MySQL query statement below

# 영화에 평점을 가장 많이 남긴 사람의 이름
# 2020년 2월에 가장 높은 평균 점수를 받은 영화의 이름

(SELECT u.name AS results
FROM MovieRating mr
    JOIN Users AS u
    ON mr.user_id = u.user_id
GROUP BY u.name
ORDER BY count(mr.rating) DESC, u.name
LIMIT 1)

UNION ALL

(SELECT m.title AS results
FROM MovieRating AS mr
    JOIN Movies AS m
    ON mr.movie_id = m.movie_id
WHERE created_at BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY m.title 
ORDER BY AVG(mr.rating) DESC, m.title
LIMIT 1)



