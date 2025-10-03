package main;
import java.util.Scanner;

public class Find_Largest_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan b: ");
        int b = scanner.nextInt();
        System.out.print("Masukkan c: ");
        int c = scanner.nextInt();
        scanner.close();

        int terbesar = a;
        String variabelTerbesar = "a";

        if (b > terbesar) {
            terbesar = b;
            variabelTerbesar = "b";
        }

        if (c > terbesar) {
            terbesar = c;
            variabelTerbesar = "c";
        }

        System.out.println("Angka terbesar adalah " + variabelTerbesar + " = " + terbesar);
    }
}
