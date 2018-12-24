package ru.mirea.arkabaev.pract7;

public class Student implements Comparable<Student>{
    int GPA;
    int idNumber;

    public Student(int idNumber, int GPA) {
        this.GPA = GPA;
        this.idNumber = idNumber;
    }

    public int compareTo(Student o) {
        if (idNumber > o.idNumber) {
            return 1;
        } else if (idNumber == o.idNumber) {
            return 0;
        } else
            return -1;
    }

    @Override
    public String toString() {
        return String.format("ID студента: %d || GPA студента: %d", idNumber, GPA);
    }
}
