package ru.mirea.arkabaev.pract5;
import java.util.Scanner;

public class From1ToN {
    public static void main(String[] args) {
        System.out.print("Введите N: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        recursion(n);
    }

    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        } else {
            System.out.print(recursion(n - 1) + " " + n);
        }
        return "";
    }
}

