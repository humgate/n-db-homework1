/*Напишите скрипт создания таблицы*/
CREATE TABLE persons (
name varchar(255) NOT NULL,
surname varchar(255) NOT NULL,
age integer NOT NULL,
phone_number integer,
city_of_living varchar(128),
PRIMARY KEY(name, surname, age)
);

/*добавление тестовых данных*/
INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES('Иван','Иванов',40,73453432,'MOSCOW');

INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES('Петр','Петров',31,73453477,'MOSCOW');

INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES('Сергей','Сергеев',25,73453337,'PODOLSK');

select * from persons



