package Pertemuan14;
import java.util.Scanner;

public class RekapPenjualanCafe19 {
    
    static Scanner input = new Scanner(System.in);
    
    static String[] namaMenu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    
    static int[][] dataPenjualan = new int[5][7];

    public static void main(String[] args) {
        inputDataPenjualan();

        tampilkanSeluruhData();

        menuPenjualanTertinggi();

        rataRataPenjualan();
    }

    static void inputDataPenjualan() {
        System.out.println("=== Input Data Penjualan ===");
        
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println("Input penjualan untuk menu: " + namaMenu[i]);
            
            for (int j = 0; j < 7; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilkanSeluruhData() {
        System.out.println("Tabel Data Penjualan Mingguan:");
        System.out.print("Menu\t\t");
        
        for (int i = 1; i <= 7; i++) {
            System.out.print("H" + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < namaMenu.length; i++) {
            System.out.print(namaMenu[i]);
            
            if (namaMenu[i].length() < 8) System.out.print("\t\t");
            else System.out.print("\t");

            for (int j = 0; j < 7; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void menuPenjualanTertinggi() {
        int maxPenjualan = 0;
        int indexMenuTerlaris = 0;

        for (int i = 0; i < namaMenu.length; i++) {
            int totalPerMenu = 0;
            
            for (int j = 0; j < 7; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }

            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                indexMenuTerlaris = i;
            }
        }

        System.out.println("Menu dengan penjualan TERTINGGI adalah:");
        System.out.println(namaMenu[indexMenuTerlaris] + " dengan total penjualan " + maxPenjualan);
    }

    static void rataRataPenjualan() {
        System.out.println("Rata-rata penjualan per menu:");
        
        for (int i = 0; i < namaMenu.length; i++) {
            double totalPerMenu = 0;
            
            for (int j = 0; j < 7; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }
            
            double rataRata = totalPerMenu / 7;
            
            System.out.printf("- %s: %.1f\n", namaMenu[i], rataRata);
        }
    }
}