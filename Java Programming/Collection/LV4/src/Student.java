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
}
