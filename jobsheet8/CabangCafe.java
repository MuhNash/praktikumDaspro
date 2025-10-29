package jobsheet8;

import java.util.Scanner;

public class CabangCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalItem = 0;
        int totalPelanggan = 0;
        int totalItemAll = 0;

        System.out.print("Jumlah cabang kafe: ");
        int cabang = input.nextInt();

        System.out.println("=== Input Penjualan Per Cabang ===");
        for (int i = 1; i <= cabang; i++) {
            System.out.println("--- Cabang " + i + " ---");
            System.out.print("Jumlah Pelanggan: ");
            int pelanggan = input.nextInt();
            totalItem = 0;
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = input.nextInt();
                totalItem += item;
            }
            System.out.println("Cabang " + i + " :");
            System.out.println("- Pelanggan: " + pelanggan + " orang");
            System.out.println("- Item terjual: " + totalItem);
            System.out.println();

            totalItemAll += totalItem;
            totalPelanggan += pelanggan;
        }

        System.out.println("Total seluruh cabang:");
        System.out.println("Pelanggan: " + totalPelanggan);
        System.out.println("Item terjual: " + totalItemAll);
    }
}
