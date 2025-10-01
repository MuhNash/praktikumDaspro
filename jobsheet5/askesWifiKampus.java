import java.util.Scanner;

public class askesWifiKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user;
        int sks;

        System.out.print("Dosen / Mahasiswa? ");
        user = input.nextLine();

        if (user.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan sks: ");
            sks = input.nextInt();
            if (sks >= 12) {
                System.out.print("Akses diterima");
            } else{
                System.out.print("Akses ditolak");
            }
        } else{
            System.out.print("Akses diterima");
        }
    }
}
