package ru.mirea.arkabaev.pract5;
import java.util.Scanner;

public class TriangularSequence {

    public static void main(String[] args) {
        System.out.print("Введите количесвтво цифр: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        recursion(n); // вызов рекурсивной функции
    }

    public static String recursion(int n) {
        int sum = 0;
        int j = 0;
        // Базовый случай
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            // Шаг рекурсии / рекурсивное условие
            System.out.print(recursion(n - 1) + " " + j);
        }
        return "";
    }

}
