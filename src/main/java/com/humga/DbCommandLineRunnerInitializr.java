package com.humga;

import com.humga.entity.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Наполняет базу данных тестовыми данными
 * Бин, имплементирующий интерфейс CommandLineRunner автоматически находится спрингом и его метод run
 * запускается на старте приложения.
 *
 */
@Component
public class DbCommandLineRunnerInitializr implements CommandLineRunner {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Иван","Иванов",40,73453432,"MOSCOW"));
        list.add(new Person("Петр","Петров",31,73453477,"MOSCOW"));
        list.add(new Person("Сергей","Сергеев",25,73453337,"PODOLSK"));

        list.forEach(entityManager::persist);
    }
}
