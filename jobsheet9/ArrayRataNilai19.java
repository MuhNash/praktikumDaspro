import java.util.Scanner;

public class ArrayRataNilai19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rataLulus;
        double rataTidakLulus;

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = input.nextInt();

        int[] nilaiMhs = new int[jumlah];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
                totalLulus += nilaiMhs[i];
            } else{
                jumlahTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }

        rataLulus = totalLulus/jumlahLulus;
        rataTidakLulus = totalTidakLulus/jumlahTidakLulus;
        System.out.println("Jumlah Mahasiswa Lulus = " + jumlahLulus);
        System.out.printf("Rata-rata Nilai Lulus = %.2f\n", rataLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus = " + jumlahTidakLulus);
        System.out.printf("Rata-rata Nilai Tidak Lulus = %.2f\n", rataTidakLulus);
    }
}
