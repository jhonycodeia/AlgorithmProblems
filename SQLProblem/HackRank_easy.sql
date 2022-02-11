-- Revising the Select Query I
SELECT * FROM city WHERE population > 100000 and countrycode='USA';
-- Revising the Select Query II
SELECT name FROM city WHERE population > 120000 and countrycode='USA';
-- Select All
SELECT * FROM city;
-- Select By ID
SELECT * FROM city WHERE id=1661;
-- Japanese Cities' Attributes
SELECT * FROM city WHERE countrycode='JPN';
-- Japanese Cities' Names
SELECT name FROM city WHERE countrycode='JPN';
-- Weather Observation Station 1
SELECT city,state FROM station;
-- Weather Observation Station 3
SELECT DISTINCT city FROM station WHERE MOD(ID,2)=0 ;
-- Weather Observation Station 4
SELECT count (city) - count(DISTINCT city) FROM station;
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
SELECT count(id) FROM CITY WHERE population > 100000;
-- Revising Aggregations - The Sum Function
SELECT sum(population) FROM CITY WHERE district ='California';
-- Revising Aggregations - Averages
SELECT avg(population) FROM CITY WHERE district ='California';
-- Average Population
SELECT ROUND(avg(population)) from CITY;
-- Japan Population
SELECT sum(population) FROM CITY where countrycode ='JPN';
-- Population Density Difference
SELECT MAX(POPULATION) - MIN(POPULATION) FROM CITY
-- The Blunder
SELECT CEIL(AVG(Salary)-AVG(REPLACE(Salary,'0',''))) FROM EMPLOYEES;
-- Top Earners
SELECT salary * months AS earnings, COUNT(*)
FROM Employee
GROUP BY earnings
ORDER BY earnings DESC
LIMIT 1;
-- Weather Observation Station 2
SELECT ROUND(SUM(LAT_N), 2), ROUND(SUM(LONG_W), 2) FROM STATION;
-- Weather Observation Station 13
SELECT ROUND(SUM(Lat_N), 4)
FROM STATION
WHERE Lat_N > 38.7880 AND Lat_N < 137.2345;
-- Weather Observation Station 14
SELECT ROUND(MAX(Lat_N), 4)
FROM Station
WHERE Lat_N < 137.2345;
-- Weather Observation Station 15
Select ROUND(LONG_W,4) from STATION WHERE LAT_N = (SELECT MAX(LAT_N) FROM STATION WHERE LAT_N<137.2345);
-- Weather Observation Station 16
SELECT ROUND(MIN(Lat_N), 4)
FROM Station
WHERE Lat_N > 38.7780;
-- Weather Observation Station 17
SELECT round(LONG_W,4) FROM STATION WHERE LAT_N>38.7780 ORDER BY LAT_N limit 1;
-- Population Census
SELECT SUM(CITY.POPULATION) 
FROM CITY, COUNTRY
WHERE CITY.COUNTRYCODE = COUNTRY.CODE AND COUNTRY.CONTINENT = 'Asia';
-- African Cities
Select City.Name From City Inner Join Country 
On CountryCode = Code
Where Continent = 'Africa';
-- Average Population of Each Continent
SELECT COUNTRY.CONTINENT, FLOOR(AVG(CITY.POPULATION))
FROM CITY INNER JOIN COUNTRY
ON CITY.COUNTRYCODE = COUNTRY.CODE
GROUP BY COUNTRY.CONTINENT;
-- Draw The Triangle 1
SELECT REPEAT('* ', @NUMBER := @NUMBER - 1) FROM information_schema.tables, (SELECT @NUMBER:=21) t LIMIT 20
-- Draw The Triangle 2
SET @row := 0;
SELECT repeat('* ', @row := @row + 1) FROM information_schema.tables WHERE @row < 20