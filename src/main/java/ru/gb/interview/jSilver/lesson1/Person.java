package ru.gb.interview.jSilver.lesson1;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String gender;
    private int age;
    private String country;
    private String address;
    private String phone;

    public static class PersonBuilder {
        private Person person;

        public PersonBuilder () {
            person = new Person();
        }
        public PersonBuilder withFirstName (String firstName) {
            person.firstName = firstName;
            return this;
        }

        public PersonBuilder withLastName (String lastName) {
            person.lastName = lastName;
            return this;
        }

        public PersonBuilder withMiddleName (String middleName) {
            person.middleName = middleName;
            return this;
        }

        public PersonBuilder withGender (String gender) {
            person.gender = gender;
            return this;
        }
        public PersonBuilder withAge (int age) {
            person.age = age;
            return this;
        }
        public PersonBuilder withCountry (String country) {
            person.country = country;
            return this;
        }
        public PersonBuilder withAddress (String address) {
            person.address = address;
            return this;
        }
        public PersonBuilder withPhone (String phone) {
            person.phone = phone;
            return this;
        }

        public Person build () {
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
