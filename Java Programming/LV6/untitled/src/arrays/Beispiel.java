package arrays;

public class Beispiel {

    public static void main(String[] args) {

        System.out.println(check("Rentner"));  // true
        System.out.println(check("O Genie, der Herr ehre dein Ego!"));  // true
        System.out.println(check("Reliefpfeiler"));  // true
        System.out.println(check("Trug Tim eine so helle Hose nie mit Gurt?"));  // true
        System.out.println(check("Rotor"));  // true
        System.out.println(check("Erika feuert nur untreue Fakire."));  // true
        System.out.println(check("Hallo"));  // false


    }
    public static boolean check(String palindrom) {
        // Entfernen von Leerzeichen und Sonderzeichen sowie Umwandlung in Kleinbuchstaben
        StringBuilder filteredText = new StringBuilder();
        for (int i = 0; i < palindrom.length(); i++) {
            char ch = palindrom.charAt(i);
            if (Character.isLetter(ch)) {
                filteredText.append(Character.toLowerCase(ch));
            }
        }

        // Rekursive Überprüfung, ob es ein Palindrom ist
        return isPalindrome(filteredText.toString());
    }

    private static boolean isPalindrome(String text) {
        // Basisfälle: Wenn der Text leer oder nur ein Zeichen hat, ist er ein Palindrom
        if (text.length() <= 1) {
            return true;
        }

        // Vergleiche das erste und das letzte Zeichen
        if (text.charAt(0) == text.charAt(text.length() - 1)) {
            // Rekursiver Aufruf mit dem inneren Teil des Textes (ohne erstes und letztes Zeichen)
            return isPalindrome(text.substring(1, text.length() - 1));
        } else {
            // Wenn das erste und das letzte Zeichen unterschiedlich sind, ist es kein Palindrom
            return false;
        }
    }
}
