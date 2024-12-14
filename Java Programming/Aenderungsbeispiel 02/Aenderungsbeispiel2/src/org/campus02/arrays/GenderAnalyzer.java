package org.campus02.arrays;

public class GenderAnalyzer extends PersonAnalyzer{

    public GenderAnalyzer() {
    }

    @Override
    public void analyze() {
        double sumM = 0;
        double sumW = 0;
        int counterm = 0;
        int counterw = 0;

        for (Person person : persons) {
            int size = person.getSize();
            if(person.getGender() == 'M') {
                sumM += size;
                counterm++;
            }else {
                sumW += size;
                counterw++;
            }


        }
        System.out.println("In der Liste existieren" + counterm + "Männer mit einer durchschnittlichen Körpergröße" + sumM/counterm + "cm");
        System.out.println("In der Liste existieren" + counterw + "Frauen mit einer durchschnittlichen Körpergröße" + sumW/counterw + "cm");
    }
}
