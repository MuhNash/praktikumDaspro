package jobsheet8;

import java.util.Scanner;

public class Star19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai n = ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print("*");
        }
    }
}