import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        Boolean jalan = true;

        while (jalan) {
            System.out.println("\n---- Daftar Bioskop ----");
            System.out.println("- Menu 1: Input Data Penonton");
            System.out.println("- Menu 2: Tampilkan Daftar Penonton");
            System.out.println("- Menu 3: Exit");
            System.out.print("Pilih Menu yang Mau Anda Pilih: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                while (true) {
                    System.out.print("Masukkan nama:");
                    nama = input.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = input.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = input.nextInt();
                    input.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Kursi tidak tersedia");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi, Pilih kursi lain");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        break;
                    }

                    System.out.print("Input penonton lainnya? (y/n)");
                    next = input.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris ke-" + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***");
                            } else {
                                System.out.print(penonton[i][j]);
                            }
                            if (j < penonton[i].length - 1) System.out.print(", ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("\nProgram selesai.");
                    jalan = false;
                    break;
                default:
                    System.out.println("\nPilihan tidak valid! Silakan coba lagi.");
                    break;
            }
        }
        
    }
}