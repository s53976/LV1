import java.util.Objects;

public class Student {
    private int matNr;
    private String FullName;


    public Student(int matNr, String fullName) {
        this.matNr = matNr;
        this.FullName = fullName;
    }

    public int getMatNr() {
        return matNr;
    }

    public void setMatNr(int matNr) {
        this.matNr = matNr;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matNr=" + matNr +
                ", FullName='" + FullName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matNr == student.matNr && Objects.equals(FullName, student.FullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matNr, FullName);
    }
}
