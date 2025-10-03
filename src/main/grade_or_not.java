package main;
import java.util.Scanner;

public class grade_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        scanner.close();

        if (nilai >= 0 && nilai <= 100) {
            if (nilai >= 70) {
                System.out.println("lulus");
            } else {
                System.out.println("gagal");
            }
        } else {
            System.out.println("tidak valid");
        }
    }
}