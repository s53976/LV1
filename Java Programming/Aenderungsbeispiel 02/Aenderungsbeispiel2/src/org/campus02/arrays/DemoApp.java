package org.campus02.arrays;

public class DemoApp {
    public static void main(String[] args) {
        Person a = new Person("Max","Mustermann", 'M',48, "Schweden", 2500.5, "blau", 90, 190);
        Person b = new Person("Susi","Sorglos", 'W',38, "Deutschland", 3500.5, "grün", 90, 190);

        GenderAnalyzer genderAnalyzer = new GenderAnalyzer();



        MaxSalaryAnalyzer maxSalaryAnalyzer = new MaxSalaryAnalyzer();
        PersonenManager personenManager = new PersonenManager();
        personenManager.add(a);
        personenManager.add(b);

        personenManager.doAnalysis(maxSalaryAnalyzer);

        BMIAnalyzer bmiAnalyzer = new BMIAnalyzer();
        personenManager.doAnalysis(bmiAnalyzer);

        }
    }

