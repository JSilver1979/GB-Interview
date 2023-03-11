select 
	shedule1.Title, 
    shedule1.Start_Time, 
    shedule1.Duration,
    shedule2.Start_Time,
    TIMEDIFF(shedule2.Start_Time, shedule1.End_Time_WBreak) as 'Break'
from (
		select
			s.id,
			m1.title as 'Title', 
			s.start_time as 'Start_Time', 
			m1.duration as 'Duration',
			DATE_ADD(s.start_time, INTERVAL m1.duration+30 MINUTE) as 'End_Time_WBreak'
		from sessions s
			inner join movies m1 on s.movie_id=m1.id
	) shedule1
    inner join
    (
		select 
			s.id,
			m1.title as 'Title', 
			s.start_time as 'Start_Time', 
			m1.duration as 'Duration',
			DATE_ADD(s.start_time, INTERVAL m1.duration MINUTE) as 'End_Time'
		from sessions s
			inner join movies m1 on s.movie_id=m1.id
    ) shedule2 on shedule1.id+1=shedule2.id
    order by Break DESC;