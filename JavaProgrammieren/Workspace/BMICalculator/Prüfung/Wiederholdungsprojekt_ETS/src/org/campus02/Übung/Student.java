package org.campus02.Übung;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparator<Student> {
    public int matrNr;
    public String firstName;
    public String lastName;


    public Student(int matrNr, String firstName, String lastName) {
        this.matrNr = matrNr;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getMatrNr() {
        return matrNr;
    }

    public void setMatrNr(int matrNr) {
        this.matrNr = matrNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matrNr == student.matrNr && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matrNr, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrNr=" + matrNr +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static void main(String[] args) {

    int [] numbers = {1,5,4,5,8,3,2};
    Arrays.sort(numbers);
        System.out.println(numbers);





    String [] strings = {"Eins","Zwei","Fünf","Sechs"};
    Arrays.sort(strings);
        System.out.println(strings);

    }

    @Override
    public int compareTo(Student o) {
        if (this.matrNr > o.matrNr) {
            return -1;
        }
        if (this.matrNr > o.matrNr) {
            return 1;
        }
        else
            return 0;
        }
    }

