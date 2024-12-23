# Write your MySQL query statement below
select distinct a.id
from Weather a, Weather b
where a.temperature > b.temperature
and datediff(a.recordDate,b.recordDate) = 1