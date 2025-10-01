import java.util.Scanner;

public class ifCetakKRS19{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("---- Cetak KRS SIAKAD ----");
        System.out.println("Apakah UKT sudah lunas? (true/false)");
        boolean uktlunas = input.nextBoolean();

        System.out.println("--- Memakai If-Else ---");
        if(uktlunas){
            System.out.println("Pembayaran UKT terverivikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan PDA\n");
        }
        else{
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu.\n");
        }

        System.out.println("--- Memakai Ternary Operator ---");

        String x = (uktlunas) ? "Pembayaran UKT terverivikasi" : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu.\n";
        System.out.println(x);
    }
}
