/* скрипт, который будет искать в таблице PERSONS поля name и surname пользователей, которые проживают в MOSCOW.*/
select name, surname, city_of_living from persons where city_of_living = 'MOSCOW';
