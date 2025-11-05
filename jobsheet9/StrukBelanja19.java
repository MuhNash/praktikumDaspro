import java.util.Scanner;

public class StrukBelanja19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.print("Jumlah Pesanan: ");
        int pesanan = input.nextInt();
        String barang[] = new String[pesanan];
        int nilai[] = new int[pesanan];

        input.nextLine();
        System.out.println("==== Masukkan Pesanan ====");

        for (int i = 0; i < barang.length; i++) {
            System.out.print((i + 1) + ". Masukkan Nama Barang: ");
            barang[i] = input.nextLine();
            System.out.print((i + 1) + ". Masukkan Harga Pesanan: ");
            nilai[i] = input.nextInt();
            input.nextLine();

            total += nilai[i];
        }

        System.out.println("\n==== Jumlah pesanan: " + pesanan + " ====");
        System.out.println("Daftar Pesanan: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println((i + 1) + ". " + barang[i] + ", Harga: Rp. " + nilai[i]);
        }
        System.out.println("\nTotal Harga: Rp. " + total);
    }
}
