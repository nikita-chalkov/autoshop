INSERT INTO auto.automobile (id, name) VALUES
	(1, 'BMW X5'),
	(2, 'BMW X6'),
	(3, 'BMW X7');

INSERT INTO auto.clients (id, fio, phone) VALUES
	(1, 'Иванов Сергей','+79107891122'),
	(2, 'Коробкин Олег','+79107891155'),
	(3, 'Олейкин Роман','+79107891166');

INSERT INTO auto.history_sales(id, date, automobile_id, auto_count, price, client_id) VALUES
	(1, '01.10.2021', 1, 1, 2000000, 1),
	(2, '02.10.2021', 2, 2, 3500000, 2),
	(3, '02.10.2021', 3, 1, 2000000, 3),
	(4, '02.10.2021', 3, 1, 2000000, 2),
	(5, '02.10.2021', 1, 2, 2000000, 2),
	(6, '03.10.2021', 2, 1, 3000000, 1);