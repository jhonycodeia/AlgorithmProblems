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
-- Weather Observation Station 7
SELECT DISTINCT city FROM station WHERE REGEXP_LIKE(city, '*.[aeiou]$', 'i');
-- Weather Observation Station 8
SELECT DISTINCT city FROM station WHERE REGEXP_LIKE(city, '^[aeiou].*', 'i') AND REGEXP_LIKE(city, '*.[aeiou]$', 'i');
-- Weather Observation Station 9
SELECT DISTINCT city FROM station WHERE REGEXP_LIKE(city, '^[^aeiou].*', 'i');
-- Weather Observation Station 10
SELECT DISTINCT city FROM station WHERE REGEXP_LIKE(city, '[^aeiou]$', 'i');
-- Weather Observation Station 11
SELECT DISTINCT city FROM station WHERE REGEXP_LIKE(city, '^[^aeiou].*', 'i') or REGEXP_LIKE(city, '*.[^aeiou]$', 'i');
-- Weather Observation Station 12
SELECT DISTINCT city FROM station WHERE REGEXP_LIKE(city, '^[^aeiou].*', 'i') and REGEXP_LIKE(city, '*.[^aeiou]$', 'i');
-- Higher Than 75 Marks
SELECT (NAME) FROM STUDENTS WHERE MARKS>75 ORDER BY SUBSTR(NAME,-3,3), ID ASC;
-- Employee Names
SELECT name FROM Employee ORDER BY name;
-- Employee Salaries
SELECT name FROM Employee WHERE salary >2000 and months < 10;
-- Type of Triangle
SELECT CASE
WHEN A + B > C THEN CASE WHEN A = B AND B = C THEN 'Equilateral' WHEN A = B OR B = C OR A = C THEN 'Isosceles' WHEN A != B OR B != C OR A != C THEN 'Scalene' END
ELSE 'Not A Triangle' END FROM TRIANGLES
-- Revising Aggregations - The Count Function
select count(id) from CITY where population > 100000;
-- Revising Aggregations - The Sum Function
select sum(population) from CITY where district ='California';
-- Revising Aggregations - Averages
select avg(population) from CITY where district ='California';
-- Average Population
select ROUND(avg(population)) from CITY;
-- Japan Population
select sum(population) from CITY where countrycode ='JPN';
