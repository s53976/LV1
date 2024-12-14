import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMapDemo {
    public static void main(String[] args) {

        HashMap<String, List<Integer>> gradesOfStudents = new HashMap<>();

        //Studenten und Noten hinzufügen
        List<Integer> susiGrades = new ArrayList<>();
        susiGrades.add(1);
        susiGrades.add(2);
        susiGrades.add(3);
        gradesOfStudents.put("Susi Sorglos", susiGrades);

        List<Integer> maxGrades = new ArrayList<>();
        maxGrades.add(1);
        maxGrades.add(2);
        maxGrades.add(3);
        gradesOfStudents.put("Max Mustermann", maxGrades);

        List<Integer> susiNewGrades = new ArrayList<>();
        susiNewGrades.add(2);
        susiNewGrades.add(2);
        susiNewGrades.add(2);
        gradesOfStudents.put("Susi Sorglos", susiNewGrades);

        System.out.println("Liste Aller Studenten und deren Noten");
        for (Map.Entry<String, List<Integer>> entry : gradesOfStudents.entrySet()) {
            System.out.println(entry.getKey() + "hat die Note" + entry.getValue());
        }

        String searchStudent = "Susi Sorglos";
        boolean isContained = gradesOfStudents.containsKey(searchStudent);
        System.out.println("isContained = " + isContained);


        //Ausgabe aller enthaltenden Studenten
        for (String student : gradesOfStudents.keySet()) {
            System.out.println(student);
        }
        
        for (String k : gradesOfStudents.keySet()) {
            System.out.println("k = " + k);
        }
        
    }
}
