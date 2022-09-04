package org.example.config;

import org.example.main.Parrot;
import org.example.main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot1() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    public Parrot parrot2() {
        Parrot parrot = new Parrot();
        parrot.setName("Jack");
        return parrot;
    }

    @Bean
    public Person person(@Qualifier("parrot2") Parrot parrot) {
        Person person = new Person();
        person.setName("Flint");
        person.setParrot(parrot);
        return person;
    }
}
