SELECT * FROM Jaegers; --Вся таблица

SELECT * FROM Jaegers WHERE status = 'enabled'; --Только рабочие роботы

SELECT * FROM Jaegers WHERE mark = '3' OR mark = '4'; --вывод определенных роботов

SELECT * FROM Jaegers ORDER BY mark DESC; --Сортировка по типу

SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers); --Самый старый робот

SELECT * FROM Jaegers WHERE kaijiKill = (SELECT MAX(kaijiKill) FROM Jaegers)
        OR kaijiKill = (SELECT MIN(kaijiKill) FROM Jaegers); --Роботы которые убили самое большое и меньшее количество

SELECT * FROM Jaegers WHERE kaijiKill > (SELECT AVG(kaijiKill) FROM Jaegers); --Роботы которые убили выше среднего
SELECT * FROM Jaegers WHERE kaijiKill < (SELECT AVG(kaijiKill) FROM Jaegers); --Роботы которые убили ниже среднего

SELECT AVG(weight) FROM Jaegers; --Средний вес

SELECT * FROM Jaegers WHERE status = 'enebled'; --до прибавления
UPDATE Jaegers SET kaijiKill = kaijiKill + '1' WHERE status = 'enabled'; --Увеличить на 1 убийств работающих роботов
SELECT * FROM Jaegers WHERE status = 'enabled'; --после прибавления

--DELETE FROM Jaegers WHERE status = 'desabled'; --Удаление уничтоженых роботов
--SELECT * FROM Jaegers; --Вся таблица