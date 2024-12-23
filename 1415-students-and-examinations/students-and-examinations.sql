# Write your MySQL query statement below
select s.student_id, s.student_name , su.subject_name,
(select count(1)
 from Examinations 
 where student_id = s.student_id
 and subject_name = su.subject_name) as attended_exams
 from Students s
 join Subjects su
 order by s.student_id,su.subject_name 