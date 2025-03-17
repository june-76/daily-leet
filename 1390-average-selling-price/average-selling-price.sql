/* Write your PL/SQL query statement below */

-- 각 제품 별로 평균 판매 금액을 찾기.
-- 소수점 2번째 자리까지 반올림 한다.
-- 판매액이 없는 경우, 0원으로 가정한다.

SELECT
    p.product_id,
    ROUND(COALESCE(SUM(p.price * u.units) / NULLIF(SUM(u.units), 0), 0), 2) average_price
FROM Prices p
LEFT JOIN UnitsSold u
    ON p.product_id = u.product_id
    AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id;