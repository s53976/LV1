package org.campus02.arrays;

import java.util.ArrayList;

public class PersonenManager {
    ArrayList<Person> persons = new ArrayList<>();

    public PersonenManager() {

    }

    public void add (Person p) {
        persons.add(p);
    }

    public void doAnalysis (PersonAnalyzer a) {
        a.setPersons(persons);
        a.analyze();
    }
}
