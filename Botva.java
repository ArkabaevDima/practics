package ru.mirea.arkabaev.pract6;
import java.util.ArrayList;
import java.util.Scanner;

public class Botva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1;
        int a2;
        String s1;
        String s2;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.print("Введите 5 карт первого игрока: ");
        for (int i = 0; i < 5; i++) {
            s1 = scanner.next();
            a1 = (Integer.parseInt(s1));
            arr1.add(a1);
        }
        System.out.print("Введите 5 карт второго игрока: ");
        for (int i = 0; i < 5; i++) {
            s2 = scanner.next();
            a2 = (Integer.parseInt(s2));
            arr2.add(a2);
        }
        int count = 0;
        boolean result = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if (arr1.get(0) > arr2.get(0) || ((arr1.get(0) == 0) && (arr2.get(0) == 9))) {
                arr1.add(arr1.get(0));
                arr1.add(arr2.get(0));
            } else if (arr1.get(0) < arr2.get(0) || ((arr1.get(0) == 9) && (arr2.get(0) == 0))) {
                arr2.add(arr2.get(0));
                arr2.add(arr1.get(0));
            }
            arr1.remove(0);
            arr2.remove(0);

            if (arr1.size() == 0) {
                System.out.println("Second " + count);
                result = true;
                break;
            } else if (arr2.size() == 0) {
                System.out.println("First " + count);
                result = true;
                break;
            }
        }
        if (!result) System.out.println("Botva!");
    }
}