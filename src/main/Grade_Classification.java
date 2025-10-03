package main;
import java.util.Scanner;

public class Grade_Classification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        scanner.close();

        if (nilai >= 0 && nilai <= 100) {
            if (nilai >= 80) {
                System.out.println("A");
            } else if (nilai >= 70) {
                System.out.println("B");
            } else if (nilai >= 60) {
                System.out.println("C");
            } else if (nilai >= 50) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } else {
            System.out.println("tidak valid");
        }
    }
}
