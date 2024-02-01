public class BMICalculator {
    String firstName;
    String lastName;
    int bodyHeight;
    double bodyWeight;
    char gender;

    public BMICalculator(String firstName, String lastName, int bodyHeight, double bodyWeight, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
        this.gender = gender;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public char getGender() {
        return gender;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    //BMI Berechnen
    public double calculateBMI() {
        double heightInMeter = bodyHeight / 100.0;
        double bmi = bodyWeight / (heightInMeter * heightInMeter);
        return round(bmi);
    }

    public double round (double value) {
        return Math.round(value);
    }


    // Methode zur Ausgabe der BMI-Kategorie auf der Konsole
    private static String getBMICategoryLabel(int category, char gender) {
        if (gender == 'M') {
            switch (category) {
                case -2: return "Severely Underweight";
                case -1: return "Underweight";
                case 0: return "Normal";
                case 1: return "Overweight";
                case 2: return "Obese";
                default: return "Unknown Category";
            }


        } else if (gender == 'F') {
            switch (category) {
                case -2: return "Severely Underweight";
                case -1: return "Underweight";
                case 0: return "Normal";
                case 1: return "Overweight";
                case 2: return "Obese";
                default: return "Unknown Category";
            }
        } else {
            return "Unknown Gender";
        }
    }
    public int caluclateBMICategory(){
        double bmi = calculateBMI();

        if (gender == 'M') {
            if (bmi < 16.0) {
                return -2;
            } else if (bmi >= 16.0 && bmi <= 18.4) {
                return -1;
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                return 0;
            } else if (bmi >= 25.0 && bmi <= 34.9) {
                return 1;
            } else {
                return 2;
            }


        } else if (gender == 'W') {
            if (bmi < 15.0) {
                return -2;
            } else if (bmi >= 15.0 && bmi <= 17.4) {
                return -1;
            } else if (bmi >= 17.5 && bmi <= 23.9) {
                return 0;
            } else if (bmi >= 24.0 && bmi <= 33.9) {
                return 1;
            } else {
                return 2;
            }
        } else {
            // Unbekanntes Geschlecht
            return 0;
        }
    }


    public static void main(String[] args) {

        BMICalculator bmiCalculator = new BMICalculator("Julian", "Irmler", 185, 80.0, 'M' );
        double bmi = bmiCalculator.calculateBMI();
        int bmiCategory = bmiCalculator.caluclateBMICategory();

        System.out.println("BMI: " +bmiCalculator.getFirstName() + bmiCalculator.getLastName() +" "+ bmiCalculator.calculateBMI());
        System.out.println("BMI Category: " + getBMICategoryLabel(bmiCategory, bmiCalculator.getGender()));
    }

}


