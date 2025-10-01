import java.util.Scanner;

public class ifCetakKRS19{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("---- Cetak KRS SIAKAD ----");
        System.out.println("Apakah UKT sudah lunas? (true/false)");
        boolean uktlunas = input.nextBoolean();

        if(uktlunas){
            System.out.println("Pembayaran UKT terverivikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan PDA");
        }
        else{
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu.");
        }
    }
}