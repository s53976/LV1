public class BMI {

    // BMI-Berechnungsmethode
    public double calculateBMI() {
        double heightInMeter = bodyHeight / 100.0;
        double bmi = bodyWeight / (heightInMeter * heightInMeter);
        return round(bmi);
    }

    // BMI-Kategorienberechnungsmethode
    public int calculateBMICategory() {
        double bmi = calculateBMI();

        if (gender == 'M') {
            if (bmi < 15.0) {
                return -2;
            } else if (bmi >= 15.0 && bmi < 18.5) {
                return -1;
            } else if (bmi >= 18.5 && bmi < 25.0) {
                return 0;
            } else if (bmi >= 25.0 && bmi < 35.0) {
                return 1;
            } else {
                return 2;
            }
        } else if (gender == 'F') {
            if (bmi < 15.0) {
                return -2;
            } else if (bmi >= 15.0 && bmi < 17.5) {
                return -1;
            } else if (bmi >= 17.5 && bmi < 24.0) {
                return 0;
            } else if (bmi >= 24.0 && bmi < 34.0) {
                return 1;
            } else {
                return 2;
            }
        } else {
            return -999; // Undefiniertes Geschlecht
        }
    }

    // Methode zur Rundung auf 2 Kommastellen
    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    // Beispiel-Nutzung der Klasse
    public static void main(String[] args) {
        // Erstellung eines BMICalculator-Objekts
        BMICalculator person = new BMICalculator("John", "Doe", 175, 70, 'M');

        // Zugriff auf Attribute und Berechnung des BMI
        System.out.println(person.getFirstname() + " " + person.getLastname());
        System.out.println("BMI: " + person.calculateBMI());
        System.out.println("BMI Category: " + person.calculateBMICategory());
    }

}
