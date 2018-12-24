package ru.mirea.arkabaev.pract7;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(1, 12),
                new Student(2, 65),
                new Student(3, 98),
                new Student(4, 32),
                new Student(5, 98),
                new Student(8, 1),
        };

        Arrays.sort(students);

        System.out.println("Сортирует массив iDNumber:");
        for (Student s : students) {
            System.out.println(s);
        }

        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("\nСортирует студентов с их итоговым баллом в порядке убывания:");
        for (Student s : students) {
            System.out.println(s);
        }

        Student[] students2 = new Student[]{
                new Student(9, 13),
                new Student(12, 23),
                new Student(14, 90),
                new Student(13, 24),
                new Student(10, 87),
                new Student(11, 6),
        };

        Student[] studentsmerge = new Student[students.length+students2.length];
        System.arraycopy(students,0,studentsmerge,0,students.length);
        System.arraycopy(students2,0,studentsmerge,students.length,students2.length);

        Arrays.sort(studentsmerge);
        System.out.println("\nОбъединяет два списка данных о студентах в один отсортированный список:");
        for (Student s1 : studentsmerge) {
            System.out.println(s1);
        }
    }
}

