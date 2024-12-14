package org.campus02.arrays;

import java.util.ArrayList;

public abstract class PersonAnalyzer {
    ArrayList<Person> persons = new ArrayList<>();

    public  PersonAnalyzer() {

    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons (ArrayList <Person> persons) {

    }

    public abstract void analyze () ;


}
