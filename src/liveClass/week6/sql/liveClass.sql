--select
select * from actor;
select last_name from actor;
--sütun, column, field
--where
select * from actor where actor_id=9
--between
select first_name from actor where actor_id between 6 and 10;
--in
select * from actor where actor_id in (3,9,7,5,99999999)
--like, ilike(case sensitive)
select * from actor where first_name ilike '%S'
--order by
select * from actor order by last_name DESC --descending, ascending
--limit- offset
select * from actor offset 2 limit 1
--aggregate
  --count
select count(*) from actor 
--min
select min(actor_id) from actor
--max
select max(actor_id) from actor
--avg
select round(avg(actor_id),4) from actor
--group by
select count(*),first_name from actor group by first_name 
--having (group by ve aggrefate ile beraber kullanırız)
select count(*),first_name from actor group by first_name having count(*)>2
select count(*),first_name from actor group by first_name having count(*)<4