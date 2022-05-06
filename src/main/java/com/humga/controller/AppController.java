package com.humga.controller;

import com.humga.entity.Person;
import com.humga.service.AppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AppController {
        private final AppService service;
        AppController(AppService service) {this.service =service;}

        @GetMapping("/persons/by-city")
        public List<String> getPersonsByCity(@RequestParam String city) {
            return service.getPersonsByCity(city)
                    .stream()
                    .map(Person::toString)
                    .collect(Collectors.toList());
        }
}
