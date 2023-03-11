select 
	m.title	as 'Title',
	s.visitors as 'Visitors',
	ROUND(s.visitors_avg) as "Session Visitors AVG",
	s.session_sum as "Box Office Sum"
 from movies m
	left join (
		select 
			s.movie_id,
            COUNT(t.id) as visitors,
            AVG(t.id) as visitors_avg,
            SUM(s.price) as session_sum
		from sessions s
              left join tickets t on s.id = t.session_id
		group by s.movie_id
 ) s on m.id = s.movie_id
 union all
 select 'Total' as title,
	COUNT(t.id) as visitors,
	ROUND(avg(s.id)) as visitors_avg,
	SUM(s.price) as session_sum
 from sessions s
	left join tickets t on s.id = t.session_id;