package main;

import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int x = scanner.nextInt();
        scanner.close();

        if (x > 0) {
            System.out.println("positif");
        } else if (x < 0) {
            System.out.println("negatif");
        } else {
            System.out.println("nol");
        }
    }
}
