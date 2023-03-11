select 
	shedule1.Title, 
    shedule1.Start_Time, 
    shedule1.Duration,
    shedule2.Title,
    shedule2.Start_Time,
    shedule2.Duration
from (
		select
			s.id,
			m1.title as 'Title', 
			s.start_time as 'Start_Time', 
			m1.duration as 'Duration',
			DATE_ADD(s.start_time, INTERVAL m1.duration MINUTE) as 'End_Time'
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
    ) shedule2 on shedule1.id=shedule2.id+1
where shedule2.End_Time >= shedule1.Start_Time;