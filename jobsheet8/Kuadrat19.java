package jobsheet8;

import java.util.Scanner;

public class Kuadrat19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah;

        System.out.print("Jumlah kuadrat ke-");
        int kuadrat = input.nextInt();

        for (int i = 1; i <= kuadrat; i++) {
            jumlah = 0;
            for (int j = 1; j <= i; j++) {
                jumlah += j * j;
            }

            System.out.print("n: " + i + " => Jumlah Kuadrat = ");

            for (int j = 1; j <= i; j++) {
                System.out.print(j * j);
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        }
    }
}
