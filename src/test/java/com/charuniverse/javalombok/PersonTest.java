package com.charuniverse.javalombok;

import org.junit.jupiter.api.Test;

import java.util.List;

public class PersonTest {

    @Test
    void testCreateConstructor() {
        var person = new Person("Charun", "Kumar", 30, List.of("Java", "C++"));
        System.out.println(person);
    }

    @Test
    void testCreateSetter() {
        var person = new Person();
        person.setId("123");
        person.setName("Charun");
        person.setAge(10);
        person.setHobbies(List.of("Java", "C++"));
        System.out.println(person);
    }

    @Test
    void testCreateBuilder() {
        var person = Person.builder()
                .id("123").name("Charun").age(10)
                .hobby("Java").hobby("C++")
                .build();
        System.out.println(person);
    }
}
