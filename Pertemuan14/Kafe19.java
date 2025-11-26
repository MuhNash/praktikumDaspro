package Pertemuan14;
import java.util.Scanner;

public class Kafe19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu("Andi", true);
        
        String next;
        double total = 0;

        do {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = input.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = input.nextInt();
            
            total += hitungTotalHarga(pilihanMenu, banyakItem);
            
            input.nextLine();
            System.out.print("Apakah ingin memesan makanan lain? (y/n): ");
            next = input.nextLine();
        
        } while (next.equalsIgnoreCase("y"));

        System.out.println("\nTotal pesanan sementara: Rp" + total);
        System.out.print("Masukkan kode diskon: ");
        String kode = input.nextLine();
        
        double totalAkhir = diskon(kode, total);

        System.out.println("Total harga untuk pesanan anda: Rp" + totalAkhir);

        input.close();
    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static double hitungTotalHarga(int pilihanMenu, int banyakItem){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        if(pilihanMenu < 1 || pilihanMenu > 6){
            System.out.println("Pilihan menu tidak valid.");
            return 0;
        }

        double hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static double diskon(String kode, double total) {
        if (kode.equalsIgnoreCase("diskon50")) {
            return total * 0.5;
        } else if (kode.equalsIgnoreCase("diskon30")) {
            return total * 0.7;
        } else {
            System.out.println("Kode diskon tidak valid.");
            return total;
        }
    }
}