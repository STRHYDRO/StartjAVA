SELECT * FROM jaegers; --Вся таблица

SELECT * FROM jaegers WHERE status = 'enabled'; --Только рабочие роботы

SELECT * FROM jaegers WHERE mark = '3' OR mark = '4'; --вывод определенных роботов

SELECT * FROM jaegers ORDER BY mark DESC; --Сортировка по типу

SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers); --Самый старый робот

SELECT * FROM jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers)
        OR kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers); --Роботы которые убили самое большое и меньшее количество

SELECT * FROM jaegers WHERE kaijuKill > (SELECT AVG(kaijuKill) FROM Jaegers); --Роботы которые убили выше среднего
SELECT * FROM jaegers WHERE kaijuKill < (SELECT AVG(kaijuKill) FROM Jaegers); --Роботы которые убили ниже среднего

SELECT AVG(weight) FROM Jaegers; --Средний вес

SELECT * FROM jaegers WHERE status = 'enebled'; --до прибавления
UPDATE jaegers SET kaijuKill = kaijuKill + '1' WHERE status = 'enabled'; --Увеличить на 1 убийств работающих роботов
SELECT * FROM jaegers WHERE status = 'enabled'; --после прибавления

DELETE FROM jaegers WHERE status = 'desabled'; --Удаление уничтоженых роботов
SELECT * FROM jaegers; --Вся таблица