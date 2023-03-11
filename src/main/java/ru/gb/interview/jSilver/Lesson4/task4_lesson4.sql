select
	'From 9 To 15' as 'Period',
	COUNT(t.id) as 'Visitors',
    SUM(s.price) as 'Box Office Sum'
from tickets t
	inner join sessions s on t.session_id = s.id
where TIME(s.start_time) between '10:00' and '15:00'
union all
select
	'From 15 To 18' as 'Period',
	COUNT(t.id) as 'Visitors',
    SUM(s.price) as 'Box Office Sum'
from tickets t
	inner join sessions s on t.session_id = s.id
where TIME(s.start_time) between '15:00' and '18:00'
union all
select
	'From 18 To 21' as 'Period',
	COUNT(t.id) as 'Visitors',
    SUM(s.price) as 'Box Office Sum'
from tickets t
	inner join sessions s on t.session_id = s.id
where TIME(s.start_time) between '18:00' and '21:00'
union all
select
	'From 21 To 00' as 'Period',
	COUNT(t.id) as 'Visitors',
    SUM(s.price) as 'Box Office Sum'
from tickets t
	inner join sessions s on t.session_id = s.id
where TIME(s.start_time) between '21:00' and '23:59'
;