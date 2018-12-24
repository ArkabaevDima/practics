package ru.mirea.arkabaev.pract5;

import java.util.Scanner;

public class FromAToB {
    public static void main(String[] args) {
        System.out.print("Введите А: ");
        Scanner a1 = new Scanner(System.in);
        int a = a1.nextInt();
        System.out.print("Введите B: ");
        Scanner b1 = new Scanner(System.in);
        int b = b1.nextInt();
        recursion(a, b); // вызов рекурсивной функции
    }

    public static String recursion(int a, int b) {
        // основное условие задачи
        if (a > b) {
            // Базовый случай
            System.out.print(a + " " + recursion(a - 1, b));
        } else {
            // Базовый случай
            if (a == b) {
                System.out.print(Integer.toString(a) + " ");
            } else {
                // Шаг рекурсии / рекурсивное условие
                System.out.print(a + " " + recursion(a + 1, b));
            }
        } return "";
    }
}

