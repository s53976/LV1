package org.campus02.arrays;

public class MaxSalaryAnalyzer extends PersonAnalyzer{




    @Override
    public void analyze() {
        double max = Double.MIN_VALUE;

        for (Person person : persons) {
            if(person.getSalary()> max) {
                max = person.getSalary();

            }
        }
        for (Person person : persons) {
            if(person.getSalary() == max) {
                System.out.println("person = " + person);
            }
        }
    }
}
