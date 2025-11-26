package Pertemuan14;
import java.util.Scanner;

public class NilaiMahasiswa19 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa mahasiswa yang mengikuti ujian? ");
        int jumlah = input.nextInt();

        int[] mahasiswa = new int[jumlah];
        
        isianArray(mahasiswa);

        tampilArray(mahasiswa);

        double total = hitTot(mahasiswa);
        System.out.println("Total nilai yang diinputkan adalah: " + total);
        
        input.close();
    }

    static void isianArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
    }

    static void tampilArray(int[] arr) {
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah: " + arr[i]);
        }
        System.out.println("==============================");
    }

    static double hitTot(int[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}