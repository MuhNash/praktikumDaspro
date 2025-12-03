package Rekursif;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = scanner.nextInt();

        int totalRekursif = hitungRekursif(n, scanner); 
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + totalRekursif);

        scanner.close();
    }

    public static int hitungRekursif(int n, Scanner sc) {
        if (n <= 0) {
            return 0;
        }

        System.out.print("Masukkan angka ke-" + n + ": ");
        int angka = sc.nextInt();

        return angka + hitungRekursif(n - 1, sc);
    }

    public static int hitungIteratif(int n, Scanner sc) {
        int total = 0;

        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            total += angka;
        }

        return total;
    }
}