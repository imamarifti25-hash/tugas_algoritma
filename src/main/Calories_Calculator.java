package main;
import java.util.Scanner;

public class Calories_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah aktivitas: ");
        int jumlahAktivitas = scanner.nextInt();

        double totalKalori = 0.0;

        for (int i = 0; i < jumlahAktivitas; i++) {
            System.out.print("Masukkan jenis aktivitas (1=Lari, 2=Push-up, 3=Plank): ");
            int jenis = scanner.nextInt();
            System.out.print("Masukkan durasi dalam menit: ");
            double durasi = scanner.nextDouble();

            double kaloriPerMenit;
            switch (jenis) {
                case 1 -> // Lari
                    kaloriPerMenit = 60.0 / 5.0; // 12 kalori/menit
                case 2 -> // Push-up
                    kaloriPerMenit = 200.0 / 30.0; // ~6.67 kalori/menit
                case 3 -> // Plank
                    kaloriPerMenit = 5.0; // 5 kalori/menit
                default -> {
                    System.out.println("Jenis aktivitas tidak valid. Lewati.");
                    continue;
                }
            }

            double kaloriDibakar = kaloriPerMenit * durasi;
            totalKalori += kaloriDibakar;
            System.out.println("Kalori dibakar dalam aktivitas ini: " + kaloriDibakar);
        }

        System.out.println("Total kalori dibakar: " + totalKalori);
        scanner.close();
    }
}
