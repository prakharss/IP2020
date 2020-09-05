--The Oracle/PLSQL ASCII function returns the NUMBER code that represents the specified character.
SELECT ASCII('a') FROM DUAL;
--The Oracle/PLSQL ASCIISTR function converts a string in any character set to an ASCII string using the database character set.
SELECT ASCIISTR('A B C Ä Ê') FROM DUAL;
--The Oracle/PLSQL CHR function is the opposite of the ASCII function. It returns the character based on the NUMBER code.
SELECT CHR(97) FROM DUAL;
--The Oracle/PLSQL COMPOSE function returns a Unicode string.
SELECT COMPOSE('a') FROM DUAL;
SELECT COMPOSE('a' || unistr('\0302')) compose FROM DUAL;
SELECT COMPOSE('a' || 'b' ||'c') compose FROM DUAL;
--The Oracle/PLSQL CONCAT function allows you to concatenate two strings together.
SELECT CONCAT('a', 'bc') FROM DUAL;
SELECT CONCAT('a', unistr('\0302')) FROM DUAL;

SELECT 'CON' ||'CAT' FROM DUAL;

--The Oracle/PLSQL INITCAP function sets the first character in each word to uppercase and the rest to lowercase.
SELECT INITCAP('testABC') FROM DUAL;
SELECT INITCAP('i love my india') FROM DUAL;

SELECT LENGTH('i love my india') FROM DUAL;

--The Oracle/PLSQL LOWER function converts all letters in the specified string to lowercase. If there are characters in the string that are not letters, they are unaffected by this function.
SELECT LOWER('AA KA NK SHA') FROM DUAL;
SELECT LOWER('AAkanksha') FROM DUAL;
SELECT LOWER('A') FROM DUAL;

SELECT UPPER('aa ka NK sha') FROM DUAL;
SELECT UPPER('AAkanksha') FROM DUAL;
SELECT UPPER('a') FROM DUAL;

SELECT SUBSTR('AAKANKSHA', 2, 3) FROM DUAL;
SELECT SUBSTR('AAKANKSHA', 0, 3) FROM DUAL;
SELECT SUBSTR('AAKANKSHA', 1, 3) FROM DUAL;
SELECT SUBSTR('AAKANKSHA', -3, 3) FROM DUAL;
SELECT SUBSTR('AAKANKSHA', -4, 3) FROM DUAL;
SELECT SUBSTR('AAKANKSHA', -3, 4) FROM DUAL;

--The Oracle/PLSQL CASE statement has the functionality of an IF-THEN-ELSE statement. Starting in Oracle 9i, you can use the CASE statement within a SQL statement.
SELECT
    CASE SQRT(100)
        WHEN 1 THEN 'INCORRECT'
        WHEN 10 THEN 'FOUND'
        ELSE 'NOT FOUND'
    END sqrt
FROM DUAL;

--The Oracle/PLSQL COALESCE function returns the first non-null expression in the list. If all expressions evaluate to null, then the COALESCE function will return null.
SELECT COALESCE(null, null, 1, 2) FROM DUAL;

--The Oracle/PLSQL COALESCE function returns the first non-null expression in the list. If all expressions evaluate to null, then the COALESCE function will return null.
SELECT DECODE(SQRT(100), 1, 'INCORRECT', 10, 'FOUND CORRECT', 'NOT FOUND') FROM DUAL;

SELECT NULLIF(sqrt(100), sqrt(100)) FROM DUAL;
SELECT NULLIF(sqrt(100), sqrt(64)) FROM DUAL;

--The Oracle/PLSQL NVL function lets you substitute a value when a null value is encountered.
SELECT NVL(null, 'Aakanksha') FROM DUAL;
SELECT NVL('a', 'Aakanksha') FROM DUAL;

--The Oracle/PLSQL NVL2 function extends the functionality found in the NVL function. It lets you substitutes a value when a null value is encountered as well as when a non-null value is encountered.
SELECT NVL2(null, 'Aakanksha', 'Anku') FROM DUAL;
SELECT NVL2('a', 'Aakanksha', 'Anku') FROM DUAL;