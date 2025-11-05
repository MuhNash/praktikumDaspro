import java.util.Scanner;

public class ProsesNilai19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tertinggi = 0;
        int terendah = 100;
        double jumlahnilai = 0;
        double rata;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        int nilai[] = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            jumlahnilai += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        rata = jumlahnilai/jumlah;

        System.out.printf("Rata rata nilainya adalah: %.2f\n", rata);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Nilai tertinggi: " + tertinggi + "\n");
        for (int j = 0; j < nilai.length; j++) {
            System.out.println("Nilai Mahasiswa ke-" + (j + 1) + ": " + nilai[j]);
        }
    }
}
