package jobsheet8;

import java.util.Scanner;

public class PinggirPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Sisi Persegi: ");
        int sisi = input.nextInt();

        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                if (i == 1 || i == sisi || j == 1 || j == sisi) {
                    System.out.print(sisi + (" "));
                } else {
                System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
