-- Revising the Select Query I
select * from city where population > 100000 and countrycode='USA';
-- Revising the Select Query II
select name from city where population > 120000 and countrycode='USA';
-- Select All
select * from city;
-- Select By ID
select * from city where id=1661;
-- Japanese Cities' Attributes
select * from city where countrycode='JPN';
-- Japanese Cities' Names
select name from city where countrycode='JPN';
-- Weather Observation Station 1
select city,state from station;
-- Weather Observation Station 3
select distinct city from station where MOD(ID,2)=0 ;
-- Weather Observation Station 4
select count (city) - count(distinct city) from station;
-- Weather Observation Station 5
SELECT *
FROM
    (SELECT CITY, LENGTH(CITY)
    FROM STATION
    ORDER BY LENGTH(CITY), CITY)
WHERE ROWNUM = 1
UNION
SELECT *
FROM
    (SELECT CITY, LENGTH(CITY)
    FROM STATION
    ORDER BY LENGTH(CITY) DESC, CITY)
WHERE ROWNUM = 1;
-- Weather Observation Station 6
SELECT DISTINCT city FROM station WHERE REGEXP_LIKE(city, '^[aeiou].*', 'i');