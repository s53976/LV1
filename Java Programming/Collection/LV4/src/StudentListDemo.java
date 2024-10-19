import java.util.ArrayList;

public class StudentListDemo {
    public static void main(String[] args) {

        ArrayList<Student>students = new ArrayList<>();

        students.add(new Student(1,"Susi Sorglos"));
        students.add(new Student(2,"Susi Mustermann"));
        students.add(new Student(3,"Max Mustermann"));



        for(Student student : students) {
            System.out.println("student = " + student);
        }

        //entfernen eines Studenten aus der Liste
        students.remove(1);


        //nachdem Entfernen eines Elements aus der Liste
        for(Student student : students) {
            System.out.println(student);
        }

        Student searchStudent = new Student(2, "Susi Mustermann");
        boolean isContained = students.contains(searchStudent);
        System.out.println("isContained = " + isContained);



    }
}
