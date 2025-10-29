package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai, kelTinggi = 0, kelRendah = 0;
        double totalNilai, rataNilai, tertinggi = 0, terendah = 100;

        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                nilai = input.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;

            if (rataNilai < terendah) {
                terendah = rataNilai;
                kelRendah = i;
            }
            
            if(rataNilai > tertinggi) {
                tertinggi = rataNilai;
                kelTinggi = i;
            }

            System.out.println("Kelompok " + i + ": Nilai rata rata = " + rataNilai);

            i++;
        }

        System.out.println("Kelompok tertinggi adalah kelompok " + kelTinggi);
        System.out.println("Kelompok terendah adalah kelompok " + kelRendah);
    }
}
