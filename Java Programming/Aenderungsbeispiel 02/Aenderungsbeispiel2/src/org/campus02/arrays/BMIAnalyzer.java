package org.campus02.arrays;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer{
    private ArrayList<Pair<Person, Double>> result = new ArrayList<>();

    public ArrayList<Pair<Person, Double>> getResult() {
        return result;
    }

    private double calcBMI(Person person) {
       return person.getWeight() / ((person.getSize() / 100)*(person.getSize() / 100));

    }

    @Override
    public void analyze() {

        for (Person person : persons) {
            double bmi= calcBMI(person);
            System.out.println("bmi = " + bmi);
            result.add(new Pair<>(person,bmi));
        }
    }
}
