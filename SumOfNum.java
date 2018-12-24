package ru.mirea.arkabaev.pract5;
import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        System.out.print("Введите k: ");
        Scanner k1 = new Scanner(System.in);
        int k = k1.nextInt();
        System.out.print("Введите s: ");
        Scanner s1 = new Scanner(System.in);
        int s = s1.nextInt();
        System.out.print("Введите сумму: ");
        Scanner su1 = new Scanner(System.in);
        int sum = su1.nextInt();
        System.out.print("Введите длину: ");
        Scanner le1 = new Scanner(System.in);
        int len = le1.nextInt();
        System.out.println(recursion(len, sum, k, s)); // вызов рекурсивной функции
    }

    public static int recursion(int len, int sum, int k, int s) {
        // Базовый случай
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        // Шаг рекурсии / рекурсивное условие
        for (int i = c; i < 10; i++) {
            res += recursion(len + 1, sum + i, k, s);

        }
        return res;
    }
}