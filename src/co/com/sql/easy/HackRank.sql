-- Revising the Select Query I
select * from city where population > 100000 and countrycode='USA';
-- Revising the Select Query II
select name from city where population > 120000 and countrycode='USA';
-- Select All
select * from city;
-- Select By ID
select * from city where id=1661;