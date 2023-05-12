# autoshop
Описание 
Компания владеет автосалоном. В автосалоне ведётся учет проданной продукции за каждый день, где учитывается наименование автомобиля, количество, общая стоимость и реквизиты покупателя.

Реализация (пункт 1):
Создать нормализованную схему хранения данных для описанного процесса. РСУБД – на Ваш выбор

История продаж
Автосалон предлагает следующие модели:
    • BMW X5;
    • BMW X6;
    • BMW X7.

Ниже представлен отчет старшего менеджера по продажам за три дня:
01.10.2021 – BMW X5 – 1шт. – 2’000’000 – Иванов Сергей +79107891122
02.10.2021 – BMW X6 – 2шт. – 3’500’000 – Коробкин Олег +79107891155
02.10.2021 – BMW X7 – 1шт. – 2’000’000 – Олейкин Роман +79107891166
02.10.2021 – BMW X7 – 1шт. – 2’000’000 – Коробкин Олег +79107891155
02.10.2021 – BMW X5 – 2шт. – 2’000’000 – Коробкин Олег +79107891155
03.10.2021 – BMW X6 – 1шт. – 3’000’000 – Иванов Сергей +79107891122

Реализация (пункт 2):
Занести в базу данных информацию, которая описана в задаче, используя средства SQL (SQL-скрипт), JDBC, ORM - на Ваш выбор

Запросы
    a) выручка автосалона за заданный период (входные данные: дата начала, дата окончания периода; выходные данные: выручка);
    b) массив заказов, упорядоченный по дате заказа, внутри даты по ФИ клиента, внутри клиента по сумме заказа (входные данные: отсутствуют; выходные данные: фамилия и имя клиента, контактный номер, стоимость заказа, дата заказа, модель автомобиля, количество автомобилей в заказе).

Реализация (пункт 3):
Реализовать синхронный REST-сервис (с использованием любых фреймворков или библиотек, публикующихся в открытых Maven-репозиториях) с отдельным маршрутом для каждого запроса, обращающийся к БД (plain JDBC, ORM – на Ваш выбор).
Формат запроса и ответа – JSON.
Сборка проекта через Maven, вид деплоя сервиса (сервис Windows, WAR, запуск через консоль) – на Ваш выбор.
