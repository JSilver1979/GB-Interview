package ru.gb.interview.jSilver;

import ru.gb.interview.jSilver.lesson1.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .withFirstName("Jack")
                .withMiddleName("O'")
                .withLastName("Sparrow")
                .withAge(32)
                .withGender("Male")
                .withAddress("Caribbean sea")
                .withCountry("No country")
                .withPhone("Only compass, no Phone")
                .build();

        System.out.println(person.toString());
    }
}