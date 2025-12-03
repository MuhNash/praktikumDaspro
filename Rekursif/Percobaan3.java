package Rekursif;
import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal : ");
        saldoAwal = input.nextInt();
        System.out.print("Lamanya investasi (tahun) : ");
        tahun = input.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.print(hitungLaba(saldoAwal, tahun));
    }

    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
}
