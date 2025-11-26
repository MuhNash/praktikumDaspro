package Pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe19 {
    
    static Scanner input = new Scanner(System.in);
    
    static int jumlahMenu;
    static int jumlahHari;
    
    static String[] namaMenu;
    static int[][] dataPenjualan;

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah menu yang ingin didata: ");
        jumlahMenu = input.nextInt();
        
        System.out.print("Masukkan jumlah hari perekapan: ");
        jumlahHari = input.nextInt();
        
        input.nextLine(); 
        
        namaMenu = new String[jumlahMenu];
        dataPenjualan = new int[jumlahMenu][jumlahHari];
        
        System.out.println("\n=== Input Nama Menu ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = input.nextLine();
        }

        inputDataPenjualan();

        tampilkanSeluruhData();

        menuPenjualanTertinggi();

        rataRataPenjualan();
    }

    static void inputDataPenjualan() {
        System.out.println("\n=== Input Data Penjualan ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Input penjualan untuk menu: " + namaMenu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = input.nextInt();
            }
        }
    }

    static void tampilkanSeluruhData() {
        System.out.println("Tabel Data Penjualan:");
        System.out.print("Menu\t\t");
        
        for (int i = 1; i <= jumlahHari; i++) {
            System.out.print("H" + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print(namaMenu[i]);
            
            if (namaMenu[i].length() < 8) System.out.print("\t\t");
            else System.out.print("\t");

            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void menuPenjualanTertinggi() {
        int maxPenjualan = 0;
        int indexMenuTerlaris = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }

            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                indexMenuTerlaris = i;
            }
        }

        System.out.println("Menu dengan penjualan TERTINGGI adalah:");
        System.out.println(namaMenu[indexMenuTerlaris] + " dengan total " + maxPenjualan);
    }

    static void rataRataPenjualan() {
        System.out.println("Rata-rata penjualan per menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            double totalPerMenu = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }
        
            double rataRata = totalPerMenu / jumlahHari;
            
            System.out.printf("- %s: %.1f\n", namaMenu[i], rataRata);
        }
    }
}