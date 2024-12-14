package org.campus02.arrays;

import java.util.Objects;

public class Person {
    private String firstname;
    private String lastname;
    private char gender;
    private int age;
    private String country;
    private double salary;
    private String eyeColor;
    private int weight;
    private int size;

    public Person(String firstname, String lastname, char gender, int age, String country, double salary, String eyeColor, int weight, int size) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.salary = salary;
        switch (eyeColor) {
            case "braun":
            case "grün":
            case "blau":
                this.eyeColor = eyeColor;
                break;
            default:
                System.out.println("Undefiniert");
        }

        this.weight = weight;
        this.size = size;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return gender == person.gender && age == person.age && Double.compare(salary, person.salary) == 0 && weight == person.weight && size == person.size && Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname) && Objects.equals(country, person.country) && Objects.equals(eyeColor, person.eyeColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, gender, age, country, salary, eyeColor, weight, size);
    }
}
