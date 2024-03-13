package fileio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class uebung {

        public static void main(String[] args) {
            // Dateipfad einlesen
            String dateipfad = "/Users/julianirmler/Downloads/sub-ordner/dokumente/er hörte leise.txt"; // Hier den tatsächlichen Pfad zur Datei einfügen

            try(BufferedReader reader = new BufferedReader(new FileReader(dateipfad))) {
                // BufferedReader initialisieren, um die Datei Zeile für Zeile zu lesen


                String zeile;
                StringBuilder inhalt = new StringBuilder();

                // Alle Zeichen einlesen und auf der Konsole ausgeben
                while ((zeile = reader.readLine()) != null) {
                    inhalt.append(zeile).append("\n");
                }
                System.out.println("Inhalt der Datei:");
                System.out.println(inhalt.toString());

                // Anzahl der eingelesenen Zeichen zählen und ausgeben
                int anzahlZeichen = inhalt.length();
                System.out.println("Anzahl der eingelesenen Zeichen: " + anzahlZeichen);

                // BufferedReader schließen
                reader.close();

            } catch (IOException e) {
                // Fehlerbehandlung, falls die Datei nicht gefunden oder nicht gelesen werden kann
                System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
            }
        }
    }

